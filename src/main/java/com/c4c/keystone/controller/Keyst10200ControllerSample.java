package com.c4c.keystone.controller;

import com.c4c.keystone.entity.Keyst0200;
import com.c4c.keystone.entity.Keyst0200Example;
import com.c4c.keystone.entity.Keyst0200ExtraS01;
import com.c4c.keystone.entity.Keyst0200Key;
import com.c4c.keystone.service.impl.Keyst0200ServiceSample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/sample")
public class Keyst10200ControllerSample {

    @Autowired
    Keyst0200ServiceSample keyst0200Service;

    /**
     * PKによる検索のサンプル
     *
     * @return
     */
    @GetMapping("/selectByPk")
    public ResponseEntity<Keyst0200> sample1() {
        // スキルシートEntityKeyに以下の値を設定する。
        Keyst0200Key keyst0200Key = new Keyst0200Key();
        keyst0200Key.setSkillSheetId(1); // スキルシートID
        // スキルシートServiceのPKによる検索メソッドを呼び出す。
        Keyst0200 keyst0200 = keyst0200Service.selectByPk(keyst0200Key);

        // サンプルのため、Entityをそのまま返却。
        // 実際にはResponse用のFormClassに移送して返却する。
        return ResponseEntity.ok().body(keyst0200);
    }

    /**
     * 任意の値を設定して検索のサンプル
     *
     * @return
     */
    @GetMapping("/select")
    public ResponseEntity<List<Keyst0200>> sample2() {
        // スキルシートEntityExampleに以下の値を設定する。
        Keyst0200Example keyst0200Example = new Keyst0200Example();
        keyst0200Example.createCriteria().andUserIdEqualTo(1);
        // スキルシートServiceの検索メソッドを呼び出す。
        List<Keyst0200> keyst0200List = keyst0200Service.select(keyst0200Example);

        // サンプルのため、Entityをそのまま返却。
        // 実際にはResponse用のFormClassに移送して返却する。
        return ResponseEntity.ok().body(keyst0200List);
    }

    /**
     * 任意のSQL(ExtraSQL)を発行して検索のサンプル
     *
     * @return
     */
    @GetMapping("/selectWithExtra")
    public ResponseEntity<List<Keyst0200ExtraS01>> sample3() {
        // スキルシートServiceのPKによる検索メソッドを呼び出す。
        List<Keyst0200ExtraS01> keyst0200ExtraS01List = keyst0200Service.select("tanaka");

        // サンプルのため、Entityをそのまま返却。
        // 実際にはResponse用のFormClassに移送して返却する。
        return ResponseEntity.ok().body(keyst0200ExtraS01List);
    }
}
