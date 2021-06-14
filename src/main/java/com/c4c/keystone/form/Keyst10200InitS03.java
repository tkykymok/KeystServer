package com.c4c.keystone.form;

import lombok.Data;

import java.time.LocalDate;

@Data
public class Keyst10200InitS03 {
    /**
     * Column: QUALIFIED_DATE
     * Remark: 資格取得年月日
     */
    private LocalDate qualifiedDate;

    /**
     * Column: QUALIFICATION_CONTENT
     * Remark: 資格内容
     */
    private String qualificationContent;
}
