package com.c4c.keystone.service.impl;

import com.c4c.keystone.entity.*;
import com.c4c.keystone.form.*;
import com.c4c.keystone.mapper.*;
import com.c4c.keystone.service.IKeyst10200Service;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class Keyst10200Service implements IKeyst10200Service {

    @Autowired
    Keyst0100Mapper keyst0100Mapper;
    @Autowired
    Keyst0110Mapper keyst0110Mapper;
    @Autowired
    Keyst0200Mapper keyst0200Mapper;
    @Autowired
    Keyst0210Mapper keyst0210Mapper;
    @Autowired
    Keyst5300Mapper keyst5300Mapper;

    @Override
    @Transactional
    public Keyst10200InitS initialize() {
        // レスポンスForm
        Keyst10200InitS resForm = new Keyst10200InitS();
        //////////////////////////////////////////////////////////////
        // スキルシート一覧情報取得
        //////////////////////////////////////////////////////////////
        // ログインユーザーIDをセッションから取得する。
        Integer userId = 1; // TODO 暫定
        // スキルシートヘッダーEntityExampleに以下の値を設定する。
        Keyst0200Example keyst0200Example = new Keyst0200Example();
        keyst0200Example.createCriteria().andUserIdEqualTo(userId);

        // スキルシートヘッダーMapperの検索メソッドを呼び出す。
        List<Keyst0200> keyst0200List = keyst0200Mapper.selectByExample(keyst0200Example);

        // 検索結果全件に対して以下の処理をする。
        List<Keyst10200InitS04> initS04List = new ArrayList<>(); // スキルシート情報一覧
        for (Keyst0200 keyst0200 : keyst0200List) {
            Keyst10200InitS04 tempInitS04 = new Keyst10200InitS04();
            tempInitS04.setSkillSheetId(keyst0200.getSkillSheetId()); // スキルシートID
            tempInitS04.setSkillSheetRegDatetime(keyst0200.getSkillSheetRegDatetime()); // スキルシート登録日時
            initS04List.add(tempInitS04);
        }
        // レスポンスFormにスキルシート情報一覧を設定する。
        resForm.setSkillSheetInfoList(initS04List);

        //////////////////////////////////////////////////////////////
        // ユーザー基本情報取得
        //////////////////////////////////////////////////////////////
        // ユーザー基本情報EntityKeyに以下の値を設定する。
        Keyst0100Key keyst0100Key = new Keyst0100Key();
        keyst0100Key.setUserId(userId);

        // ユーザー基本情報MapperのPK検索メソッドを呼び出す。
        Keyst0100 keyst0100 = keyst0100Mapper.selectByPrimaryKey(keyst0100Key);
        // 検索結果をinitS01に移送する。
        Keyst10200InitS01 initS01 = new Keyst10200InitS01();
        BeanUtils.copyProperties(keyst0100, initS01);

        // 保有スキル検索
        // スキルマスタExampleに以下の値を設定する。
        Keyst5300Example keyst5300Example = new Keyst5300Example();
        keyst5300Example.createCriteria().andSkillCodeIn(
                Arrays.asList(keyst0100.getSkills().split(","))); // ユーザー基本情報の保有スキル
        // スキルマスタMapperの検索メソッドを呼び出す。
        List<Keyst5300> keyst5300List = keyst5300Mapper.selectByExample(keyst5300Example);
        // 検索結果全件に対して以下の処理をする。
        List<Keyst10200InitS02> initS02List = new ArrayList<>();
        for (Keyst5300 keyst5300 : keyst5300List) {
            Keyst10200InitS02 tempInitS02 = new Keyst10200InitS02();
            BeanUtils.copyProperties(keyst5300, tempInitS02);
            initS02List.add(tempInitS02);
        }
        // initS02ListをinitS01に設定する。
        initS01.setSkillList(initS02List);

        // initS01をinitSに設定する。
        resForm.setUserBasicInfo(initS01);

        //////////////////////////////////////////////////////////////
        // 資格一覧取得
        //////////////////////////////////////////////////////////////
        // 資格明細EntityExampleに以下の値を設定する。
        Keyst0110Example keyst0110Example = new Keyst0110Example();
        keyst0110Example.createCriteria().andUserIdEqualTo(userId); // ユーザーID
        // 資格明細Mapperの検索メソッドを呼び出す。
        List<Keyst0110> keyst0110List = keyst0110Mapper.selectByExample(keyst0110Example);
        // 検索結果全件に対して以下の処理をする。
        List<Keyst10200InitS03> initS03List = new ArrayList<>(); // 資格一覧
        // initS02をinitS01に設定する。
        initS01.setQualificationList(initS03List);
        for (Keyst0110 keyst0110 : keyst0110List) {
            Keyst10200InitS03 tempInitS03 = new Keyst10200InitS03();
            tempInitS03.setQualifiedDate(keyst0110.getQualifiedDate()); // 資格取得日
            tempInitS03.setQualificationContent(keyst0110.getQualificationContent()); // 資格内容
            initS03List.add(tempInitS03);
        }

        return resForm;
    }

    @Override
    @Transactional
    public Keyst10200DispSklShtS displaySkillSheet(Integer skillSheetId) {
        // レスポンスForm
        Keyst10200DispSklShtS resForm = new Keyst10200DispSklShtS();

        //////////////////////////////////////////////////////////////
        // スキルシートヘッダー取得
        //////////////////////////////////////////////////////////////
        // スキルシートヘッダーEntityKeyに以下の値を設定する。
        Keyst0200Key keyst0200Key = new Keyst0200Key();
        keyst0200Key.setSkillSheetId(skillSheetId); // スキルシートID

        // スキルシートヘッダーMapperのPKによる検索メソッドを呼び出す。
        Keyst0200 keyst0200 = keyst0200Mapper.selectByPrimaryKey(keyst0200Key);

        // 検索結果をDispSklShtS1に移送する。
        Keyst10200DispSklShtS1 dispSklShtS1 = new Keyst10200DispSklShtS1();
        BeanUtils.copyProperties(keyst0200, dispSklShtS1);
        // DispSklShtS1をresForm(DispSklShtS)に設定する。
        resForm.setSkillSheetHeader(dispSklShtS1);

        //////////////////////////////////////////////////////////////
        // スキルシート明細取得
        //////////////////////////////////////////////////////////////
        // スキルシート明細Exampleに以下の値を設定する。
        Keyst0210Example keyst0210Example = new Keyst0210Example();
        keyst0210Example.createCriteria()
                .andSkillSheetIdEqualTo(skillSheetId); // スキルシートID

        // スキルシート明細Mapperの検索メソッドを呼び出す。
        List<Keyst0210> keyst0210List = keyst0210Mapper.selectByExample(keyst0210Example);

        // DispSklShtS2ListをresForm(DispSklShtS)に設定する。
        List<Keyst10200DispSklShtS2> dispSklShtS2List = new ArrayList<>();
        resForm.setSkillSheetDetail(dispSklShtS2List);
        // 検索結果全件に対して以下の処理をする。
        for (Keyst0210 keyst0210 : keyst0210List) {
            // スキルシート明細EntityをDispSklShtS2に移送する。
            Keyst10200DispSklShtS2 tmpDispSklShtS2 = new Keyst10200DispSklShtS2();
            BeanUtils.copyProperties(keyst0210, tmpDispSklShtS2);
            // 開発規模
            List<String> devScale = new ArrayList<>(Arrays.asList(keyst0210.getDevScale().split(",")));
            tmpDispSklShtS2.setDevScale(devScale);
            // FW・MW・ツール等
            List<String> fwMwTool = new ArrayList<>(Arrays.asList(keyst0210.getFwMwTool().split(",")));
            tmpDispSklShtS2.setFwMwTool(fwMwTool);
            // 使用言語
            List<String> pgLang = new ArrayList<>(Arrays.asList(keyst0210.getPgLang().split(",")));
            tmpDispSklShtS2.setPgLang(pgLang);
            dispSklShtS2List.add(tmpDispSklShtS2);
        }

        return resForm;
    }

}
