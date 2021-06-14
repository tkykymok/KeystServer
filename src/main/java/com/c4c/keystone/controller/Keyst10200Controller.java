package com.c4c.keystone.controller;

import com.c4c.keystone.entity.*;
import com.c4c.keystone.form.*;
import com.c4c.keystone.mapper.Keyst0100Mapper;
import com.c4c.keystone.mapper.Keyst0110Mapper;
import com.c4c.keystone.mapper.Keyst0200Mapper;
import com.c4c.keystone.mapper.Keyst5300Mapper;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@RestController
@RequestMapping("/keyst10200")
public class Keyst10200Controller {

    @Autowired
    Keyst0100Mapper keyst0100Mapper;
    @Autowired
    Keyst0110Mapper keyst0110Mapper;
    @Autowired
    Keyst0200Mapper keyst0200Mapper;
    @Autowired
    Keyst5300Mapper keyst5300Mapper;



    @GetMapping("")
    @CrossOrigin(origins = {"http://localhost:3000"})
    public ResponseEntity<Keyst10200InitS> initialize() {
        // レスポンスForm
        Keyst10200InitS resForm = new Keyst10200InitS();

        // 【スキルシート一覧情報取得】
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

        // 【ユーザー基本情報取得】
        // ユーザー基本情報EntityKeyに以下の値を設定する。
        Keyst0100Key keyst0100Key = new Keyst0100Key();
        keyst0100Key.setUserId(userId);

        // ユーザー基本情報MapperのPK検索メソッドを呼び出す。
        Keyst0100 keyst0100 = keyst0100Mapper.selectByPrimaryKey(keyst0100Key);
        // 検索結果をinitS01に移送する。
        Keyst10200InitS01 initS01 = new Keyst10200InitS01();
        BeanUtils.copyProperties(keyst0100, initS01);

        // 保有スキル検索
        Keyst5300Example keyst5300Example = new Keyst5300Example();
        keyst5300Example.createCriteria().andSkillCodeIn(Arrays.asList(keyst0100.getSkills().split(",")));
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

        // 【資格一覧取得】
        // 資格明細EntityExampleに以下の値を設定する。
        Keyst0110Example keyst0110Example = new Keyst0110Example();
        keyst0110Example.createCriteria().andUserIdEqualTo(userId);
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

        return ResponseEntity.ok(resForm);
    }

}
