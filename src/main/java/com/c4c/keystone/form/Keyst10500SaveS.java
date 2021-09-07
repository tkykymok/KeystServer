package com.c4c.keystone.form;

import lombok.Data;

@Data
public class Keyst10500SaveS extends ResponseFormBase {
    /**
     * Column: USER_ID
     * Remark: ユーザーID
     */
    private Integer userId;

    /**
     * Column: PRJ_CODE
     * Remark: 案件コード
     */
    private String prjCode;
}
