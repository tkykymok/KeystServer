package com.c4c.keystone.service.impl;

import java.util.Locale;
import java.util.Map;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.c4c.keystone.entity.Keyst5200;
import com.c4c.keystone.entity.Keyst5200Key;
import com.c4c.keystone.exception.ExclusiveException;
import com.c4c.keystone.form.Keyst10700SaveQ;
import com.c4c.keystone.form.Keyst10700SaveS;
import com.c4c.keystone.form.Keyst10700SearchS;
import com.c4c.keystone.form.Keyst10700UpdateQ;
import com.c4c.keystone.form.Keyst10700UpdateS;
import com.c4c.keystone.mapper.Keyst5200Mapper;
import com.c4c.keystone.service.IKeyst10700Service;
import com.c4c.keystone.utils.EntityUtil;
import com.c4c.keystone.utils.JwtUtil;

import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
public class Keyst10700Service implements IKeyst10700Service {

    @Autowired
    Keyst5200Mapper keyst5200Mapper;

    @Autowired
    protected MessageSource messageSource;
    @Autowired
    JwtUtil jwtUtil;
    @Autowired
    EntityUtil entityUtil;

    @Override
    public Keyst10700SearchS search(String custCode) {
        // レスポンスFormを定義する。
        Keyst10700SearchS resForm = new Keyst10700SearchS();

        // 顧客マスタ取得
        Keyst5200Key keyst5200Key = new Keyst5200Key();
        keyst5200Key.setCustCode(custCode);
        Keyst5200 keyst5200 = keyst5200Mapper.selectByPrimaryKey(keyst5200Key);
        // 取得した情報をレスポンスForm(resForm)にコピーする。
        BeanUtils.copyProperties(keyst5200, resForm);

        return resForm;
    }

    @Override
    @Transactional
    public Keyst10700SaveS save(String jwt, Keyst10700SaveQ reqForm) {
        // ログインユーザー情報
        Map<String, Object> loginUserInfo = jwtUtil.parseToken(jwt.substring(7));
        // ユーザーID
        Integer loginUserId = Integer.valueOf(loginUserInfo.get(jwtUtil.USER_ID).toString());

        // リクエストFormを顧客マスタEntityに移送する。
        Keyst5200 keyst5200 = new Keyst5200();
        BeanUtils.copyProperties(reqForm, keyst5200);
        log.info(keyst5200);
        // INSERT時共有フィールドを設定する。
        entityUtil.setColumns4Insert(keyst5200, loginUserId);
        // INSERTを実行する。
        keyst5200Mapper.insert(keyst5200);

        Keyst10700SaveS resForm = new Keyst10700SaveS();

        return resForm;
    }

    @Override
    @Transactional
    public Keyst10700UpdateS update(String jwt, Keyst10700UpdateQ reqForm) throws ExclusiveException {
        // ログインユーザー情報
        Map<String, Object> loginUserInfo = jwtUtil.parseToken(jwt.substring(7));
        // ユーザーID
        Integer loginUserId = Integer.valueOf(loginUserInfo.get(jwtUtil.USER_ID).toString());

        // バージョンチェック
        Keyst5200 keyst5200 = new Keyst5200();
        keyst5200.setCustCode(reqForm.getCustCode()); // 顧客コード
        keyst5200.setVersionExKey(reqForm.getVersionExKey()); // 排他制御カラム
        keyst5200 = keyst5200Mapper.checkVersion(keyst5200);
        if (keyst5200 == null) {
            throw new ExclusiveException(messageSource.getMessage("E00003", null, Locale.JAPAN));
        }
        log.info(keyst5200);

        // リクエストFormを案件マスタEntityに移送する。
        BeanUtils.copyProperties(reqForm, keyst5200);
        // UPDATE時共通フィールドを設定する。
        entityUtil.setColumns4Update(keyst5200, loginUserId);
        // UPDATEを実行する。
        keyst5200Mapper.updateByPrimaryKey(keyst5200);

        Keyst10700UpdateS resForm = new Keyst10700UpdateS();

        return resForm;
    }

}
