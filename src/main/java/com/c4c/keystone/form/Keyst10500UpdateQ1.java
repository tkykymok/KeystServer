package com.c4c.keystone.form;

import lombok.Data;

@Data
public class Keyst10500UpdateQ1 {
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
     * Column: CUST_CODE
     * Remark: 顧客コード
     */
    private String custCode;

    /**
     * Column: CUST_NAME
     * Remark: 顧客名
     */
    private String custName;

    /**
     * Column: END_CUST_NAME
     * Remark: エンド顧客名
     */
    private String endCustName;

    /**
     * Column: REMARK
     * Remark: 備考
     */
    private String remark;

    /**
     * Column: VERSION_EX_KEY
     * Remark: 排他制御カラム
     */
    private Integer versionExKey;
}
