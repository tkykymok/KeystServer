package com.c4c.keystone.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.c4c.keystone.entity.Keyst0300;
import com.c4c.keystone.entity.Keyst0300Key;
import com.c4c.keystone.entity.Keyst0310;
import com.c4c.keystone.entity.Keyst0310Example;
import com.c4c.keystone.form.Keyst10300DispReserveInfoS;
import com.c4c.keystone.form.Keyst10300DispReserveInfoS1;
import com.c4c.keystone.form.Keyst10300DispReserveInfoS2;
import com.c4c.keystone.form.Keyst10300InitS;
import com.c4c.keystone.mapper.Keyst0300Mapper;
import com.c4c.keystone.mapper.Keyst0310Mapper;
import com.c4c.keystone.mapper.Keyst0320Mapper;
import com.c4c.keystone.service.IKeyst10300Service;

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

    @Override
    @Transactional
    public Keyst10300InitS initialize() {
        // レスポンスForm
        Keyst10300InitS resForm = new Keyst10300InitS();
        resForm.
        keyst0300Mapper.selectWithS();

        return resForm;
    }

    @Override
    @Transactional
    public Keyst10300DispReserveInfoS displayReserveInfo(Integer reserveId) {
        // レスポンスForm
        Keyst10300DispReserveInfoS resForm = new Keyst10300DispReserveInfoS();

        //////////////////////////////////////////////////////////////
        // スキルシートヘッダー取得
        //////////////////////////////////////////////////////////////
        // スキルシートヘッダーEntityKeyに以下の値を設定する。
        Keyst0300Key keyst0300Key = new Keyst0300Key();
        keyst0300Key.setReserveId(reserveId); // スキルシートID

        // スキルシートヘッダーMapperのPKによる検索メソッドを呼び出す。
        Keyst0300 keyst0300 = keyst0300Mapper.selectByPrimaryKey(keyst0300Key);

        // 検索結果をDispSklShtS1に移送する。
        Keyst10300DispReserveInfoS1 dispReserveInfoS1 = new Keyst10300DispReserveInfoS1();
        BeanUtils.copyProperties(keyst0300, dispReserveInfoS1);
        // DispSklShtS1をresForm(DispSklShtS)に設定する。
        resForm.setReserveInfoHeader(dispReserveInfoS1);

        //////////////////////////////////////////////////////////////
        // スキルシート明細取得
        //////////////////////////////////////////////////////////////
        // スキルシート明細Exampleに以下の値を設定する。
        Keyst0310Example keyst0310Example = new Keyst0310Example();
        keyst0310Example.createCriteria()
                .andReserveIdEqualTo(reserveId); // スキルシートID

        // スキルシート明細Mapperの検索メソッドを呼び出す。
        List<Keyst0310> keyst0310List = keyst0310Mapper.selectByExample(keyst0310Example);

        // DispSklShtS2ListをresForm(DispSklShtS)に設定する。
        List<Keyst10300DispReserveInfoS2> dispReserveInfoS2List = new ArrayList<>();
        resForm.setReserveInfoDetail(dispReserveInfoS2List);
        // 検索結果全件に対して以下の処理をする。
        for (Keyst0310 keyst0310 : keyst0310List) {
            // スキルシート明細EntityをDispSklShtS2に移送する。
            Keyst10300DispReserveInfoS2 tmpDispReserveInfoS2 = new Keyst10300DispReserveInfoS2();
            BeanUtils.copyProperties(keyst0310, tmpDispReserveInfoS2);
        }

        return resForm;
    }

}
