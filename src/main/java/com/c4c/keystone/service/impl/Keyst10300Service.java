package com.c4c.keystone.service.impl;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.c4c.keystone.entity.Keyst0300;
import com.c4c.keystone.entity.Keyst0300ExtraS01;
import com.c4c.keystone.entity.Keyst0310;
import com.c4c.keystone.entity.Keyst0310ExtraS01;
import com.c4c.keystone.form.Keyst10300InitS;
import com.c4c.keystone.form.Keyst10300SaveQ;
import com.c4c.keystone.form.Keyst10300SaveQ1;
import com.c4c.keystone.form.Keyst10300UpdateQ;
import com.c4c.keystone.mapper.Keyst0300Mapper;
import com.c4c.keystone.mapper.Keyst0310Mapper;
import com.c4c.keystone.mapper.Keyst0320Mapper;
import com.c4c.keystone.service.IKeyst10300Service;
import com.c4c.keystone.utils.EntityUtil;
import com.c4c.keystone.utils.JwtUtil;

import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
public class Keyst10300Service implements IKeyst10300Service {

    @Autowired
    Keyst0300Mapper keyst0300Mapper;
    @Autowired
    Keyst0310Mapper keyst0310Mapper;
    @Autowired
    Keyst0320Mapper keyst0320Mapper;

    @Autowired
    protected MessageSource messageSource;
    @Autowired
    JwtUtil jwtUtil;
    @Autowired
    EntityUtil entityUtil;

    @Override
    @Transactional
    public Keyst10300InitS initialize(int userId, Integer adminFlg, String team) {
        // レスポンスForm
        Keyst10300InitS resForm = new Keyst10300InitS();

        Keyst0300ExtraS01 Keyst0300ExtraS01 = new Keyst0300ExtraS01();
        List<Keyst0300ExtraS01> Keyst0300ExtraS01List = new ArrayList<Keyst0300ExtraS01>();
        List<Keyst0310ExtraS01> Keyst0310ExtraS01List = new ArrayList<Keyst0310ExtraS01>();

        // 現在年月を取得
        Calendar cal = Calendar.getInstance();
        String calYearStr = Integer.toString(cal.get(Calendar.YEAR));
        String calMonthStr = Integer.toString(cal.get(Calendar.MONTH)+1);
        resForm.setThisMonth(calMonthStr);
        // 月が1～9月の場合頭に0をつける(1→01)
        if (calMonthStr != "10" || calMonthStr != "11" || calMonthStr != "12") {
        	calMonthStr = "0" + calMonthStr;
        }
        String calStr = calYearStr + calMonthStr;

        // 管理者
        if (adminFlg == 0) {
        	Keyst0300ExtraS01.setManagerId(userId);
        	Keyst0300ExtraS01List = keyst0300Mapper.selectWithS01(Keyst0300ExtraS01);

        	// 実施月リストを作成
        	List<String> impleYearMonthList = new ArrayList<String>();
        	impleYearMonthList = Keyst0300ExtraS01List.stream().map(i -> i.getImplYearMonth()).distinct().collect(Collectors.toList());
        	if (!impleYearMonthList.get(0).equals(calStr)) {
        		impleYearMonthList.add(calStr);
        	}
        	resForm.setImplYearMonthList(impleYearMonthList);

        	// 当月の予約状況
        	Keyst0300ExtraS01List = Keyst0300ExtraS01List.stream().filter(i -> i.getImplYearMonth().equals(calStr)).collect(Collectors.toList());

        } // ユーザー
        else if (adminFlg == 1) {
        	Keyst0300ExtraS01.setTeam(team);
        	Keyst0300ExtraS01.setImplYearMonth(calStr);
        	Keyst0300ExtraS01List = keyst0300Mapper.selectWithS02(Keyst0300ExtraS01);

        	Keyst0310ExtraS01List = keyst0310Mapper.selectWithS01(userId);
        }

        resForm.setReserveInfoList(Keyst0300ExtraS01List);
        resForm.setReserveDetailList(Keyst0310ExtraS01List);

         return resForm;
    }

    @Override
    @Transactional
    public void save(String jwt, Keyst10300SaveQ reqForm) {
        // ログインユーザー情報
        Map<String, Object> loginUserInfo = jwtUtil.parseToken(jwt.substring(7));
        // ユーザーID
        Integer loginUserId = Integer.valueOf(loginUserInfo.get(jwtUtil.USER_ID).toString());

        Keyst0300 keyst0300 = new Keyst0300();
        Keyst0310 keyst0310 = new Keyst0310();

        //「2021-10-01」を「202110」にする
        String impleYearMonth = reqForm.getReserveDate().replace("-", "");
        String _impleYearMonth = impleYearMonth.substring(0, 6);

        keyst0300.setImplYearMonth(_impleYearMonth); // 実施年月
        keyst0300.setManagerId(loginUserId); //  管理者ID

        keyst0300.setTeam(reqForm.getTeam()); //  チーム
        keyst0300.setCreatedUser(loginUserId); // 作成者ID

        LocalDate reserveDate = LocalDate.parse(reqForm.getReserveDate(), DateTimeFormatter.ofPattern("yyyy-MM-dd"));

        keyst0310.setReserveDate(reserveDate); // 実施年月

        LocalTime fromTime = LocalTime.parse(reqForm.getFromTime(), DateTimeFormatter.ofPattern("HH:mm:ss"));
        LocalTime toTime = LocalTime.parse(reqForm.getToTime(), DateTimeFormatter.ofPattern("HH:mm:ss"));

        // INSERT時共通フィールドを設定する。
        entityUtil.setColumns4Insert(keyst0300, loginUserId);
        entityUtil.setColumns4Insert(keyst0310, loginUserId);

        keyst0300Mapper.insert(keyst0300);

        // fromからtoまでの時間で30分毎で区切ってinsertをかける
        while (fromTime.compareTo(toTime) <= 0) {
        	keyst0310.setReserveTime(fromTime);
        	keyst0310Mapper.insert(keyst0310);

        	// 次のループでは30分足した時間をセットする
        	fromTime = fromTime.plusMinutes(30);
        }
    }

    @Override
    @Transactional
    public void reserve(String jwt, Keyst10300SaveQ1 reqForm) {
    	// ログインユーザー情報
    	Map<String, Object> loginUserInfo = jwtUtil.parseToken(jwt.substring(7));
    	// ユーザーID
    	Integer loginUserId = Integer.valueOf(loginUserInfo.get(jwtUtil.USER_ID).toString());

    	Keyst0310 keyst0310 = new Keyst0310();

    	keyst0310.setReserveId(reqForm.getReserveId()); // リザーブID
    	keyst0310.setReserveDate(reqForm.getReserveDate()); // 予約日
    	keyst0310.setReserveTime(reqForm.getReserveTime()); // 予約時間

    	keyst0310.setUserId(loginUserId); // ユーザーID
    	keyst0310.setFeeling(reqForm.getFeeling()); // ワタシノキモチ
    	keyst0310.setRemark(reqForm.getRemark()); // ワタシノキモチ

        // UPDATE時共通フィールドを設定する。
        entityUtil.setColumns4Update(keyst0310, loginUserId);

    	keyst0310Mapper.updateByPrimaryKey(keyst0310);
    }

    @Override
    @Transactional
   public void saveComment(String jwt, Keyst10300UpdateQ reqForm) {
    	// ログインユーザー情報
    	Map<String, Object> loginUserInfo = jwtUtil.parseToken(jwt.substring(7));
        // ユーザーID
        Integer loginUserId = Integer.valueOf(loginUserInfo.get(jwtUtil.USER_ID).toString());
    	// 管理者フラグ
        Integer adminFlg = Integer.valueOf(loginUserInfo.get(jwtUtil.ADMIN_FLG).toString());

    	Keyst0310 keyst0310 = new Keyst0310();

        keyst0310.setReserveId(reqForm.getReserveId()); // リザーブID
        keyst0310.setUserId(loginUserId); // ユーザーID
        keyst0310.setReserveDate(reqForm.getReserveDate()); // 予約日
        keyst0310.setReserveTime(reqForm.getReserveTime()); // 予約時間

        // DBの情報を取る
        Keyst0310 keyst0310DB = keyst0310Mapper.selectByPrimaryKey(keyst0310);
        keyst0310.setRemark(keyst0310DB.getRemark()); // 備考
        keyst0310.setFeeling(keyst0310DB.getFeeling()); // ワタシノキモチ

        // UPDATE時共通フィールドを設定する。
        entityUtil.setColumns4Update(keyst0310, loginUserId);

        // 管理者
    	if (adminFlg == 0) {
    		keyst0310.setUserComment(keyst0310DB.getUserComment()); // DBのユーザーコメント
    		keyst0310.setManagerComment(reqForm.getManagerComment()); // 管理者コメント
    		keyst0310Mapper.updateByPrimaryKey(keyst0310);
    	}

    	// ユーザー
    	if (adminFlg == 1) {
    		keyst0310.setManagerComment(keyst0310DB.getManagerComment()); // DBの管理者コメント
    		keyst0310.setUserComment(reqForm.getUserComment()); // ユーザーコメント
    		keyst0310Mapper.updateByPrimaryKey(keyst0310);
    	}
    }

    @Override
   	@Transactional
   	public void delReserve(String jwt, Keyst10300UpdateQ reqForm) {
    	// ログインユーザー情報
    	Map<String, Object> loginUserInfo = jwtUtil.parseToken(jwt.substring(7));
        // ユーザーID
        Integer loginUserId = Integer.valueOf(loginUserInfo.get(jwtUtil.USER_ID).toString());
    	Integer adminFlg = Integer.valueOf(loginUserInfo.get(jwtUtil.ADMIN_FLG).toString());

    	Keyst0300 keyst0300 = new Keyst0300();
    	Keyst0310 keyst0310 = new Keyst0310();

    	keyst0300.setReserveId(reqForm.getReserveId()); // リザーブID

        keyst0310.setReserveId(reqForm.getReserveId()); // リザーブID
        keyst0310.setReserveDate(reqForm.getReserveDate()); // 予約日
        keyst0310.setReserveTime(reqForm.getReserveTime()); // 予約時間

        // 管理者
    	if (adminFlg == 0) {
    		keyst0300Mapper.deleteByPrimaryKey(keyst0300);
    		keyst0310Mapper.deleteByPrimaryKey(keyst0310);
    	}

    	// ユーザー
    	if (adminFlg == 1) {
            // UPDATE時共通フィールドを設定する。
            entityUtil.setColumns4Update(keyst0310, loginUserId);
    		keyst0310Mapper.updateByPrimaryKey(keyst0310);
    	}
    }

}
