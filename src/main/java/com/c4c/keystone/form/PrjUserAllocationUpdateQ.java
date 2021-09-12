package com.c4c.keystone.form;

import lombok.Data;

@Data
public class PrjUserAllocationUpdateQ {
    /**
     * Column: PRJ_CODE
     * Remark: 案件コード
     */
    private String prjCode;

    /**
     * Column: USER_ID
     * Remark: ユーザーID
     */
    private Integer userId;

    /**
     * Column: CONTRACT_PRICE
     * Remark: 契約単価
     */
    private Integer contractPrice;

    /**
     * Column: VERSION_EX_KEY
     * Remark: 排他制御カラム
     */
    private Integer versionExKey;
}
