package com.c4c.keystone.form;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class Keyst10700UpdateQ {
    /**
     * Column: CUST_CODE
     * Remark: 顧客コード
     */
    @NotEmpty(message = "{custCode}{NotEmpty}")
    @Size(min = 5, max = 5, message = "{custCode}{Size}")
    private String custCode;

    /**
     * Column: CUST_NAME
     * Remark: 顧客名
     */
    @NotEmpty(message = "{custName}{NotEmpty}")
    @Size(max = 20, message = "{custName}{Size.less_max}")
    private String custName;

    /**
     * Column: CUST_PIC
     * Remark: 顧客担当者名
     */
    @Size(max = 30, message = "{custPic}{Size.less_max}")
    private String custPic;

    /**
     * Column: VERSION_EX_KEY
     * Remark: 排他制御カラム
     */
    private Integer versionExKey;
}
