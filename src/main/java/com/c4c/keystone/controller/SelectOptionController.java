package com.c4c.keystone.controller;

import com.c4c.keystone.constants.Flag;
import com.c4c.keystone.entity.Keyst5100;
import com.c4c.keystone.entity.Keyst5100Example;
import com.c4c.keystone.entity.Keyst5300;
import com.c4c.keystone.entity.Keyst5300Example;
import com.c4c.keystone.enums.Db;
import com.c4c.keystone.enums.Os;
import com.c4c.keystone.form.SelectOption;
import com.c4c.keystone.mapper.Keyst5100Mapper;
import com.c4c.keystone.mapper.Keyst5300Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/selectOption")
public class SelectOptionController {

    @Autowired
    Keyst5300Mapper keyst5300Mapper;
    @Autowired
    Keyst5100Mapper keyst5100Mapper;

    @GetMapping("/pgLang")
    @CrossOrigin(origins = {"http://localhost:3000"})
    public ResponseEntity<List<SelectOption>> getPgLangOptions() {
        // スキルマスタEntityExampleに以下の値を設定する。
        Keyst5300Example keyst5300Example = new Keyst5300Example();
        keyst5300Example.createCriteria().andLangFlgEqualTo(Flag.ON); // 言語フラグ

        // スキルマスタMapperの検索メソッドを呼び出す。
        List<Keyst5300> Keyst5300List = keyst5300Mapper.selectByExample(keyst5300Example);
        // 検索結果全件に対して以下の処理をする。
        List<SelectOption> selectOptionList = new ArrayList<>();
        for (Keyst5300 keyst5300 : Keyst5300List) {
            SelectOption tempSelectOption = new SelectOption();
            // selectOptionFormに以下の値を設定する。
            tempSelectOption.setCode(keyst5300.getSkillCode()); // コード
            tempSelectOption.setName(keyst5300.getSkillName()); // 名称
            // selectOptionListに追加する。
            selectOptionList.add(tempSelectOption);
        }
        return ResponseEntity.ok(selectOptionList);
    }

    @GetMapping("/os")
    @CrossOrigin(origins = {"http://localhost:3000"})
    public ResponseEntity<List<SelectOption>> getOsOptions() {
        // OSEnum一覧を取得する。
        Os[] enumArray = Os.values();

        List<SelectOption> selectOptionList = new ArrayList<>();
        // 空の選択肢を追加する。
        SelectOption selectOption = new SelectOption();
        selectOption.setCode(null);
        selectOption.setName("");
        selectOptionList.add(selectOption);

        // OSEnum一覧全件に対して以下の処理をする。
        for (Os e : enumArray) {
            SelectOption tmpSelectOption = new SelectOption();
            tmpSelectOption.setCode(e.getCode()); // コード
            tmpSelectOption.setName(e.getName()); // 名称
            selectOptionList.add(tmpSelectOption);
        }
        return ResponseEntity.ok(selectOptionList);
    }

    @GetMapping("/db")
    @CrossOrigin(origins = {"http://localhost:3000"})
    public ResponseEntity<List<SelectOption>> getDbOptions() {
        // OSEnum一覧を取得する。
        Db[] enumArray = Db.values();

        List<SelectOption> selectOptionList = new ArrayList<>();
        // 空の選択肢を追加する。
        SelectOption selectOption = new SelectOption();
        selectOption.setCode(null);
        selectOption.setName("");
        selectOptionList.add(selectOption);

        // OSEnum一覧全件に対して以下の処理をする。
        for (Db e : enumArray) {
            SelectOption tmpSelectOption = new SelectOption();
            tmpSelectOption.setCode(e.getCode()); // コード
            tmpSelectOption.setName(e.getName()); // 名称
            selectOptionList.add(tmpSelectOption);
        }
        return ResponseEntity.ok(selectOptionList);
    }

    @GetMapping("/prjName")
    @CrossOrigin(origins = {"http://localhost:3000"})
    public ResponseEntity<List<SelectOption>> getPrjNameOptions() {
        // 案件マスタEntityExampleに以下の値を設定する。
        Keyst5100Example keyst5100Example = new Keyst5100Example();
        keyst5100Example.createCriteria().andDeleteFlgEqualTo(Flag.OFF);

        // 案件マスタMapperの検索メソッドを呼び出す。
        List<Keyst5100> Keyst5100List = keyst5100Mapper.selectByExample(keyst5100Example);

        List<SelectOption> selectOptionList = new ArrayList<>();
        // 初期値の選択肢を追加する。
        SelectOption selectOption = new SelectOption();
        selectOption.setCode("");
        selectOption.setName("案件名を選択してください");
        selectOption.setDisableFlg(Flag.ON);
        selectOptionList.add(selectOption);

        // 検索結果全件に対して以下の処理をする。
        for (Keyst5100 keyst5100 : Keyst5100List) {
            SelectOption tempSelectOption = new SelectOption();
            // selectOptionFormに以下の値を設定する。
            tempSelectOption.setCode(keyst5100.getPrjCode()); // コード
            tempSelectOption.setName(keyst5100.getPrjName()); // 名称
            tempSelectOption.setDisableFlg(Flag.OFF); // 無効フラグ
            // selectOptionListに追加する。
            selectOptionList.add(tempSelectOption);
        }
        return ResponseEntity.ok(selectOptionList);
    }


}
