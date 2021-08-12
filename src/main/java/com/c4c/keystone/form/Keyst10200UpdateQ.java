package com.c4c.keystone.form;

import lombok.Data;

import javax.validation.Valid;
import javax.validation.constraints.Size;
import java.util.List;

@Data
public class Keyst10200UpdateQ {
    /**
     * Column: SKILL_SHEET_ID
     * Remark: スキルシートID
     */
    private Integer skillSheetId;

    /**
     * Column: STRONG_AREA
     * Remark: 得意分野
     */
    @Size(max = 500, message = "{strongArea}{Size.less_max}")
    private String strongArea;

    /**
     * Column: PR
     * Remark: PR
     */
    @Size(max = 500, message = "{pr}{Size.less_max}")
    private String pr;

    /**
     * Column: EVALUATION_OF_SALES
     * Remark: 営業評価
     */
    @Size(max = 500, message = "{evaluationOfSales}{Size.less_max}")
    private String evaluationOfSales;

    /**
     * Column: VERSION_EX_KEY
     * Remark: 排他制御カラム
     */
    private Integer versionExKey;

    /**
     * スキルシート明細List
     */
    @Valid
    List<Keyst10200SaveQ1> skillSheetDetail;
}
