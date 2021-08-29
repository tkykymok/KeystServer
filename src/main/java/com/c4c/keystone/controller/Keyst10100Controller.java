package com.c4c.keystone.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.c4c.keystone.entity.Keyst5300;
import com.c4c.keystone.form.Keyst10100InitS;
import com.c4c.keystone.form.Keyst10400InitS01;
import com.c4c.keystone.service.impl.Keyst10100Service;
import com.c4c.keystone.service.impl.Keyst5300Service;
import com.c4c.keystone.utils.JwtUtil;


@RestController
@RequestMapping("/keyst10100")
public class Keyst10100Controller {

    @Autowired
    Keyst10100Service keyst10100Service;
    @Autowired
    Keyst5300Service keyst5300Service;

    @Autowired
    JwtUtil jwtUtil;

    @GetMapping("initialize")
    public ResponseEntity<Keyst10100InitS> initialize() {

        // レスポンスForm
        Keyst10100InitS resForm = keyst10100Service.initialize();
        System.out.println(resForm);

        // スキルマスタ取得
        List<Keyst5300> keyst5300List = keyst5300Service.getAllSkills();

        // スキルリストForm(initS01List)を定義する。
        List<Keyst10400InitS01> initS01List = new ArrayList<>();

        // カンマ区切りのスキルを一文字ずつリストに入れる
        String[] skillList = resForm.getUserBasicInfo().getSkills().split(",");

        // スキルコードを1件ずつ取り出し、スキル名に変換する。
        if (skillList != null) {
            for (String skillCodeString : skillList) {
                Keyst10400InitS01 initS01 = new Keyst10400InitS01();
                Integer skillCode = Integer.parseInt(skillCodeString);
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
        }
        return ResponseEntity.ok(resForm);
    }
}

