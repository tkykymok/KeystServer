package com.c4c.keystone.form;

import lombok.Data;

import java.util.Date;

@Data
public class Keyst10200InitS02 {
    /**
     * Column: QUALIFIED_DATE
     * Remark: 資格取得年月日
     */
    private Date qualifiedDate;

    /**
     * Column: QUALIFICATION_CONTENT
     * Remark: 資格内容
     */
    private String qualificationContent;
}
