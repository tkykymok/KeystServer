package com.c4c.keystone.controller;

import com.c4c.keystone.form.Keyst10200DispSklShtS;
import com.c4c.keystone.form.Keyst10200InitS;
import com.c4c.keystone.service.impl.Keyst10200Service;
import com.c4c.keystone.utils.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;


@RestController
@RequestMapping("/keyst10200")
public class Keyst10200Controller {

    @Autowired
    Keyst10200Service keyst10200Service;

    @Autowired
    JwtUtil jwtUtil;

    @GetMapping("initialize")
    @CrossOrigin(origins = {"http://localhost:3000"})
    public ResponseEntity<Keyst10200InitS> initialize(@RequestHeader("Authorization") String jwt) {
        Map<String, Object> loginUserInfo = jwtUtil.parseToken(jwt.substring(7));
        // ログインユーザー情報の取得サンプル
        System.out.println(loginUserInfo.get(jwtUtil.LOGIN_ID));
        System.out.println(loginUserInfo.get(jwtUtil.USER_ID));
        System.out.println(loginUserInfo.get(jwtUtil.ADMIN_FLG));

        // ユーザーID
        Integer userId = Integer.valueOf(loginUserInfo.get(jwtUtil.USER_ID).toString());

        // レスポンスForm
        Keyst10200InitS resForm = keyst10200Service.initialize(userId);

        return ResponseEntity.ok(resForm);
    }

    @GetMapping(value = "displaySkillSheet")
    @CrossOrigin(origins = {"http://localhost:3000"})
    public ResponseEntity<Keyst10200DispSklShtS> displaySkillSheet(@RequestParam("skillSheetId") Integer skillSheetId) {
        // レスポンスForm
        Keyst10200DispSklShtS resForm = keyst10200Service.displaySkillSheet(skillSheetId);

        return ResponseEntity.ok(resForm);
    }





}
