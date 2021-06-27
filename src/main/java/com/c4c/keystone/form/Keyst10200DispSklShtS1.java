package com.c4c.keystone.form;

import lombok.Data;

@Data
public class Keyst10200DispSklShtS1 {
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
     * Remark: 排他制御カラム
     */
    private Integer versionExKey;
}
