package com.c4c.keystone.form;

import java.util.Date;
import java.util.List;

public class Keyst10200Disp1 {
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
    private Date birthday;

    /**
     * Column: NATIONALITY
     * Remark: 国籍
     */
    private String nationality;

    /**
     * Column: PARTNER_FLG
     * Remark: 配偶者フラグ
     */
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
    private Date finalEducationDate;

    /**
     * Column: FINAL_EDUCATION_CONTENT
     * Remark: 最終学歴内容
     */
    private String finalEducationContent;

    /**
     * Column: SKILLS
     * Remark: 保有スキル
     */
    private List<String> skills;

    /**
     * 資格リスト
     */
    private List<Keyst10200DispS2> qualifications;

    /**
     * Column: SKILL_SHEET_ID
     * Remark: スキルシートID
     */
    private Integer skillSheetId;

    /**
     * Column: STRONG_AREA
     * Remark: 得意分野
     */
    private String strongArea;

    /**
     * Column: PR
     * Remark: PR
     */
    private String pr;

    /**
     * Column: EVALUATION_OF_SALES
     * Remark: 営業評価
     */
    private String evaluationOfSales;

    /**
     * Column: VERSION_EX_KEY
     * Remark: 排他制御カラム(スキルシートヘッダー)
     */
    private Integer versionExKey;

    /**
     * スキルシート明細リスト
     */
    private List<Keyst10200DispS3> SkillSheetDetailsList;
}
