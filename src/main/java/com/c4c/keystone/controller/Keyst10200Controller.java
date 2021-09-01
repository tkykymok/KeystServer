package com.c4c.keystone.controller;

import com.c4c.keystone.constants.Flag;
import com.c4c.keystone.exception.ExclusiveException;
import com.c4c.keystone.form.*;
import com.c4c.keystone.mapper.Keyst0200Mapper;
import com.c4c.keystone.mapper.Keyst0210Mapper;
import com.c4c.keystone.service.impl.Keyst10200Service;
import com.c4c.keystone.utils.JwtUtil;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Locale;
import java.util.Map;


@RestController
@RequestMapping("/keyst10200")
@Log4j2
public class Keyst10200Controller {

    @Autowired
    Keyst10200Service keyst10200Service;
    @Autowired
    Keyst0200Mapper keyst0200Mapper;
    @Autowired
    Keyst0210Mapper keyst0210Mapper;
    @Autowired
    protected MessageSource messageSource;

    @Autowired
    JwtUtil jwtUtil;

    @GetMapping("initialize")
    public ResponseEntity<Keyst10200InitS> initialize(@RequestHeader("Authorization") String jwt, @RequestParam(value = "userId", required = false) Integer givenUserId) {
        Map<String, Object> loginUserInfo = jwtUtil.parseToken(jwt.substring(7));
        // ログインユーザー情報の取得サンプル
        System.out.println(loginUserInfo.get(jwtUtil.LOGIN_ID));
        System.out.println(loginUserInfo.get(jwtUtil.USER_ID));
        System.out.println(loginUserInfo.get(jwtUtil.ADMIN_FLG));

        // 管理者フラグ
        boolean isAdmin = loginUserInfo.get(jwtUtil.ADMIN_FLG) == Flag.ON;
        // スキルシート表示対象ユーザーID
        Integer userId = null;

        if (givenUserId != null && isAdmin) {
            // userIdがリクエストに設定されている、かつ管理者の場合
            // リクエストに設定されているuserIdを使用する。
            userId = givenUserId;
        } else {
            // それ以外の場合
            // 自身のuserIdを使用する。
            userId = Integer.valueOf(loginUserInfo.get(jwtUtil.USER_ID).toString());
        }

        // レスポンスForm
        Keyst10200InitS resForm = keyst10200Service.initialize(userId);

        return ResponseEntity.ok(resForm);
    }

    @GetMapping(value = "displaySkillSheet")
    public ResponseEntity<Keyst10200DispSklShtS> displaySkillSheet(@RequestParam("skillSheetId") Integer skillSheetId) {
        // レスポンスForm
        Keyst10200DispSklShtS resForm = keyst10200Service.displaySkillSheet(skillSheetId);

        return ResponseEntity.ok(resForm);
    }

    @PostMapping(value = "save")
    public ResponseEntity<Keyst10200SaveS> save(@RequestHeader("Authorization") String jwt, @RequestBody @Valid Keyst10200SaveQ reqForm) {
        // レスポンスForm
        Keyst10200SaveS resForm = keyst10200Service.save(jwt, reqForm);
        resForm.setMessages(messageSource.getMessage("I00001", new String[]{"新規保存"}, Locale.JAPAN));
        return ResponseEntity.ok(resForm);
    }

    @PostMapping(value = "update")
    public ResponseEntity<Keyst10200UpdateS> update(@RequestHeader("Authorization") String jwt, @RequestBody @Valid Keyst10200UpdateQ reqForm) throws ExclusiveException {
        // レスポンスForm
        Keyst10200UpdateS resForm = keyst10200Service.update(jwt, reqForm);
        resForm.setMessages(messageSource.getMessage("I00001", new String[]{"更新"}, Locale.JAPAN));
        return ResponseEntity.ok(resForm);
    }


}
