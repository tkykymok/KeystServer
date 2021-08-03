package com.c4c.keystone.form;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;

@Data
public class Keyst10400InitS02 {
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
    @JsonFormat(pattern = "yyyy/MM/dd")
    private LocalDate prjStartDate;
}
