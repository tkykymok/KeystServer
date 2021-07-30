package com.c4c.keystone.service.impl;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.c4c.keystone.entity.Keyst0100;
import com.c4c.keystone.entity.Keyst0100Key;
import com.c4c.keystone.form.Keyst10100InitS;
import com.c4c.keystone.form.Keyst10100InitS01;
import com.c4c.keystone.mapper.Keyst0100Mapper;
import com.c4c.keystone.service.IKeyst10100Service;

@Service
public class Keyst10100Service implements IKeyst10100Service {

    @Autowired
    Keyst0100Mapper keyst0100Mapper;

    @Override
    @Transactional
    public Keyst10100InitS initialize() {
        // レスポンスForm
        Keyst10100InitS resForm = new Keyst10100InitS();

        //////////////////////////////////////////////////////////////
        // ユーザー基本情報取得
        //////////////////////////////////////////////////////////////
        // ログインユーザーIDをセッションから取得する。
        Integer userId = 1; // TODO 暫定

        // ユーザー基本情報EntityKeyに以下の値を設定する。
        Keyst0100Key keyst0100Key = new Keyst0100Key();
        keyst0100Key.setUserId(userId);

        // ユーザー基本情報MapperのPK検索メソッドを呼び出す。
        Keyst0100 keyst0100 = keyst0100Mapper.selectByPrimaryKey(keyst0100Key);
        // 検索結果をinitS01に移送する。
        Keyst10100InitS01 initS01 = new Keyst10100InitS01();
        BeanUtils.copyProperties(keyst0100, initS01);

        // initS01をinitSに設定する。
        resForm.setUserBasicInfo(initS01);

        return resForm;
    }

}
