package com.c4c.keystone.entity;

import java.util.Date;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Table: KEYST0200
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class Keyst0200 extends Keyst0200Key {
    /**
     * Column: USER_ID
     */
    private String userId;

    /**
     * Column: SKILLS
     */
    private String skills;

    /**
     * Column: STRONG_AREA
     */
    private String strongArea;

    /**
     * Column: PR
     */
    private String pr;

    /**
     * Column: EVALUATION_OF_SALES
     */
    private String evaluationOfSales;

    /**
     * Column: CREATED_DATETIME
     */
    private Date createdDatetime;

    /**
     * Column: CREATED_USER
     */
    private String createdUser;

    /**
     * Column: LAST_MODIFIED_DATETIME
     */
    private Date lastModifiedDatetime;

    /**
     * Column: LAST_MODIFIED_USER
     */
    private String lastModifiedUser;

    /**
     * Column: VERSION_EX_KEY
     */
    private Integer versionExKey;
}
