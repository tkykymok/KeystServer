package com.c4c.keystone.controller;

import com.c4c.keystone.constants.Flag;
import com.c4c.keystone.entity.*;
import com.c4c.keystone.exception.ExclusiveException;
import com.c4c.keystone.form.*;
import com.c4c.keystone.mapper.Keyst0200Mapper;
import com.c4c.keystone.mapper.Keyst0210Mapper;
import com.c4c.keystone.service.impl.Keyst10200Service;
import com.c4c.keystone.utils.JwtUtil;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.stream.Collectors;


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
    public ResponseEntity<Keyst10200DispSklShtS> displaySkillSheet(@RequestParam("skillSheetId") Integer skillSheetId) {
        // レスポンスForm
        Keyst10200DispSklShtS resForm = keyst10200Service.displaySkillSheet(skillSheetId);

        return ResponseEntity.ok(resForm);
    }

    @PostMapping(value = "save")
    public ResponseEntity<?> save(@RequestBody @Valid Keyst10200SaveQ reqForm, @RequestHeader("Authorization") String jwt) {

        // ログインユーザー情報
        Map<String, Object> loginUserInfo = jwtUtil.parseToken(jwt.substring(7));
        // ユーザーID
        Integer userId = Integer.valueOf(loginUserInfo.get(jwtUtil.USER_ID).toString());

        // リクエストFormをスキルシートヘッダEntityに移送する。
        Keyst0200 keyst0200 = new Keyst0200();
        BeanUtils.copyProperties(reqForm, keyst0200);
        // スキルシートヘッダEntityに以下の値を設定する。
        keyst0200.setUserId(userId); // ユーザーID
        keyst0200.setSkillSheetRegDatetime(LocalDateTime.now()); // スキルシート登録日時
        keyst0200.setDeleteFlg(Flag.OFF); // 削除フラグ
        log.info(keyst0200);
        // WHOカラムの設定

        keyst0200Mapper.insert(keyst0200);

        // リクエストFormをスキルシート明細Entityに移送する。
        List<Keyst10200SaveQ1> skillSheetDetail = reqForm.getSkillSheetDetail();
        int index = 0;
        for (Keyst10200SaveQ1 keyst10200SaveQ1 : skillSheetDetail) {
            Keyst0210 keyst0210 = new Keyst0210();
            BeanUtils.copyProperties(keyst10200SaveQ1, keyst0210);
            // スキルシート明細Entityに以下の値を設定する。
            keyst0210.setSkillSheetId(keyst0200.getSkillSheetId()); // スキルシートID
            keyst0210.setRefNo(index);
            // devScale, fwMwTool, pgLang はList→Stringに変換してセットする必要あり。
            // devScale
            String tempDevScale = String.join(",", keyst10200SaveQ1.getDevScale());
            keyst0210.setDevScale(tempDevScale);
            // fwMwTool
            String tempFwMwTool = String.join(",", keyst10200SaveQ1.getFwMwTool());
            keyst0210.setFwMwTool(tempFwMwTool);
            // pgLang
            String tempPgLang = keyst10200SaveQ1.getPgLang().stream()
                    .map(Object::toString)
                    .collect(Collectors.joining(","));
            keyst0210.setPgLang(tempPgLang);

            // WHOカラムの設定

            log.info(keyst0210);
            index++;
            // INSERTを実行する。
            keyst0210Mapper.insert(keyst0210);
        }

        return null;
    }

    @PostMapping(value = "update")
    public ResponseEntity<?> update(@RequestBody @Valid Keyst10200UpdateQ reqForm) throws ExclusiveException {

        // バージョンチェック
        Keyst0200 keyst0200 = new Keyst0200();
        keyst0200.setSkillSheetId(reqForm.getSkillSheetId()); // スキルシートID
        keyst0200.setVersionExKey(reqForm.getVersionExKey()); // 排他制御カラム
        keyst0200 = keyst0200Mapper.checkVersion(keyst0200);
        if (keyst0200 == null) {
            throw new ExclusiveException(messageSource.getMessage("E00003", null, Locale.JAPAN));
        }
        log.info(keyst0200);
        // リクエストFormをスキルシートヘッダEntityに移送する。
        BeanUtils.copyProperties(reqForm, keyst0200);
        // WHOカラムの設定

        // UPDATEを実行する。
        keyst0200Mapper.updateByPrimaryKey(keyst0200);

        // スキルシートIDに紐づく、既存のスキルシート明細全件を削除する。
        Keyst0210Example keyst0210Example = new Keyst0210Example();
        keyst0210Example.createCriteria()
                .andSkillSheetIdEqualTo(keyst0200.getSkillSheetId()); // スキルシートID
        keyst0210Mapper.deleteByExample(keyst0210Example);

        // リクエストFormをスキルシート明細Entityに移送する。
        List<Keyst10200UpdateQ1> skillSheetDetail = reqForm.getSkillSheetDetail();
        int index = 0;
        for (Keyst10200UpdateQ1 keyst10200UpdateQ1 : skillSheetDetail) {
            Keyst0210 keyst0210 = new Keyst0210();
            BeanUtils.copyProperties(keyst10200UpdateQ1, keyst0210);
            // スキルシート明細Entityに以下の値を設定する。
            keyst0210.setSkillSheetId(keyst0200.getSkillSheetId()); // スキルシートID
            keyst0210.setRefNo(index);
            // devScale, fwMwTool, pgLang はList→Stringに変換してセットする必要あり。
            // devScale
            String tempDevScale = String.join(",", keyst10200UpdateQ1.getDevScale());
            keyst0210.setDevScale(tempDevScale);
            // fwMwTool
            String tempFwMwTool = String.join(",", keyst10200UpdateQ1.getFwMwTool());
            keyst0210.setFwMwTool(tempFwMwTool);
            // pgLang
            String tempPgLang = keyst10200UpdateQ1.getPgLang().stream()
                    .map(Object::toString)
                    .collect(Collectors.joining(","));
            keyst0210.setPgLang(tempPgLang);

            // WHOカラムの設定

            log.info(keyst0210);
            index++;
            // INSERTを実行する。
            keyst0210Mapper.insert(keyst0210);
        }

        return null;
    }


}
