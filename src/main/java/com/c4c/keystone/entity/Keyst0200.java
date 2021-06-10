package com.c4c.keystone.entity;

import java.util.Date;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Table: KEYST0200
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class Keyst0200 extends Keyst0200Key {
    /**
     * Column: USER_ID
     * Remark: ユーザーID
     */
    private Integer userId;

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
     * Column: SKILL_SHEET_REG_DATETIME
     * Remark: スキルシート登録日時
     */
    private Date skillSheetRegDatetime;

    /**
     * Column: DELETE_FLG
     * Remark: 削除フラグ
     */
    private String deleteFlg;

    /**
     * Column: CREATED_DATETIME
     * Remark: 作成日時
     */
    private Date createdDatetime;

    /**
     * Column: CREATED_USER
     * Remark: 作成者ID
     */
    private Integer createdUser;

    /**
     * Column: LAST_MODIFIED_DATETIME
     * Remark: 最終変日時
     */
    private Date lastModifiedDatetime;

    /**
     * Column: LAST_MODIFIED_USER
     * Remark: 最終変更者ID
     */
    private Integer lastModifiedUser;

    /**
     * Column: VERSION_EX_KEY
     * Remark: 排他制御カラム
     */
    private Integer versionExKey;
}
