package com.c4c.keystone.controller;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.http.ResponseEntity;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.c4c.keystone.entity.Keyst0100Key;
import com.c4c.keystone.entity.Keyst0300ExtraS01;
import com.c4c.keystone.form.Keyst10300InitS;
import com.c4c.keystone.form.Keyst10300SaveQ;
import com.c4c.keystone.form.Keyst10300SaveQ1;
import com.c4c.keystone.form.Keyst10300UpdateQ;
import com.c4c.keystone.form.ResponseFormBase;
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
    @Autowired
    protected MessageSource messageSource;

    @GetMapping("initialize")
    public ResponseEntity<Keyst10300InitS> initialize(@RequestHeader("Authorization") String jwt) {

    	Map<String, Object> loginUserInfo = jwtUtil.parseToken(jwt.substring(7));
        // ユーザーID
        Integer userId = Integer.valueOf(loginUserInfo.get(jwtUtil.USER_ID).toString());
        Integer adminFlg = Integer.valueOf(loginUserInfo.get(jwtUtil.ADMIN_FLG).toString());

        Keyst10300InitS resForm = new Keyst10300InitS();

        Keyst0100Key keyst0100Key = new Keyst0100Key();
        keyst0100Key.setUserId(userId);
        String team = Keyst0100Mapper.selectByPrimaryKey(keyst0100Key).getTeam();

    	// 管理者
    	if (adminFlg == 0) {
    		resForm = keyst10300Service.initialize(userId ,adminFlg, null);
    	}

    	// ユーザー
    	if (adminFlg == 1) {
    		resForm = keyst10300Service.initialize(userId, adminFlg, team);
    	}

    	resForm.setTeam(team);

    	return ResponseEntity.ok(resForm);
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

    @GetMapping("changeMonth")
    public ResponseEntity<Keyst10300InitS> changeMonth(@RequestHeader("Authorization") String jwt, String month) {
    	Map<String, Object> loginUserInfo = jwtUtil.parseToken(jwt.substring(7));
        // ユーザーID
        Integer userId = Integer.valueOf(loginUserInfo.get(jwtUtil.USER_ID).toString());

    	// レスポンスForm
    	Keyst10300InitS resForm = new Keyst10300InitS();

    	Keyst0300ExtraS01 Keyst0300ExtraS01 = new Keyst0300ExtraS01();
    	List<Keyst0300ExtraS01> Keyst0300ExtraS01List = new ArrayList<Keyst0300ExtraS01>();

    	Keyst0300ExtraS01.setManagerId(userId);
    	Keyst0300ExtraS01.setImplYearMonth(month);

    	Keyst0300ExtraS01List = keyst0300Mapper.selectWithS03(Keyst0300ExtraS01);

    	if (!CollectionUtils.isEmpty(Keyst0300ExtraS01List)) {
    		resForm.setTeam(Keyst0300ExtraS01List.get(0).getTeam());
    	}

    	resForm.setReserveInfoList(Keyst0300ExtraS01List);

    	return ResponseEntity.ok(resForm);

    }

    @PostMapping(value = "save")
    public ResponseEntity<ResponseFormBase> save(@RequestHeader("Authorization") String jwt, @RequestBody @Valid Keyst10300SaveQ reqForm) {
    	keyst10300Service.save(jwt, reqForm);
    	ResponseFormBase resForm = new ResponseFormBase() {};
        resForm.setMessages(messageSource.getMessage("I00001", new String[]{"登録"}, Locale.JAPAN));
        return ResponseEntity.ok(resForm);
    }

    @PostMapping(value = "reserve")
    public ResponseEntity<ResponseFormBase> reserve(@RequestHeader("Authorization") String jwt, @RequestBody @Valid Keyst10300SaveQ1 reqForm) {
    	keyst10300Service.reserve(jwt, reqForm);
    	ResponseFormBase resForm = new ResponseFormBase() {};
    	resForm.setMessages(messageSource.getMessage("I00001", new String[]{"予約"}, Locale.JAPAN));
    	return ResponseEntity.ok(resForm);
    }

    @PostMapping(value = "saveComment")
    public ResponseEntity<ResponseFormBase> saveComment(@RequestHeader("Authorization") String jwt, @RequestBody @Valid Keyst10300UpdateQ reqForm) {
        keyst10300Service.saveComment(jwt, reqForm);
        ResponseFormBase resForm = new ResponseFormBase() {};
        resForm.setMessages(messageSource.getMessage("I00001", new String[]{"登録"}, Locale.JAPAN));
        return ResponseEntity.ok(resForm);
    }

    @PostMapping(value = "delReserve")
    public ResponseEntity<ResponseFormBase> delReserve(@RequestHeader("Authorization") String jwt, @RequestBody @Valid Keyst10300UpdateQ reqForm) {
    	keyst10300Service.delReserve(jwt, reqForm);
    	ResponseFormBase resForm = new ResponseFormBase() {};
    	resForm.setMessages(messageSource.getMessage("I00001", new String[]{"削除"}, Locale.JAPAN));
    	return ResponseEntity.ok(resForm);
    }

}
