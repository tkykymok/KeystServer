package com.c4c.keystone.form;

import java.time.LocalDate;

import lombok.Data;

@Data
public class Keyst10500UpdateQ2 {
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
     * Column: PRJ_START_DATE
     * Remark: 稼働開始年月日
     */
    private LocalDate prjStartDate;

    /**
     * Column: PRJ_END_DATE
     * Remark: 稼働終了年月日
     */
    private LocalDate prjEndDate;

    /**
     * Column: VERSION_EX_KEY
     * Remark: 排他制御カラム
     */
    private Integer versionExKey;
}
