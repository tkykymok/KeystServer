package com.c4c.keystone.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.c4c.keystone.entity.Keyst5100;
import com.c4c.keystone.entity.Keyst5100ExtraS01;
import com.c4c.keystone.entity.Keyst5110;
import com.c4c.keystone.entity.Keyst5110Example;
import com.c4c.keystone.entity.Keyst5200;
import com.c4c.keystone.entity.Keyst5200Example;
import com.c4c.keystone.exception.ExclusiveException;
import com.c4c.keystone.form.Keyst10500SaveQ;
import com.c4c.keystone.form.Keyst10500SearchS;
import com.c4c.keystone.form.Keyst10500SearchS01;
import com.c4c.keystone.form.Keyst10500SearchS02;
import com.c4c.keystone.form.Keyst10500UpdateQ;
import com.c4c.keystone.form.Keyst10500UpdateQ1;
import com.c4c.keystone.form.Keyst10500UpdateQ2;
import com.c4c.keystone.mapper.Keyst5100Mapper;
import com.c4c.keystone.mapper.Keyst5110Mapper;
import com.c4c.keystone.mapper.Keyst5200Mapper;
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
    Keyst5200Mapper keyst5200Mapper;

    @Autowired
    protected MessageSource messageSource;

    @Autowired
    JwtUtil jwtUtil;

    @Autowired
    EntityUtil entityUtil;

    @GetMapping("search")
    public ResponseEntity<Keyst10500SearchS> search(@RequestParam(value = "prjCode", required = false) String prjCode) {

        // レスポンスFormを定義する。
        Keyst10500SearchS resForm = new Keyst10500SearchS();

        // 案件マスタ取得
        Keyst5100ExtraS01 keyst5100ExtraS01 = keyst5100Mapper.selectWithS01(prjCode);
        // 案件マスタForm(searchS01)を定義する。
        Keyst10500SearchS01 searchS01 = new Keyst10500SearchS01();
        // 取得した情報を案件マスタForm(searchS01)にコピーする。
        BeanUtils.copyProperties(keyst5100ExtraS01, searchS01);
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

        // 顧客マスタのレコード件数を取得
        Keyst5200Example keyst5200Example = new Keyst5200Example();
        long Keyst5200Count = keyst5200Mapper.countByExample(keyst5200Example) + 1;
        // レコード件数をString型に変換し、formatを顧客コード用に変換
        String custCode = String.format("C%04d", Keyst5200Count);
        // リクエストFormを顧客マスタEntityに移送する。
        Keyst5200 keyst5200 = new Keyst5200();
        keyst5200.setCustCode(custCode); // 顧客コード
        keyst5200.setCustName(reqForm.getCustName()); // 顧客名
        log.info(keyst5200);
        // INSERT時共通フィールドを設定する。
        entityUtil.setColumns4Insert(keyst5200, loginUserId);
        // INSERTを実行する。
        keyst5200Mapper.insert(keyst5200);

        // リクエストFormを案件マスタEntityに移送する。
        Keyst5100 keyst5100 = new Keyst5100();
        BeanUtils.copyProperties(reqForm, keyst5100);
        keyst5100.setCustCode(custCode); // 顧客コード
        log.info(keyst5100);
        // INSERT時共通フィールドを設定する。
        entityUtil.setColumns4Insert(keyst5100, loginUserId);
        // INSERTを実行する。
        keyst5100Mapper.insert(keyst5100);
    }

    @PutMapping(value = "update")
    public void update(@RequestHeader("Authorization") String jwt, @RequestBody @Valid Keyst10500UpdateQ reqForm) throws ExclusiveException {
        // ログインユーザー情報
        Map<String, Object> loginUserInfo = jwtUtil.parseToken(jwt.substring(7));
        // ユーザーID
        Integer loginUserId = Integer.valueOf(loginUserInfo.get(jwtUtil.USER_ID).toString());

        // バージョンチェック
        Keyst5100 keyst5100 = new Keyst5100();
        keyst5100.setPrjCode(reqForm.getPrjMaster().getPrjCode()); // 案件コード
        keyst5100.setVersionExKey(reqForm.getPrjMaster().getVersionExKey()); // 排他制御カラム
        keyst5100 = keyst5100Mapper.checkVersion(keyst5100);
        if (keyst5100 == null) {
            throw new ExclusiveException(messageSource.getMessage("E00003", null, Locale.JAPAN));
        }
        log.info(keyst5100);

        // リクエストFormを案件マスタEntityに移送する。
        Keyst10500UpdateQ1 prjMaster = reqForm.getPrjMaster();
        BeanUtils.copyProperties(prjMaster, keyst5100);
        // UPDATE時共通フィールドを設定する。
        entityUtil.setColumns4Update(keyst5100, loginUserId);
        // UPDATEを実行する。
        keyst5100Mapper.updateByPrimaryKey(keyst5100);

        // 案件コードに紐づく、既存の案件割当明細全件を削除する。
        Keyst5110Example keyst5110Example = new Keyst5110Example();
        keyst5110Example.createCriteria()
                .andPrjCodeEqualTo(keyst5100.getPrjCode());
        keyst5110Mapper.deleteByExample(keyst5110Example);

        // リクエストFormを案件割当明細Entityに移送する。
        List<Keyst10500UpdateQ2> prjUserAllocationList = reqForm.getPrjUserAllocationList();
        for (Keyst10500UpdateQ2 prjUserAllocation : prjUserAllocationList) {
            Keyst5110 keyst5110 = new Keyst5110();
            BeanUtils.copyProperties(prjUserAllocation, keyst5110);
            keyst5110.setPrjCode(keyst5100.getPrjCode());
            log.info(keyst5110);
            // INSERT時共通フィールドを設定する。
            entityUtil.setColumns4Insert(keyst5110, loginUserId);
            // INSERTを実行する。
            keyst5110Mapper.insert(keyst5110);
        }

    }
}
