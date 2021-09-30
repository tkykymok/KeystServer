package com.c4c.keystone.service.impl;

import java.util.*;

import com.c4c.keystone.constants.Flag;
import com.c4c.keystone.entity.Keyst5300;
import com.c4c.keystone.exception.ExclusiveException;
import com.c4c.keystone.form.*;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.c4c.keystone.entity.Keyst0100;
import com.c4c.keystone.entity.Keyst0100Key;
import com.c4c.keystone.mapper.Keyst0100Mapper;
import com.c4c.keystone.service.IKeyst10100Service;
import com.c4c.keystone.utils.EntityUtil;
import com.c4c.keystone.utils.JwtUtil;

@Service
public class Keyst10100Service implements IKeyst10100Service {

    @Autowired
    Keyst5300Service keyst5300Service;

    @Autowired
    Keyst0100Mapper keyst0100Mapper;
    @Autowired
    JwtUtil jwtUtil;
    @Autowired
    EntityUtil entityUtil;
    @Autowired
    protected MessageSource messageSource;
    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    @Transactional
    public Keyst10100InitS initialize(String jwt) {
        // ログインユーザー情報
        Map<String, Object> loginUserInfo = jwtUtil.parseToken(jwt.substring(7));
        // ユーザーID
        Integer loginUserId = Integer.valueOf(loginUserInfo.get(jwtUtil.USER_ID).toString());

        // レスポンスForm
        Keyst10100InitS resForm = new Keyst10100InitS();

        //////////////////////////////////////////////////////////////
        // ユーザー基本情報取得
        //////////////////////////////////////////////////////////////
        // ユーザー基本情報EntityKeyに以下の値を設定する。
        Keyst0100Key keyst0100Key = new Keyst0100Key();
        keyst0100Key.setUserId(loginUserId);

        // ユーザー基本情報MapperのPK検索メソッドを呼び出す。
        Keyst0100 keyst0100 = keyst0100Mapper.selectByPrimaryKey(keyst0100Key);
        // 検索結果をinitS01に移送する。
        Keyst10100InitS01 initS01 = new Keyst10100InitS01();
        BeanUtils.copyProperties(keyst0100, initS01);

        if (Objects.nonNull(keyst0100.getSkills())) {
            // スキルマスタ取得
            List<Keyst5300> keyst5300List = keyst5300Service.getAllSkills();
            // スキルリストForm(InitS02List)を定義する。
            List<Keyst10100InitS02> keyst10100InitS02List = new ArrayList<>();
            // カンマ区切りのスキルを一文字ずつリストに入れる
            String[] skillList = keyst0100.getSkills().split(",");

            // スキルコードを1件ずつ取り出し、スキル名に変換する。
            for (String skillCodeString : skillList) {
                Keyst10100InitS02 keyst10100InitS02 = new Keyst10100InitS02();
                Integer skillCode = Integer.parseInt(skillCodeString);
                Keyst5300 keyst5300 = keyst5300List.stream()
                        .filter(obj -> skillCode.equals(obj.getSkillCode()))
                        .findFirst()
                        .get();

                // コード値からスキル名に変更した値をスキルForm(initS01)にコピーし、スキルリストForm(initS01List)に設定する。
                BeanUtils.copyProperties(keyst5300, keyst10100InitS02);
                keyst10100InitS02List.add(keyst10100InitS02);
            }
            // スキルリストForm(initS01List)をレスポンスFormに設定する。
            resForm.setSkillList(keyst10100InitS02List);
        }
        // パスワードを空にする。
        initS01.setLoginPw(null);
        // initS01をinitSに設定する。
        resForm.setUserBasicInfo(initS01);

        return resForm;
    }

    @Override
    @Transactional
    public Keyst10100SaveS save(String jwt, Keyst10100SaveQ reqForm) throws ExclusiveException {
        // ログインユーザー情報
        Map<String, Object> loginUserInfo = jwtUtil.parseToken(jwt.substring(7));
        // ユーザーID
        Integer loginUserId = Integer.valueOf(loginUserInfo.get(jwtUtil.USER_ID).toString());

        // バージョンチェック
        Keyst0100 keyst0100 = new Keyst0100();
        keyst0100.setUserId(loginUserId); // ユーザーID
        keyst0100.setVersionExKey(reqForm.getVersionExKey()); // 排他制御カラム
        keyst0100 = keyst0100Mapper.checkVersion(keyst0100);
        if (keyst0100 == null) {
            throw new ExclusiveException(messageSource.getMessage("E00003", null, Locale.JAPAN));
        }
        // UPDATE前のユーザー基本情報Entity
        Keyst0100 beforeUpdateKeyst0100 = new Keyst0100();
        BeanUtils.copyProperties(keyst0100, beforeUpdateKeyst0100);
        // リクエストFormをユーザー基本情報Entityに移送する。
        BeanUtils.copyProperties(reqForm, keyst0100);
        // パスワード
        if (Objects.nonNull(reqForm.getLoginPw())) {
            // 変更後のパスワードが設定されている場合
            // パスワードをハッシュ化して設定する。
            keyst0100.setLoginPw(passwordEncoder.encode(reqForm.getLoginPw()));
        } else {
            // 変更後のパスワードが設定されていない場合
            // 既存のパスワードを再設定する。
            keyst0100.setLoginPw(beforeUpdateKeyst0100.getLoginPw());
        }
        keyst0100.setTeam(beforeUpdateKeyst0100.getTeam()); // チーム
        keyst0100.setAdminFlg(beforeUpdateKeyst0100.getAdminFlg()); // 管理者フラグ
        keyst0100.setDeleteFlg(beforeUpdateKeyst0100.getDeleteFlg()); // 削除フラグ

        // UPDATE時共通フィールドを設定する。
        entityUtil.setColumns4Update(keyst0100, loginUserId);
        // UPDATEを実行する。
        keyst0100Mapper.updateByPrimaryKey(keyst0100);

        return new Keyst10100SaveS();
    }

}
