package com.c4c.keystone.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.c4c.keystone.constants.Flag;
import com.c4c.keystone.entity.Keyst5100;
import com.c4c.keystone.entity.Keyst5100Key;
import com.c4c.keystone.entity.Keyst5110;
import com.c4c.keystone.entity.Keyst5110Example;
import com.c4c.keystone.form.Keyst10500SaveQ;
import com.c4c.keystone.form.Keyst10500SaveS;
import com.c4c.keystone.form.Keyst10500SearchS;
import com.c4c.keystone.form.Keyst10500SearchS01;
import com.c4c.keystone.form.Keyst10500SearchS02;
import com.c4c.keystone.mapper.Keyst5100Mapper;
import com.c4c.keystone.mapper.Keyst5110Mapper;
import com.c4c.keystone.utils.EntityUtil;
import com.c4c.keystone.utils.JwtUtil;

import lombok.extern.log4j.Log4j2;

@Log4j2
@RestController
@RequestMapping("/keyst10500")
public class Keyst10500Controller {

    @Autowired
    Keyst5100Mapper keyst5100Mapper;

    @Autowired
    Keyst5110Mapper keyst5110Mapper;

    @Autowired
    JwtUtil jwtUtil;

    @Autowired
    EntityUtil entityUtil;

    @GetMapping("search")
    public ResponseEntity<Keyst10500SearchS> search(@RequestParam(value = "prjCode", required = false) String prjCode) {

        // レスポンスFormを定義する。
        Keyst10500SearchS resForm = new Keyst10500SearchS();

        // 案件マスタ取得
        Keyst5100Key keyst5100Key = new Keyst5100Key();
        keyst5100Key.setPrjCode(prjCode);
        Keyst5100 keyst5100 = keyst5100Mapper.selectByPrimaryKey(keyst5100Key);
        // 案件マスタForm(searchS01)を定義する。
        Keyst10500SearchS01 searchS01 = new Keyst10500SearchS01();
        // 取得した情報を案件マスタForm(searchS01)にコピーする。
        BeanUtils.copyProperties(keyst5100, searchS01);
        // 案件マスタForm(searchS01)をレスポンスFormに設定する。
        resForm.setPrjMaster(searchS01);

        // 案件割当明細取得
        Keyst5110Example keyst5110Example = new Keyst5110Example();
        List<Keyst5110> keyst5110List = keyst5110Mapper.selectByExample(keyst5110Example);
        // 案件割当明細Form(searchS02List)を定義する。
        List<Keyst10500SearchS02> searchS02List = new ArrayList<>();
        for (Keyst5110 keyst5110 : keyst5110List) {
            // フロントで選択した案件コード(引数のprjCode)と案件割当明細の案件コードが一致した場合、以下の処理をする。
            if (keyst5110.getPrjCode().equals(prjCode)) {
                // 案件割当明細Form(searchS02)を定義する。
                Keyst10500SearchS02 searchS02 = new Keyst10500SearchS02();
                // 取得した情報を案件割当明細Form(searchS02)にコピーする。
                BeanUtils.copyProperties(keyst5110, searchS02);
                // 案件割当明細Form(searchS02)を案件割当明細Form(searchS02List)に追加する。
                searchS02List.add(searchS02);
            }
        }

        // 案件割当明細Form(searchS02List)をレスポンスFormに設定する。
        resForm.setPrjUserAllocation(searchS02List);

        return ResponseEntity.ok(resForm);
    }

    @PostMapping(value = "save")
    public void save(@RequestHeader("Authorization") String jwt, @RequestBody @Valid Keyst10500SaveQ reqForm) {
        // ログインユーザー情報
        Map<String, Object> loginUserInfo = jwtUtil.parseToken(jwt.substring(7));
        // ユーザーID
        Integer loginUserId = Integer.valueOf(loginUserInfo.get(jwtUtil.USER_ID).toString());
        // リクエストFormを案件マスタEntityに移送する。
        Keyst5100 keyst5100 = new Keyst5100();
        BeanUtils.copyProperties(reqForm, keyst5100);
        keyst5100.setCreatedUser(loginUserId); // 作成者ID
        keyst5100.setLastModifiedUser(loginUserId); // 最終変更者ID
        keyst5100.setDeleteFlg(Flag.OFF); // 削除フラグ
        keyst5100.setVersionExKey(0); // 排他制御カラム
        log.info(keyst5100);
        // INSERT時共通フィールドを設定する。
        entityUtil.setColumns4Insert(keyst5100, loginUserId);

        keyst5100Mapper.insert(keyst5100);
    }
}
