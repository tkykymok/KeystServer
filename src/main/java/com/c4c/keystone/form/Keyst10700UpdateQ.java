package com.c4c.keystone.form;

import lombok.Data;

@Data
public class Keyst10700UpdateQ {
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
     * Column: CUST_PIC
     * Remark: 顧客担当者名
     */
    private String custPic;

    /**
     * Column: VERSION_EX_KEY
     * Remark: 排他制御カラム
     */
    private Integer versionExKey;
}
