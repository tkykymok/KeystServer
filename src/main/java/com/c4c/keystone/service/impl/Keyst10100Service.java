package com.c4c.keystone.service.impl;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.c4c.keystone.entity.Keyst0100;
import com.c4c.keystone.entity.Keyst0100Key;
import com.c4c.keystone.form.Keyst10100InitS;
import com.c4c.keystone.form.Keyst10100InitS01;
import com.c4c.keystone.form.Keyst10100SaveQ;
import com.c4c.keystone.form.Keyst10100SaveS;
import com.c4c.keystone.mapper.Keyst0100Mapper;
import com.c4c.keystone.service.IKeyst10100Service;
import com.c4c.keystone.utils.JwtUtil;

@Service
public class Keyst10100Service implements IKeyst10100Service {

    @Autowired
    Keyst0100Mapper keyst0100Mapper;
    @Autowired
    JwtUtil jwtUtil;

    @Override
    @Transactional
    public Keyst10100InitS initialize() {
        // レスポンスForm
        Keyst10100InitS resForm = new Keyst10100InitS();

        //////////////////////////////////////////////////////////////
        // ユーザー基本情報取得
        //////////////////////////////////////////////////////////////
        // ログインユーザーIDをセッションから取得する。
        Integer userId = 1; // TODO 暫定

        // ユーザー基本情報EntityKeyに以下の値を設定する。
        Keyst0100Key keyst0100Key = new Keyst0100Key();
        keyst0100Key.setUserId(userId);

        // ユーザー基本情報MapperのPK検索メソッドを呼び出す。
        Keyst0100 keyst0100 = keyst0100Mapper.selectByPrimaryKey(keyst0100Key);
        // 検索結果をinitS01に移送する。
        Keyst10100InitS01 initS01 = new Keyst10100InitS01();
        BeanUtils.copyProperties(keyst0100, initS01);

        // initS01をinitSに設定する。
        resForm.setUserBasicInfo(initS01);

        return resForm;
    }

    @Override
    @Transactional
    public Keyst10100SaveS save(String jwt, Keyst10100SaveQ reqForm) {

        Keyst0100 keyst0100 = new Keyst0100();
        BeanUtils.copyProperties(reqForm, keyst0100);

        keyst0100Mapper.insert(keyst0100);

        Keyst10100SaveS resForm = new Keyst10100SaveS();
        resForm.setUserName(keyst0100.getUserName());
        resForm.setUserNameKana(keyst0100.getUserNameKana());
        resForm.setTeam(keyst0100.getTeam());
        resForm.setGender(keyst0100.getGender());
        resForm.setAge(keyst0100.getAge());
        resForm.setBirthday(keyst0100.getBirthday());
        resForm.setNationality(keyst0100.getNationality());
        resForm.setPartnerFlg(keyst0100.getPartnerFlg());
        resForm.setNearestStation(keyst0100.getNearestStation());
        resForm.setFinalEducationDate(keyst0100.getFinalEducationDate());
        resForm.setFinalEducationContent(keyst0100.getFinalEducationContent());
        resForm.setSkills(keyst0100.getSkills());
        resForm.setEmail(keyst0100.getEmail());
        resForm.setLoginId(keyst0100.getLoginId());
        resForm.setLoginPw(keyst0100.getLoginPw());
        resForm.setAdminFlg(keyst0100.getAdminFlg());
        resForm.setPrfImgStrgDrctry(keyst0100.getPrfImgStrgDrctry());
        resForm.setPostalCode(keyst0100.getPostalCode());
        resForm.setAddress(keyst0100.getAddress());
        resForm.setPhoneNumber(keyst0100.getPhoneNumber());
        resForm.setBankName(keyst0100.getBankName());
        resForm.setBranchName(keyst0100.getBranchName());
        resForm.setBranchId(keyst0100.getBranchId());
        resForm.setAccountType(keyst0100.getAccountType());
        resForm.setAccountNumber(keyst0100.getAccountNumber());
        resForm.setAccountName(keyst0100.getAccountName());

        return resForm;
    }

}
