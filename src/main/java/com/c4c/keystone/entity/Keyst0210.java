package com.c4c.keystone.entity;

import java.util.Date;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Table: KEYST0210
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class Keyst0210 extends Keyst0210Key {
    /**
     * Column: PRJ_CODE
     */
    private String prjCode;

    /**
     * Column: PRJ_START_DATE
     */
    private Date prjStartDate;

    /**
     * Column: PRJ_END_DATE
     */
    private Date prjEndDate;

    /**
     * Column: BIZ_IN_CHARGE
     */
    private String bizInCharge;

    /**
     * Column: COMMENT
     */
    private String comment;

    /**
     * Column: DEV_SCALE
     */
    private String devScale;

    /**
     * Column: OS
     */
    private String os;

    /**
     * Column: DB
     */
    private String db;

    /**
     * Column: FW_MW_TOOL
     */
    private String fwMwTool;

    /**
     * Column: PG_LANG
     */
    private String pgLang;

    /**
     * Column: SCOPE_OF_WORK
     */
    private String scopeOfWork;

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
