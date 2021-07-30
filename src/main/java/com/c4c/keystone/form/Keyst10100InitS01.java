package com.c4c.keystone.form;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
public class Keyst10100InitS01 {
    /**
     * Column: USER_ID
     * Remark: ユーザーID
     */
    private Integer userId;

    /**
     * Column: USER_NAME
     * Remark: ユーザー名
     */
    private String userName;

    /**
     * Column: USER_NAME_KANA
     * Remark: ユーザー名かな
     */
    private String userNameKana;

    /**
     * Column: EMAIL
     * Remark: メールアドレス
     */
    private String email;

    /**
     * Column: LOGIN_ID
     * Remark: ログインID
     */
    private String loginId;

    /**
     * Column: LOGIN_PW
     * Remark: ログインパスワード
     */
    private String loginPw;

    /**
     * Column: PRF_IMG_STRG_DRCTRY
     * Remark: プロフィール画像
     */
    private String PrfImgStrgDrctry;

    /**
     * Column: GENDER
     * Remark: 性別
     */
    private String gender;

    /**
     * Column: AGE
     * Remark: 年齢
     */
    private Integer age;

    /**
     * Column: BIRTHDAY
     * Remark: 生年月日
     */
    private LocalDate birthday;

    /**
     * Column: NATIONALITY
     * Remark: 国籍
     */
    private String nationality;

    /**
     * Column: PARTNER_FLG
     * Remark: 配偶者フラグ
     */
    @JsonSerialize(using = JsonUtils.FlagSerializer.class)
    private String partnerFlg;

    /**
     * Column: NEAREST_STATION
     * Remark: 最寄駅
     */
    private String nearestStation;

    /**
     * Column: FINAL_EDUCATION_DATE
     * Remark: 最終学駅年月日
     */
    private LocalDate finalEducationDate;

    /**
     * Column: FINAL_EDUCATION_CONTENT
     * Remark: 最終学歴内容
     */
    private String finalEducationContent;

    /**
     * Column: POSTAL_CODE
     * Remark: 郵便番号
     */
    private String postalCode;

    /**
     * Column: ADRESS
     * Remark: 住所
     */
    private String adress;

    /**
     * Column: PHONE_NUMBER
     * Remark: 電話番号
     */
    private String phoneNumber;

    /**
     * Column: BANK_NAME
     * Remark: 銀行名
     */
    private String bankName;

    /**
     * Column: BRANCH_NAME
     * Remark: 支店名
     */
    private String branchName;

    /**
     * Column: BRANCH_ID
     * Remark: 支店番号
     */
    private String branchId;

    /**
     * Column: ACCOUNT_TYPE
     * Remark: 口座種別
     */
    private String accountType;

    /**
     * Column: ACCOUNT_NUMBER
     * Remark: 口座番号
     */
    private String accountNumber;

    /**
     * Column: ACCOUNT_NAME
     * Remark: 名義人
     */
    private String accountName;
}

