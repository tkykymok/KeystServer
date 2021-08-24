package com.c4c.keystone.form;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
public class Keyst10200InitS01 {
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
    private List<Keyst10200InitS02> skillList;

    /**
     * 資格一覧
     */
    private List<Keyst10200InitS03> qualificationList;
}

