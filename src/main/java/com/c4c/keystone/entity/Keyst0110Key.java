package com.c4c.keystone.entity;

import java.util.Date;
import lombok.Data;

/**
 * Table: KEYST0110
 */
@Data
public class Keyst0110Key {
    /**
     * Column: USER_ID
     * Remark: ユーザーID
     */
    private Integer userId;

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