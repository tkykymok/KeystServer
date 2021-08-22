package com.c4c.keystone.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.c4c.keystone.entity.Keyst0100;
import com.c4c.keystone.entity.Keyst0100Key;
import com.c4c.keystone.form.Keyst10300DispReserveInfoS;
import com.c4c.keystone.form.Keyst10300InitS;
import com.c4c.keystone.mapper.Keyst0100Mapper;
import com.c4c.keystone.service.impl.Keyst10300Service;


@RestController
@RequestMapping("/keyst10300")
public class Keyst10300Controller {

    @Autowired
    Keyst0100Mapper Keyst0100Mapper;
    @Autowired
    Keyst10300Service keyst10300Service;

    @GetMapping("initialize")
    public ResponseEntity<Keyst10300InitS> initialize(@RequestParam("userId") Integer userId) {

    	// userIdでユーザーテーブルを検索し、管理者フラグが立っているかどうかで分岐
        Keyst0100Key keyst0100Key = new Keyst0100Key();
        keyst0100Key.setUserId(userId);

    	Keyst0100 userInfo = Keyst0100Mapper.selectByPrimaryKey(keyst0100Key);
    	Keyst10300InitS resForm = new Keyst10300InitS();

    	// 管理者
//    	if (userInfo.getAdminFlg() == "1") {
    		resForm = keyst10300Service.initialize(keyst0100Key);
//    	}

    	// ユーザー
    	// TODO: SQL作成
//    	if (userInfo.getAdminFlg() == "0") {
//        resForm = keyst10300Service.initialize(userId);
//    	}
        return ResponseEntity.ok(resForm);
    }

    @GetMapping(value = "displayReserveInfo")
    public ResponseEntity<Keyst10300DispReserveInfoS> displayReserveInfo(@RequestParam("reserveId") Integer reserveId) {
        // レスポンスForm
    	Keyst10300DispReserveInfoS resForm = keyst10300Service.displayReserveInfo(reserveId);

        return ResponseEntity.ok(resForm);
    }

}
