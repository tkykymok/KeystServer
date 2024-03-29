package com.c4c.keystone.form;

import java.time.LocalDate;

import lombok.Data;

@Data
public class Keyst10100SaveS extends ResponseFormBase {
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
     * Column: TEAM
     * Remark: チーム
     */
    private String team;

    /**
     * Column: GENDER
     * Remark: 性別
     */
    private Integer gender;

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
    private Integer partnerFlg;

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
     * Column: SKILLS
     * Remark: 保有スキル
     */
    private String skills;

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
     * Column: ADMIN_FLG
     * Remark: 管理者フラグ
     */
    private Integer adminFlg;

    /**
     * Column: PRF_IMG_STRG_DRCTRY
     * Remark: プロフィール画像格納先ディレクトリ
     */
    private String prfImgStrgDrctry;

    /**
     * Column: POSTAL_CODE
     * Remark: 郵便番号
     */
    private String postalCode;

    /**
     * Column: ADDRESS
     * Remark: 住所
     */
    private String address;

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
