package com.c4c.keystone.service.impl;

import com.c4c.keystone.constants.Flag;
import com.c4c.keystone.entity.*;
import com.c4c.keystone.form.*;
import com.c4c.keystone.mapper.Keyst0100Mapper;
import com.c4c.keystone.mapper.Keyst0300Mapper;
import com.c4c.keystone.mapper.Keyst0310Mapper;
import com.c4c.keystone.mapper.Keyst0320Mapper;
import com.c4c.keystone.service.IKeyst10300Service;
import com.c4c.keystone.utils.EntityUtil;
import com.c4c.keystone.utils.JwtUtil;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@Service
@Log4j2
public class Keyst10300Service implements IKeyst10300Service {

    @Autowired
    Keyst0100Mapper keyst0100Mapper;
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
    public Keyst10300InitS initialize(String jwt, String yearMonth) {
        // ログインユーザー情報
        Map<String, Object> loginUserInfo = jwtUtil.parseToken(jwt.substring(7));
        // 管理者フラグ
        boolean isAdmin = loginUserInfo.get(jwtUtil.ADMIN_FLG) == Flag.ON;
        // ログインユーザーID
        Integer loginUserId = Integer.valueOf(loginUserInfo.get(jwtUtil.USER_ID).toString());
        // レスポンスForm
        Keyst10300InitS resForm = new Keyst10300InitS();

        // 現在年月を取得
        String today = LocalDate.now().toString();
        String thisMonth = today.replace("-", "").substring(0, 6);

        Keyst0300ExtraS01 Keyst0300ExtraS01 = new Keyst0300ExtraS01();
        // 実施年月の設定
        if (Objects.isNull(yearMonth)) {
            // 引数に年月が渡されていない場合
            Keyst0300ExtraS01.setImplYearMonth(thisMonth); // 実施年月
        } else {
            // 引数に年月が渡されている場合
            Keyst0300ExtraS01.setImplYearMonth(yearMonth); // 実施年月
        }

        List<Keyst0300ExtraS01> keyst0300ExtraS01List;
        if (isAdmin) {
            // 管理者の場合
            // 1on1予約ヘッダーExtraEntityに以下の値を設定する。
            Keyst0300ExtraS01.setManagerId(loginUserId); // 管理者ID
            // 1on1予約ヘッダーMapperのExtraS01検索メソッドを呼び出す。
            keyst0300ExtraS01List = keyst0300Mapper.selectWithS01(Keyst0300ExtraS01);
            // レスポンスFormに以下の値を設定する。
            if (!keyst0300ExtraS01List.isEmpty()) {
                resForm.setTeam(keyst0300ExtraS01List.get(0).getTeam()); // 対象チーム
            }
        } else {
            // 管理者でない場合(一般ユーザー)
            // 自身の所属チームを取得するため、ログインユーザーのユーザー基本情報を取得する。
            Keyst0100 keyst0100 = new Keyst0100();
            keyst0100.setUserId(loginUserId); // ログインユーザーID
            keyst0100 = keyst0100Mapper.selectByPrimaryKey(keyst0100);
            // レスポンスForm(initS)に以下の値を設定する。
            resForm.setTeam(keyst0100.getTeam()); // チーム

            // 1on1予約ヘッダーExtraEntityに以下の値を設定する。
            Keyst0300ExtraS01.setTeam(keyst0100.getTeam()); // チーム
            // 1on1予約ヘッダーMapperのExtraS02検索メソッドを呼び出す。
            keyst0300ExtraS01List = keyst0300Mapper.selectWithS02(Keyst0300ExtraS01);

            ////////////////////////
            // コメント履歴一覧の取得
            ////////////////////////
            Keyst0300ExtraS04 keyst0300ExtraS04 = new Keyst0300ExtraS04();
            keyst0300ExtraS04.setUserId(loginUserId); // ユーザーID
            List<Keyst0300ExtraS04> keyst0300ExtraS04List = keyst0300Mapper.selectWithS04(keyst0300ExtraS04);

            // 取得したコメント履歴一覧をレスポンスFormに移送する。
            List<Keyst10300InitS02> keyst10300InitS02List = new ArrayList<>();
            for (Keyst0300ExtraS04 extraS04 : keyst0300ExtraS04List) {
                Keyst10300InitS02 keyst10300InitS02 = new Keyst10300InitS02();
                BeanUtils.copyProperties(extraS04, keyst10300InitS02);
                keyst10300InitS02List.add(keyst10300InitS02);
            }
            resForm.setCommentHistoryList(keyst10300InitS02List); // コメント履歴一覧
        }

        // 検索結果をレスポンスForm(initS)に移送する。
        List<Keyst10300InitS01> reserveInfoList = new ArrayList<>();
        for (Keyst0300ExtraS01 keyst0300ExtraS01 : keyst0300ExtraS01List) {
            Keyst10300InitS01 keyst10300InitS1 = new Keyst10300InitS01();
            BeanUtils.copyProperties(keyst0300ExtraS01, keyst10300InitS1);
            reserveInfoList.add(keyst10300InitS1);
        }

        // レスポンスFormに以下の値を設定する。
        if (!keyst0300ExtraS01List.isEmpty()) {
            resForm.setReserveId(reserveInfoList.get(0).getReserveId()); // 予約ID
        }
        resForm.setThisMonth(thisMonth); // 当月
        resForm.setReserveInfoList(reserveInfoList); // 予約情報一覧

        return resForm;
    }

    @Override
    @Transactional
    public void save(String jwt, Keyst10300SaveQ reqForm) {
        // ログインユーザー情報
        Map<String, Object> loginUserInfo = jwtUtil.parseToken(jwt.substring(7));
        // ユーザーID
        Integer loginUserId = Integer.valueOf(loginUserInfo.get(jwtUtil.USER_ID).toString());

        // 予約ID
        Integer reserveId = reqForm.getReserveId();
        ///////////////////////////////
        // 1on1予約ヘッダー登録
        ///////////////////////////////
        // 予約IDに値が設定されていない場合INSERTを実行する。
        if (Objects.isNull(reserveId)) {
            // 1on1予約ヘッダーEntityに以下の値を設定する。
            Keyst0300 keyst0300 = new Keyst0300();
            //「2021-10-01」を「202110」にする
            String implYearMonth = reqForm.getReserveDate().toString()
                    .replace("-", "")
                    .substring(0, 6);
            keyst0300.setImplYearMonth(implYearMonth); // 実施年月
            keyst0300.setManagerId(loginUserId); //  管理者ID
            keyst0300.setTeam(reqForm.getTeam()); //  チーム
            // INSERT時共通フィールドを設定する。
            entityUtil.setColumns4Insert(keyst0300, loginUserId);
            keyst0300Mapper.insert(keyst0300);

            // 登録した1on1予約ヘッダーの予約IDを取得する。
            Keyst0300Example keyst0300Example = new Keyst0300Example();
            keyst0300Example.createCriteria()
                    .andManagerIdEqualTo(loginUserId) // ユーザーID(管理者)
                    .andImplYearMonthEqualTo(implYearMonth); // 実施年月
            List<Keyst0300> keyst0300List = keyst0300Mapper.selectByExample(keyst0300Example);
            reserveId = keyst0300List.get(0).getReserveId();
        }

        ///////////////////////////////
        // 1on1予約明細登録
        ///////////////////////////////
        // 1on1予約明細Entityに以下の値を設定する。
        Keyst0310 keyst0310 = new Keyst0310();
        keyst0310.setReserveId(reserveId); // 予約ID
        keyst0310.setReserveDate(reqForm.getReserveDate()); // 予約日
        // INSERT時共通フィールドを設定する。
        entityUtil.setColumns4Insert(keyst0310, loginUserId);

        LocalTime fromTime = reqForm.getFromTime(); // 開始時間
        LocalTime toTime = reqForm.getToTime(); // 終了時間
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
    public void cancelReserve(String jwt, Keyst10300CancelQ reqForm) {
        // ログインユーザー情報
        Map<String, Object> loginUserInfo = jwtUtil.parseToken(jwt.substring(7));
        // ユーザーID
        Integer loginUserId = Integer.valueOf(loginUserInfo.get(jwtUtil.USER_ID).toString());
        Integer adminFlg = Integer.valueOf(loginUserInfo.get(jwtUtil.ADMIN_FLG).toString());

        // バージョンチェック
        Keyst0310 keyst0310 = new Keyst0310();
        keyst0310.setReserveId(reqForm.getReserveId()); // 予約ID
        keyst0310.setReserveDate(reqForm.getReserveDate()); // 予約日
        keyst0310.setReserveTime(reqForm.getReserveTime()); // 予約時間
        keyst0310.setVersionExKey(reqForm.getVersionExKey()); // 排他制御絡む



    }

    @Override
    public void deleteLine(String jwt, Keyst10300DeleteQ reqForm) {

    }

    //
//    @Override
//    @Transactional
//    public void delReserve(String jwt, Keyst10300UpdateQ reqForm) {
//        // ログインユーザー情報
//        Map<String, Object> loginUserInfo = jwtUtil.parseToken(jwt.substring(7));
//        // ユーザーID
//        Integer loginUserId = Integer.valueOf(loginUserInfo.get(jwtUtil.USER_ID).toString());
//        Integer adminFlg = Integer.valueOf(loginUserInfo.get(jwtUtil.ADMIN_FLG).toString());
//
//        Keyst0300 keyst0300 = new Keyst0300();
//        Keyst0310 keyst0310 = new Keyst0310();
//
//        keyst0300.setReserveId(reqForm.getReserveId()); // リザーブID
//
//        keyst0310.setReserveId(reqForm.getReserveId()); // リザーブID
//        keyst0310.setReserveDate(reqForm.getReserveDate()); // 予約日
//        keyst0310.setReserveTime(reqForm.getReserveTime()); // 予約時間
//
//        // 管理者
//        if (adminFlg == 0) {
//            keyst0300Mapper.deleteByPrimaryKey(keyst0300);
//            keyst0310Mapper.deleteByPrimaryKey(keyst0310);
//        }
//
//        // ユーザー
//        if (adminFlg == 1) {
//            // UPDATE時共通フィールドを設定する。
//            entityUtil.setColumns4Update(keyst0310, loginUserId);
//            keyst0310Mapper.updateByPrimaryKey(keyst0310);
//        }
//    }

}
