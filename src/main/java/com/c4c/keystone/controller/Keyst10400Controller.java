package com.c4c.keystone.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.c4c.keystone.entity.Keyst0100ExtraS01;
import com.c4c.keystone.entity.Keyst5300;
import com.c4c.keystone.form.Keyst10400InitS;
import com.c4c.keystone.form.Keyst10400InitS01;
import com.c4c.keystone.form.Keyst10400InitS02;
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

            // 取得した情報をレスポンスFormにコピーする。(リストやオブジェクトはコピーできない為、スキルリストと案件情報は別で取得する)
            BeanUtils.copyProperties(keyst0100ExtraS01, resForm);

            // スキルリストForm(initS01List)を定義する。
            List<Keyst10400InitS01> initS01List = new ArrayList<>();
            // スキルコードを1つずつ配列に設定する。
            String[] skillCodeList = keyst0100ExtraS01.getSkills().split(",");
            // スキルコードを1件ずつ取り出し、スキル名に変換する。
            for (String skillCode : skillCodeList) {
                Keyst10400InitS01 initS01 = new Keyst10400InitS01();
                Keyst5300 keyst5300 = keyst5300List.stream()
                        .filter(obj -> skillCode.equals(obj.getSkillCode()))
                        .findFirst()
                        .get();
                // コード値からスキル名に変更した値をスキルForm(initS01)にコピーし、スキルリストForm(initS01List)に設定する。
                BeanUtils.copyProperties(keyst5300, initS01);
                initS01List.add(initS01);
            }
            // スキルリストForm(initS01List)をレスポンスFormに設定する。
            resForm.setSkillList(initS01List);

            // 案件情報Form(initS02)を定義する。
            Keyst10400InitS02 initS02 = new Keyst10400InitS02();
            initS02.setPrjCode(keyst0100ExtraS01.getPrjCode());
            initS02.setPrjName(keyst0100ExtraS01.getPrjName());
            initS02.setContractPrice(keyst0100ExtraS01.getContractPrice());
            initS02.setPrjStartDate(keyst0100ExtraS01.getPrjStartDate());
            // 案件情報Form(initS02)をレスポンスFormに設定する。
            resForm.setPrjInfo(initS02);

            // レスポンスFormリストにレスポンスFormを設定する。
            resFormList.add(resForm);
        }
        return ResponseEntity.ok(resFormList);
    }
}
