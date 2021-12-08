package com.c4c.keystone.service.impl;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

import com.c4c.keystone.form.*;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.c4c.keystone.constants.Flag;
import com.c4c.keystone.entity.Keyst0100;
import com.c4c.keystone.entity.Keyst0100Key;
import com.c4c.keystone.entity.Keyst0110;
import com.c4c.keystone.entity.Keyst0110Example;
import com.c4c.keystone.entity.Keyst0200;
import com.c4c.keystone.entity.Keyst0200Example;
import com.c4c.keystone.entity.Keyst0200Key;
import com.c4c.keystone.entity.Keyst0210;
import com.c4c.keystone.entity.Keyst0210Example;
import com.c4c.keystone.entity.Keyst5300;
import com.c4c.keystone.exception.ExclusiveException;
import com.c4c.keystone.mapper.Keyst0100Mapper;
import com.c4c.keystone.mapper.Keyst0110Mapper;
import com.c4c.keystone.mapper.Keyst0200Mapper;
import com.c4c.keystone.mapper.Keyst0210Mapper;
import com.c4c.keystone.mapper.Keyst5300Mapper;
import com.c4c.keystone.service.IKeyst10200Service;
import com.c4c.keystone.utils.EntityUtil;
import com.c4c.keystone.utils.JwtUtil;

import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
public class Keyst10200Service implements IKeyst10200Service {

    @Autowired
    Keyst5300Service keyst5300Service;

    @Autowired
    Keyst0100Mapper keyst0100Mapper;
    @Autowired
    Keyst0110Mapper keyst0110Mapper;
    @Autowired
    Keyst0200Mapper keyst0200Mapper;
    @Autowired
    Keyst0210Mapper keyst0210Mapper;
    @Autowired
    Keyst5300Mapper keyst5300Mapper;

    @Autowired
    protected MessageSource messageSource;
    @Autowired
    JwtUtil jwtUtil;
    @Autowired
    EntityUtil entityUtil;

    @Override
    @Transactional
    public Keyst10200InitS initialize(Integer userId) {
        // レスポンスForm
        Keyst10200InitS resForm = new Keyst10200InitS();
        //////////////////////////////////////////////////////////////
        // スキルシート一覧情報取得
        //////////////////////////////////////////////////////////////
        // スキルシートヘッダーEntityExampleに以下の値を設定する。
        Keyst0200Example keyst0200Example = new Keyst0200Example();
        keyst0200Example.createCriteria()
                .andUserIdEqualTo(userId)
                .andDeleteFlgEqualTo(Flag.OFF);

        // スキルシートヘッダーMapperの検索メソッドを呼び出す。
        List<Keyst0200> keyst0200List = keyst0200Mapper.selectByExample(keyst0200Example);
        // スキルシート登録日時の降順で並び替える。
        keyst0200List = keyst0200List.stream()
                .sorted(Comparator.comparing(Keyst0200::getSkillSheetRegDatetime, Comparator.reverseOrder()))
                .collect(Collectors.toList());

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

        //////////////////////////////////////////////////////////////
        // ユーザー基本情報取得
        //////////////////////////////////////////////////////////////
        // ユーザー基本情報EntityKeyに以下の値を設定する。
        Keyst0100Key keyst0100Key = new Keyst0100Key();
        keyst0100Key.setUserId(userId);

        // ユーザー基本情報MapperのPK検索メソッドを呼び出す。
        Keyst0100 keyst0100 = keyst0100Mapper.selectByPrimaryKey(keyst0100Key);
        // 検索結果をinitS01に移送する。
        Keyst10200InitS01 initS01 = new Keyst10200InitS01();
        BeanUtils.copyProperties(keyst0100, initS01);

        // スキルマスタ取得
        List<Keyst5300> keyst5300List = keyst5300Service.getAllSkills();

        // 保有スキルが存在する場合、ユーザー基本情報の保有スキル(コード値)全件に対して以下の処理をする。
        if (Objects.nonNull(keyst0100.getSkills()) && !keyst0100.getSkills().isEmpty()) {
            List<Integer> skillCodeList = Arrays.stream(keyst0100.getSkills().split(","))
                    .map(Integer::parseInt)
                    .collect(Collectors.toList());
            List<Keyst10200InitS02> initS02List = new ArrayList<>();
            for (Integer skillCode : skillCodeList) {
                Keyst10200InitS02 tempInitS02 = new Keyst10200InitS02();
                Keyst5300 tempKeyst5300 = keyst5300List.stream()
                        .filter(obj -> skillCode.equals(obj.getSkillCode()))
                        .findFirst()
                        .get();
                BeanUtils.copyProperties(tempKeyst5300, tempInitS02);
                initS02List.add(tempInitS02);
            }
            // initS02ListをinitS01に設定する。
            initS01.setSkillList(initS02List);
        }

        // initS01をinitSに設定する。
        resForm.setUserBasicInfo(initS01);

        //////////////////////////////////////////////////////////////
        // 資格一覧取得
        //////////////////////////////////////////////////////////////
        // 資格明細EntityExampleに以下の値を設定する。
        Keyst0110Example keyst0110Example = new Keyst0110Example();
        keyst0110Example.createCriteria().andUserIdEqualTo(userId); // ユーザーID
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

        return resForm;
    }

    @Override
    @Transactional
    public Keyst10200DispSklShtS displaySkillSheet(Integer skillSheetId) {
        // レスポンスForm
        Keyst10200DispSklShtS resForm = new Keyst10200DispSklShtS();

        //////////////////////////////////////////////////////////////
        // スキルシートヘッダー取得
        //////////////////////////////////////////////////////////////
        // スキルシートヘッダーEntityKeyに以下の値を設定する。
        Keyst0200Key keyst0200Key = new Keyst0200Key();
        keyst0200Key.setSkillSheetId(skillSheetId); // スキルシートID

        // スキルシートヘッダーMapperのPKによる検索メソッドを呼び出す。
        Keyst0200 keyst0200 = keyst0200Mapper.selectByPrimaryKey(keyst0200Key);

        // 検索結果をDispSklShtS1に移送する。
        Keyst10200DispSklShtS1 dispSklShtS1 = new Keyst10200DispSklShtS1();
        BeanUtils.copyProperties(keyst0200, dispSklShtS1);
        // DispSklShtS1をresForm(DispSklShtS)に設定する。
        resForm.setSkillSheetHeader(dispSklShtS1);

        //////////////////////////////////////////////////////////////
        // スキルシート明細取得
        //////////////////////////////////////////////////////////////
        // スキルシート明細Exampleに以下の値を設定する。
        Keyst0210Example keyst0210Example = new Keyst0210Example();
        keyst0210Example.createCriteria()
                .andSkillSheetIdEqualTo(skillSheetId); // スキルシートID

        // スキルシート明細Mapperの検索メソッドを呼び出す。
        List<Keyst0210> keyst0210List = keyst0210Mapper.selectByExample(keyst0210Example);

        // DispSklShtS2ListをresForm(DispSklShtS)に設定する。
        List<Keyst10200DispSklShtS2> dispSklShtS2List = new ArrayList<>();
        resForm.setSkillSheetDetail(dispSklShtS2List);
        // 検索結果全件に対して以下の処理をする。
        for (Keyst0210 keyst0210 : keyst0210List) {
            // スキルシート明細EntityをDispSklShtS2に移送する。
            Keyst10200DispSklShtS2 tmpDispSklShtS2 = new Keyst10200DispSklShtS2();
            BeanUtils.copyProperties(keyst0210, tmpDispSklShtS2);
            // 開発規模
            if (Objects.nonNull(keyst0210.getDevScale()) && !keyst0210.getDevScale().isEmpty()) {
                List<String> devScale = new ArrayList<>(Arrays.asList(keyst0210.getDevScale().split(",")));
                tmpDispSklShtS2.setDevScale(devScale);
            } else {
                tmpDispSklShtS2.setDevScale(new ArrayList<>());
            }
            // FW・MW・ツール等
            if (Objects.nonNull(keyst0210.getFwMwTool()) && !keyst0210.getFwMwTool().isEmpty()) {
                List<String> fwMwTool = new ArrayList<>(Arrays.asList(keyst0210.getFwMwTool().split(",")));
                tmpDispSklShtS2.setFwMwTool(fwMwTool);
            } else {
                tmpDispSklShtS2.setFwMwTool(new ArrayList<>());
            }
            // 使用言語
            if (Objects.nonNull(keyst0210.getPgLang()) && !keyst0210.getPgLang().isEmpty()) {
                List<Integer> pgLang = Arrays.stream(keyst0210.getPgLang().split(","))
                        .map(Integer::parseInt)
                        .collect(Collectors.toList());
                tmpDispSklShtS2.setPgLang(pgLang);
            } else {
                tmpDispSklShtS2.setPgLang(new ArrayList<>());
            }
            dispSklShtS2List.add(tmpDispSklShtS2);
        }

        return resForm;
    }

    @Override
    @Transactional
    public Keyst10200SaveS save(String jwt, Keyst10200SaveQ reqForm) {
        // ログインユーザー情報
        Map<String, Object> loginUserInfo = jwtUtil.parseToken(jwt.substring(7));
        // 管理者フラグ
        boolean isAdmin = loginUserInfo.get(jwtUtil.ADMIN_FLG) == Flag.ON;
        // ユーザーID
        Integer loginUserId = Integer.valueOf(loginUserInfo.get(jwtUtil.USER_ID).toString());

        //【スキルシートヘッダー登録】
        // リクエストFormをスキルシートヘッダEntityに移送する。
        Keyst0200 keyst0200 = new Keyst0200();
        BeanUtils.copyProperties(reqForm, keyst0200);
        // スキルシートヘッダEntityに以下の値を設定する。
        if (Objects.isNull(keyst0200.getUserId()) && !isAdmin) {
            // スキルシートヘッダEntityのuserIdが設定されていない、かつ管理者でない場合
            // ログインユーザーIDを設定する。
            keyst0200.setUserId(loginUserId); // ユーザーID
        }
        LocalDateTime SkillSheetRegDatetime = LocalDateTime.now(); // 現在時刻を取得
        SkillSheetRegDatetime = SkillSheetRegDatetime.minusNanos(SkillSheetRegDatetime.getNano()); // ナノ秒を切り捨て
        keyst0200.setSkillSheetRegDatetime(SkillSheetRegDatetime); // スキルシート登録日時
        keyst0200.setDeleteFlg(Flag.OFF); // 削除フラグ
        keyst0200.setVersionExKey(0); // 排他制御カラム
        log.info(keyst0200);
        // INSERT時共通フィールドを設定する。
        entityUtil.setColumns4Insert(keyst0200, loginUserId);

        keyst0200Mapper.insert(keyst0200);
        // 登録したスキルシートヘッダーをユーザーID, 登録日時をキーに再検索する。(登録したスキルシートID取得のため)
        Keyst0200Example keyst0200Example = new Keyst0200Example();
        keyst0200Example.createCriteria()
                .andUserIdEqualTo(keyst0200.getUserId())
                .andSkillSheetRegDatetimeEqualTo(keyst0200.getSkillSheetRegDatetime());
        keyst0200 = keyst0200Mapper.selectByExample(keyst0200Example).get(0);

        //【スキルシート明細登録】
        // リクエストFormをスキルシート明細Entityに移送する。
        List<Keyst10200SaveQ1> skillSheetDetail = reqForm.getSkillSheetDetail();
        int index = 0;
        for (Keyst10200SaveQ1 keyst10200SaveQ1 : skillSheetDetail) {
            Keyst0210 keyst0210 = new Keyst0210();
            BeanUtils.copyProperties(keyst10200SaveQ1, keyst0210);
            // スキルシート明細Entityに以下の値を設定する。
            keyst0210.setSkillSheetId(keyst0200.getSkillSheetId()); // スキルシートID
            keyst0210.setRefNo(index);
            // devScale, fwMwTool, pgLang はList→Stringに変換してセットする必要あり。
            // devScale
            String tempDevScale = String.join(",", keyst10200SaveQ1.getDevScale());
            keyst0210.setDevScale(tempDevScale);
            // fwMwTool
            String tempFwMwTool = String.join(",", keyst10200SaveQ1.getFwMwTool());
            keyst0210.setFwMwTool(tempFwMwTool);
            // pgLang
            String tempPgLang = keyst10200SaveQ1.getPgLang().stream()
                    .map(Object::toString)
                    .collect(Collectors.joining(","));
            keyst0210.setPgLang(tempPgLang);

            // INSERT時共通フィールドを設定する。
            entityUtil.setColumns4Insert(keyst0200, loginUserId);

            log.info(keyst0210);
            index++;
            // INSERTを実行する。
            keyst0210Mapper.insert(keyst0210);
        }

        Keyst10200SaveS resForm = new Keyst10200SaveS();
        resForm.setSkillSheetId(keyst0200.getSkillSheetId());
        resForm.setUserId(keyst0200.getUserId());

        return resForm;
    }

    @Override
    @Transactional
    public Keyst10200UpdateS update(String jwt, Keyst10200UpdateQ reqForm) throws ExclusiveException {
        // ログインユーザー情報
        Map<String, Object> loginUserInfo = jwtUtil.parseToken(jwt.substring(7));
        // ユーザーID
        Integer loginUserId = Integer.valueOf(loginUserInfo.get(jwtUtil.USER_ID).toString());

        //【スキルシートヘッダー更新】
        // バージョンチェック
        Keyst0200 keyst0200 = new Keyst0200();
        keyst0200.setSkillSheetId(reqForm.getSkillSheetId()); // スキルシートID
        keyst0200.setVersionExKey(reqForm.getVersionExKey()); // 排他制御カラム
        keyst0200 = keyst0200Mapper.checkVersion(keyst0200);
        if (keyst0200 == null) {
            throw new ExclusiveException(messageSource.getMessage("E00003", null, Locale.JAPAN));
        }
        log.info(keyst0200);
        // リクエストFormをスキルシートヘッダEntityに移送する。
        BeanUtils.copyProperties(reqForm, keyst0200);
        // スキルシート登録日時を設定する。
        keyst0200.setSkillSheetRegDatetime(LocalDateTime.now()); // スキルシート登録日時
        // UPDATE時共通フィールドを設定する。
        entityUtil.setColumns4Update(keyst0200, loginUserId);

        // UPDATEを実行する。
        keyst0200Mapper.updateByPrimaryKey(keyst0200);

        //【スキルシート明細更新(DELETE-INSERT)】
        // スキルシートIDに紐づく、既存のスキルシート明細全件を削除する。
        Keyst0210Example keyst0210Example = new Keyst0210Example();
        keyst0210Example.createCriteria()
                .andSkillSheetIdEqualTo(keyst0200.getSkillSheetId()); // スキルシートID
        keyst0210Mapper.deleteByExample(keyst0210Example);

        // リクエストFormをスキルシート明細Entityに移送する。
        List<Keyst10200UpdateQ1> skillSheetDetail = reqForm.getSkillSheetDetail();
        int index = 0;
        for (Keyst10200UpdateQ1 keyst10200UpdateQ1 : skillSheetDetail) {
            Keyst0210 keyst0210 = new Keyst0210();
            BeanUtils.copyProperties(keyst10200UpdateQ1, keyst0210);
            // スキルシート明細Entityに以下の値を設定する。
            keyst0210.setSkillSheetId(keyst0200.getSkillSheetId()); // スキルシートID
            keyst0210.setRefNo(index);
            // devScale, fwMwTool, pgLang はList→Stringに変換してセットする必要あり。
            // devScale
            String tempDevScale = String.join(",", keyst10200UpdateQ1.getDevScale());
            keyst0210.setDevScale(tempDevScale);
            // fwMwTool
            String tempFwMwTool = String.join(",", keyst10200UpdateQ1.getFwMwTool());
            keyst0210.setFwMwTool(tempFwMwTool);
            // pgLang
            String tempPgLang = keyst10200UpdateQ1.getPgLang().stream()
                    .map(Object::toString)
                    .collect(Collectors.joining(","));
            keyst0210.setPgLang(tempPgLang);

            // UPDATE時共通フィールドを設定する。
            entityUtil.setColumns4Update(keyst0210, loginUserId);

            log.info(keyst0210);
            index++;
            // INSERTを実行する。
            keyst0210Mapper.insert(keyst0210);
        }

        Keyst10200UpdateS resForm = new Keyst10200UpdateS();
        resForm.setSkillSheetId(keyst0200.getSkillSheetId());
        resForm.setUserId(keyst0200.getUserId());

        return resForm;
    }

    @Override
    @Transactional
    public Keyst10200DeleteS delete(String jwt, Keyst10200DeleteQ reqForm) throws ExclusiveException {
        // レスポンスForm
        Keyst10200DeleteS resForm = new Keyst10200DeleteS();

        // バージョンチェック
        Keyst0200 keyst0200 = new Keyst0200();
        keyst0200.setSkillSheetId(reqForm.getSkillSheetId()); // スキルシートID
        keyst0200.setVersionExKey(reqForm.getVersionExKey()); // 排他制御カラム
        keyst0200 = keyst0200Mapper.checkVersion(keyst0200);
        if (keyst0200 == null) {
            throw new ExclusiveException(messageSource.getMessage("E00003", null, Locale.JAPAN));
        }
        keyst0200.setDeleteFlg(Flag.ON);
        keyst0200Mapper.updateByPrimaryKey(keyst0200);

        resForm.setUserId(keyst0200.getUserId());
        return resForm;
    }
}
