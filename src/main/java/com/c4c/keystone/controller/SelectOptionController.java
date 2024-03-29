package com.c4c.keystone.controller;

import com.c4c.keystone.constants.Flag;
import com.c4c.keystone.entity.Keyst0100;
import com.c4c.keystone.entity.Keyst0100Example;
import com.c4c.keystone.entity.Keyst0300ExtraS03;
import com.c4c.keystone.entity.Keyst5100;
import com.c4c.keystone.entity.Keyst5200;
import com.c4c.keystone.entity.Keyst5200Example;
import com.c4c.keystone.entity.Keyst5300;
import com.c4c.keystone.enums.Db;
import com.c4c.keystone.enums.Os;
import com.c4c.keystone.form.SelectOption;
import com.c4c.keystone.mapper.Keyst0100Mapper;
import com.c4c.keystone.mapper.Keyst0300Mapper;
import com.c4c.keystone.mapper.Keyst5100Mapper;
import com.c4c.keystone.mapper.Keyst5200Mapper;
import com.c4c.keystone.mapper.Keyst5300Mapper;
import com.c4c.keystone.service.impl.Keyst5100Service;
import com.c4c.keystone.service.impl.Keyst5300Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/selectOption")
public class SelectOptionController {

    @Autowired
    Keyst5100Service keyst5100Service;
    @Autowired
    Keyst5300Service keyst5300Service;

    @Autowired
    Keyst0300Mapper keyst0300Mapper;
    @Autowired
    Keyst5300Mapper keyst5300Mapper;
    @Autowired
    Keyst5100Mapper keyst5100Mapper;
    @Autowired
    Keyst0100Mapper keyst0100Mapper;
    @Autowired
    Keyst5200Mapper keyst5200Mapper;


    @GetMapping("/skills")
    public ResponseEntity<List<SelectOption>> getSkillsOptions() {
        // スキルマスタ取得
        List<Keyst5300> Keyst5300List = keyst5300Service.getAllSkills();

        List<SelectOption> selectOptionList = new ArrayList<>();
        // 初期値の選択肢を追加する。
        SelectOption selectOption = new SelectOption();
        selectOption.setCode("");
        selectOption.setName("スキル一覧");
        selectOption.setDisableFlg(Flag.OFF);
        selectOptionList.add(selectOption);

        int count = 1;
        // 検索結果全件に対して以下の処理をする。
        for (Keyst5300 keyst5300 : Keyst5300List) {
            SelectOption tempSelectOption = new SelectOption();
            // selectOptionFormに以下の値を設定する。
            String code = String.valueOf(count);
            tempSelectOption.setCode(code); // 番号
            tempSelectOption.setName(keyst5300.getSkillName()); // スキル
            tempSelectOption.setDisableFlg(Flag.OFF); // 無効フラグ
            // selectOptionListに追加する。
            selectOptionList.add(tempSelectOption);
            count++;
        }
        return ResponseEntity.ok(selectOptionList);
    }

    @GetMapping("/pgLang")
    public ResponseEntity<List<SelectOption>> getPgLangOptions() {
        // スキルマスタ取得
        List<Keyst5300> Keyst5300List = keyst5300Service.getAllSkills();
        // 検索結果全件に対して以下の処理をする。
        List<SelectOption> selectOptionList = new ArrayList<>();
        for (Keyst5300 keyst5300 : Keyst5300List) {
            // 言語フラグがONの場合、以下の処理をする。
            if (keyst5300.getLangFlg().equals(Flag.ON)) {
                SelectOption tempSelectOption = new SelectOption();
                // selectOptionFormに以下の値を設定する。
                tempSelectOption.setCode(keyst5300.getSkillCode().toString()); // コード
                tempSelectOption.setName(keyst5300.getSkillName()); // 名称
                // selectOptionListに追加する。
                selectOptionList.add(tempSelectOption);
            }
        }
        return ResponseEntity.ok(selectOptionList);
    }

    @GetMapping("/os")
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
            tmpSelectOption.setCode(e.getCode().toString()); // コード
            tmpSelectOption.setName(e.getName()); // 名称
            selectOptionList.add(tmpSelectOption);
        }
        return ResponseEntity.ok(selectOptionList);
    }

    @GetMapping("/db")
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
            tmpSelectOption.setCode(e.getCode().toString()); // コード
            tmpSelectOption.setName(e.getName()); // 名称
            selectOptionList.add(tmpSelectOption);
        }
        return ResponseEntity.ok(selectOptionList);
    }

    @GetMapping("/prjName")
    public ResponseEntity<List<SelectOption>> getPrjNameOptions() {
        // 案件マスタ取得
        List<Keyst5100> Keyst5100List = keyst5100Service.getAllProjects();

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
//            tempSelectOption.setDisableFlg(Flag.OFF); // 無効フラグ
            // selectOptionListに追加する。
            selectOptionList.add(tempSelectOption);
        }
        return ResponseEntity.ok(selectOptionList);
    }

    @GetMapping("/month")
    public ResponseEntity<List<SelectOption>> getMonthOptions() {
        // 1on1実施年月履歴取得
        List<Keyst0300ExtraS03> keyst0300ExtraS03List = keyst0300Mapper.selectWithS03();

        List<SelectOption> selectOptionList = new ArrayList<>();
        // 検索結果全件に対して以下の処理をする。
        for (Keyst0300ExtraS03 keyst0300ExtraS031 : keyst0300ExtraS03List) {
            SelectOption tempSelectOption = new SelectOption();

            // 実施年月をyyyy年M月の形式にフォーマットする。
            StringBuilder sb = new StringBuilder();
            sb.append(keyst0300ExtraS031.getImplYearMonth());
            sb.insert(4, "年");
            sb.append("月");
            String formattedYearMonth = sb.toString();

            // selectOptionFormに以下の値を設定する。
            tempSelectOption.setCode(keyst0300ExtraS031.getImplYearMonth()); // コード
            tempSelectOption.setName(formattedYearMonth); // 名称
            tempSelectOption.setDisableFlg(Flag.OFF); // 無効フラグ
            // selectOptionListに追加する。
            selectOptionList.add(tempSelectOption);
        }

        // 現在年月を取得
        String today = LocalDate.now().toString();
        String thisMonth = today.replace("-", "").substring(0, 6);

        Optional<SelectOption> found = selectOptionList.stream()
                .filter(obj -> obj.getCode().equals(thisMonth))
                .findFirst();

        // 当月の選択肢が存在しない場合
        if (!found.isPresent()) {
            SelectOption tempSelectOption = new SelectOption();

            // 実施年月をyyyy年M月の形式にフォーマットする。
            StringBuilder sb = new StringBuilder();
            sb.append(thisMonth);
            sb.insert(4, "年");
            sb.append("月");
            String formattedYearMonth = sb.toString();

            // selectOptionFormに以下の値を設定する。
            tempSelectOption.setCode(thisMonth); // コード
            tempSelectOption.setName(formattedYearMonth); // 名称
            tempSelectOption.setDisableFlg(Flag.OFF); // 無効フラグ
            // selectOptionListに追加する。
            selectOptionList.add(tempSelectOption);
        }
        return ResponseEntity.ok(selectOptionList);
    }

    @GetMapping("/prjCode")
    public ResponseEntity<List<SelectOption>> getPrjCodeOptions() {
        // 案件マスタ取得
        List<Keyst5100> keyst5100List = keyst5100Service.getAllProjects();

        List<SelectOption> selectOptionList = new ArrayList<>();
        // 初期値の選択肢を追加する。
        SelectOption selectOption = new SelectOption();
        selectOption.setCode("");
        selectOption.setName("案件コードを選択してください");
        selectOption.setDisableFlg(Flag.ON);
        selectOptionList.add(selectOption);

        // 検索結果全件に対して以下の処理をする。
        for (Keyst5100 keyst5100 : keyst5100List) {
            SelectOption tempSelectOption = new SelectOption();
            // selectOptionFormに以下の値を設定する。
            tempSelectOption.setCode(keyst5100.getPrjCode()); // 案件コード
            tempSelectOption.setName(keyst5100.getPrjName()); // 案件名
            tempSelectOption.setDisableFlg(Flag.OFF); // 無効フラグ
            // selectOptionListに追加する。
            selectOptionList.add(tempSelectOption);
        }
        return ResponseEntity.ok(selectOptionList);
    }

    @GetMapping("/userName")
    public ResponseEntity<List<SelectOption>> getUserNameOptions() {
        // ユーザー基本情報取得
        Keyst0100Example keyst0100Example = new Keyst0100Example();
        List<Keyst0100> keyst0100List = keyst0100Mapper.selectByExample(keyst0100Example);

        List<SelectOption> selectOptionList = new ArrayList<>();
        // 初期値の選択肢を追加する。
        SelectOption selectOption = new SelectOption();
        selectOption.setCode(null);
        selectOption.setName("ユーザー名を選択してください");
        selectOption.setDisableFlg(Flag.ON);
        selectOptionList.add(selectOption);

        // 検索結果全件に対して以下の処理をする。
        for (Keyst0100 keyst0100 : keyst0100List) {
            SelectOption tempSelectOption = new SelectOption();
            // selectOptionFormに以下の値を設定する。
            String code = String.valueOf(keyst0100.getUserId());
            tempSelectOption.setCode(code); // 案件コード
            tempSelectOption.setName(keyst0100.getUserName()); // ユーザー名
            tempSelectOption.setDisableFlg(Flag.OFF); // 無効フラグ
            // selectOptionListに追加する。
            selectOptionList.add(tempSelectOption);
        }
        return ResponseEntity.ok(selectOptionList);
    }

    @GetMapping("/custName")
    public ResponseEntity<List<SelectOption>> getCustNameOptions() {
        // 顧客マスタ取得
        Keyst5200Example keyst5200Example = new Keyst5200Example();
        List<Keyst5200> keyst5200List = keyst5200Mapper.selectByExample(keyst5200Example);

        List<SelectOption> selectOptionList = new ArrayList<>();
        // 初期値の選択肢を追加する。
        SelectOption selectOption = new SelectOption();
        selectOption.setCode("");
        selectOption.setName("顧客名を選択してください");
        selectOption.setDisableFlg(Flag.ON);
        selectOptionList.add(selectOption);

        // 検索結果全件に対して以下の処理をする。
        for (Keyst5200 keyst5200 : keyst5200List) {
            SelectOption tempSelectOption = new SelectOption();
            // selectOptionFormに以下の値を設定する。
            String code = String.valueOf(keyst5200.getCustCode());
            tempSelectOption.setCode(code); // 顧客コード
            tempSelectOption.setName(keyst5200.getCustName()); // 顧客名
            tempSelectOption.setDisableFlg(Flag.OFF); // 無効フラグ
            // selectOptionListに追加する。
            selectOptionList.add(tempSelectOption);
        }
        return ResponseEntity.ok(selectOptionList);
    }

    @GetMapping("/team")
    public ResponseEntity<List<SelectOption>> getTeamOptions() {
        // チーム取得
        List<Keyst0100> keyst0100List = keyst0100Mapper.selectTeam();

        List<SelectOption> selectOptionList = new ArrayList<>();
        // 初期値の選択肢を追加する。
        SelectOption selectOption = new SelectOption();
        selectOption.setCode("");
        selectOption.setName("チーム一覧");
        selectOption.setDisableFlg(Flag.OFF);
        selectOptionList.add(selectOption);

        int count = 1;
        // 検索結果全件に対して以下の処理をする。
        for (Keyst0100 keyst0100 : keyst0100List) {
            SelectOption tempSelectOption = new SelectOption();
            // selectOptionFormに以下の値を設定する。
            String code = String.valueOf(count);
            tempSelectOption.setCode(code); // 番号
            tempSelectOption.setName(keyst0100.getTeam()); // チーム
            tempSelectOption.setDisableFlg(Flag.OFF); // 無効フラグ
            // selectOptionListに追加する。
            selectOptionList.add(tempSelectOption);
            count++;
        }
        return ResponseEntity.ok(selectOptionList);
    }

}
