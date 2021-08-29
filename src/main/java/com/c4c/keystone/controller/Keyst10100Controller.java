package com.c4c.keystone.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.c4c.keystone.entity.Keyst5300;
import com.c4c.keystone.form.Keyst10100InitS;
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

        // カンマ区切りのスキルを一文字ずつリストに入れる
        String[] skillList = resForm.getUserBasicInfo().getSkills().split(",");

        // スキルコードを1件ずつ取り出し、スキル名に変換する。
        if (skillList != null) {
            for (String skill : skillList) {
                Integer skillCode = Integer.parseInt(skill);
                System.out.println(skillCode);
                for (int i = 0; i <= keyst5300List.size(); i++) {
                    System.out.println(keyst5300List);
                }
            }
        }

        return ResponseEntity.ok(resForm);
    }

}
