package com.c4c.keystone.controller;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.c4c.keystone.entity.Keyst0100;
import com.c4c.keystone.entity.Keyst0100Key;
import com.c4c.keystone.entity.Keyst0300ExtraS01;
import com.c4c.keystone.entity.Keyst0310ExtraS01;
import com.c4c.keystone.form.Keyst10300DispReserveInfoS;
import com.c4c.keystone.form.Keyst10300InitS;
import com.c4c.keystone.mapper.Keyst0100Mapper;
import com.c4c.keystone.mapper.Keyst0300Mapper;
import com.c4c.keystone.mapper.Keyst0310Mapper;
import com.c4c.keystone.service.impl.Keyst10300Service;
import com.c4c.keystone.utils.JwtUtil;


@RestController
@RequestMapping("/keyst10300")
public class Keyst10300Controller {

    @Autowired
    Keyst0100Mapper Keyst0100Mapper;
    @Autowired
    Keyst0300Mapper keyst0300Mapper;
    @Autowired
    Keyst0310Mapper keyst0310Mapper;
    @Autowired
    Keyst10300Service keyst10300Service;
    @Autowired
    JwtUtil jwtUtil;

    @GetMapping("initialize")
    public ResponseEntity<Keyst10300InitS> initialize(@RequestHeader("Authorization") String jwt) {

    	Map<String, Object> loginUserInfo = jwtUtil.parseToken(jwt.substring(7));
        // ユーザーID
        Integer userId = Integer.valueOf(loginUserInfo.get(jwtUtil.USER_ID).toString());


    	// userIdでユーザーテーブルを検索し、管理者フラグが立っているかどうかで分岐
        Keyst0100Key keyst0100Key = new Keyst0100Key();
        keyst0100Key.setUserId(userId);

        Keyst10300InitS resForm = new Keyst10300InitS();

        Keyst0100 userInfo = Keyst0100Mapper.selectByPrimaryKey(keyst0100Key);

    	// 管理者
    	if (userInfo.getAdminFlg() == 0) {
    		resForm = keyst10300Service.initialize(keyst0100Key, userInfo.getAdminFlg(), null);
    	}

    	// ユーザー
    	if (userInfo.getAdminFlg() == 1) {
    		resForm = keyst10300Service.initialize(keyst0100Key, userInfo.getAdminFlg(), userInfo.getTeam());
    	}

    	resForm.setTeam(userInfo.getTeam());

    	return ResponseEntity.ok(resForm);
    }

    @GetMapping("viewComment")
    public Keyst10300InitS viewComment(Integer userId) {
        Keyst10300InitS resForm = new Keyst10300InitS();

    	List<Keyst0310ExtraS01> Keyst0310ExtraS01List = new ArrayList<Keyst0310ExtraS01>();
    	Keyst0310ExtraS01List = keyst0310Mapper.selectWithS01(userId);

        resForm.setReserveDetailList(Keyst0310ExtraS01List);

    	return resForm;

    }

    @GetMapping("changeTeam")
    public ResponseEntity<Keyst10300InitS> changeTeam(String team) {
        // レスポンスForm
        Keyst10300InitS resForm = new Keyst10300InitS();

        Keyst0300ExtraS01 Keyst0300ExtraS01 = new Keyst0300ExtraS01();
        List<Keyst0300ExtraS01> Keyst0300ExtraS01List = new ArrayList<Keyst0300ExtraS01>();

        // 現在年月を取得
        Calendar cal = Calendar.getInstance();
        String calYearStr = Integer.toString(cal.get(Calendar.YEAR));
        String calMonthStr = Integer.toString(cal.get(Calendar.MONTH)+1);
        // 月が1～9月の場合頭に0をつける(1→01)
        if (calMonthStr != "10" || calMonthStr != "11" || calMonthStr != "12") {
        	calMonthStr = "0" + calMonthStr;
        }
        String calStr = calYearStr + calMonthStr;
        Keyst0300ExtraS01.setImplYearMonth(calStr);

        Keyst0300ExtraS01.setTeam(team);

    	Keyst0300ExtraS01List = keyst0300Mapper.selectWithS02(Keyst0300ExtraS01);

        resForm.setReserveInfoList(Keyst0300ExtraS01List);

    	return ResponseEntity.ok(resForm);

    }

    @GetMapping(value = "displayReserveInfo")
    public ResponseEntity<Keyst10300DispReserveInfoS> displayReserveInfo(@RequestParam("reserveId") Integer reserveId) {
        // レスポンスForm
    	Keyst10300DispReserveInfoS resForm = keyst10300Service.displayReserveInfo(reserveId);

        return ResponseEntity.ok(resForm);
    }

}
