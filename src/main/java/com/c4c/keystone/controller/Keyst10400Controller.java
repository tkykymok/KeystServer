package com.c4c.keystone.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.c4c.keystone.entity.Keyst0100ExtraS01;
import com.c4c.keystone.entity.Keyst5300;
import com.c4c.keystone.form.Keyst10400InitS;
import com.c4c.keystone.form.Keyst10400InitS01;
import com.c4c.keystone.form.Keyst10400InitS02;
import com.c4c.keystone.form.Keyst10400InitS03;
import com.c4c.keystone.mapper.Keyst0100Mapper;
import com.c4c.keystone.mapper.Keyst5110Mapper;
import com.c4c.keystone.service.impl.Keyst5100Service;
import com.c4c.keystone.service.impl.Keyst5300Service;

@RestController
@RequestMapping("/keyst10400")
public class Keyst10400Controller {

    @Autowired
    Keyst5300Service keyst5300Service;

    @Autowired
    Keyst5100Service keyst5100Service;

    @Autowired
    Keyst0100Mapper keyst0100Mapper;

    @Autowired
    Keyst5110Mapper keyst5110Mapper;

    @GetMapping("initialize")
    @CrossOrigin(origins = {"http://localhost:3000"})
    public ResponseEntity<List<Keyst10400InitS>> initialze() {

        // レスポンスFormリストを定義する。
        List<Keyst10400InitS> resFormList = new ArrayList<>();

        // ユーザー一覧画面に必要な情報をデータベースから全件取得する。
        List<Keyst0100ExtraS01> keyst0100ExtraS01List  = keyst0100Mapper.selectWithS01();

        // スキルマスタ取得
        List<Keyst5300> keyst5300List = keyst5300Service.getAllSkills();

        // ユーザーごとに処理を行う。
        for (Keyst0100ExtraS01 keyst0100ExtraS01 : keyst0100ExtraS01List) {

            // レスポンスFormを定義する。
            Keyst10400InitS resForm = new Keyst10400InitS();

            //////////////////////////////////////////////////////////////
            // ユーザー基本情報
            //////////////////////////////////////////////////////////////
            // 取得した情報をユーザー基本情報Form(iniiS01)にコピーする。(リストはコピーできないためスキルリストは別で取得する。)
            Keyst10400InitS01 initS01 = new Keyst10400InitS01();
            BeanUtils.copyProperties(keyst0100ExtraS01, initS01);

            // ユーザー基本情報の保有スキル(コード値)全件に対して以下の処理をする。
            List<Keyst10400InitS02> initS02List = new ArrayList<>();
            String[] skillCodeList = keyst0100ExtraS01.getSkills().split(",");
            for (String skillCode : skillCodeList) {
                Keyst10400InitS02 initS02 = new Keyst10400InitS02();
                Keyst5300 Keyst5300 = keyst5300List.stream()
                        .filter(obj -> skillCode.equals(obj.getSkillCode()))
                        .findFirst()
                        .get();
                // コード値からスキル名に変更した値をスキルForm(initS02)にコピーし、スキルリストForm(initS02List)に設定する。
                BeanUtils.copyProperties(Keyst5300, initS02);
                initS02List.add(initS02);
            }
            // スキルリストForm(initS02List)をユーザー基本情報Form(initS01)に設定する。
            initS01.setSkillList(initS02List);
            // レスポンスFormにユーザー基本情報Form(initS01)を設定する。
            resForm.setUserBasicInfo(initS01);

            //////////////////////////////////////////////////////////////
            // 案件情報
            //////////////////////////////////////////////////////////////
            // 案件情報リストForm(initS03List)を定義する。
            List<Keyst10400InitS03> initS03List = new ArrayList<>();
            // 案件情報Form(initS03)を定義する。
            Keyst10400InitS03 initS03 = new Keyst10400InitS03();
            // 案件情報ごとに処理を行う。
            initS03.setPrjCode(keyst0100ExtraS01.getPrjCode());
            initS03.setPrjName(keyst0100ExtraS01.getPrjName());
            initS03.setContractPrice(keyst0100ExtraS01.getContractPrice());
            initS03.setPrjStartDate(keyst0100ExtraS01.getPrjStartDate());
            // 案件情報Form(initS03)を案件情報リストForm(initS03List)に設定する。
            initS03List.add(initS03);
            // レスポンスFormに案件情報リストForm(initS03List)を設定する。
            resForm.setPrjInfo(initS03List);
            // レスポンスFormリストにレスポンスFormを設定する。
            resFormList.add(resForm);
        }
        return ResponseEntity.ok(resFormList);
    }
}
