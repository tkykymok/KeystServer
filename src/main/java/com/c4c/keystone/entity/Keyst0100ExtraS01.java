package com.c4c.keystone.entity;

import java.time.LocalDate;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Table: KEYST0100
 */
@Data
@EqualsAndHashCode
public class Keyst0100ExtraS01 {
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
     * Column: TEAM
     * Remark: チーム
     */
    private String team;

    /**
     * Column: PRF_IMG_STRG_DRCTRY
     * Remark: プロフィール画像格納先ディレクトリ
     */
    private String prfImgStrgDrctry;

    /**
     * Column: SKILLS
     * Remark: 保有スキル
     */
    private String skills;

    /**
     * Column: PRJ_CODE
     * Remark: 案件コード
     */
    private String prjCode;

    /**
     * Column: PRJ_NAME
     * Remark: 案件名
     */
    private String prjName;

    /**
     * Column: CONTRACT_PRICE
     * Remark: 契約単価
     */
    private Integer contractPrice;

    /**
     * Column: PRJ_START_DATE
     * Remark: 稼働開始年月日
     */
    private LocalDate prjStartDate;

    /**
     * Column: PRJ_END_DATE
     * Remark: 稼働終了年月日
     */
    private LocalDate prjEndDate;
}
