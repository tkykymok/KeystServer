package com.c4c.keystone.form;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class Keyst10500SaveQ {
    /**
     * Column: PRJ_CODE
     * Remark: 案件コード
     */
    @NotEmpty(message = "{prjCode}{NotEmpty}")
    @Size(min = 5, max = 5, message = "{prjCode}{Size}")
    private String prjCode;

    /**
     * Column: PRJ_NAME
     * Remark: 案件名
     */
    @NotEmpty(message = "{prjName}{NotEmpty}")
    @Size(max = 30, message = "{prjName}{Size.less_max}")
    private String prjName;

    /**
     * Column: CUST_CODE
     * Remark: 顧客コード
     */
    private String custCode;

    /**
     * Column: END_CUST_NAME
     * Remark: エンド顧客名
     */
    @Size(max = 30, message = "{endCustName}{Size.less_max}")
    private String endCustName;

    /**
     * Column: REMARK
     * Remark: 備考
     */
    @Size(max = 255, message = "{remark}{Size.less_max}")
    private String remark;
}
