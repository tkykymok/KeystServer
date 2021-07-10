package com.c4c.keystone.entity;

import java.time.LocalDate;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Table: KEYST0100
 */
@Data
@EqualsAndHashCode
public class Keyst0100ExtraS01 {

    /**
     * Column: USER_ID
     */
    private Integer userId;

    /**
     * Column: USER_NAME
     */
    private String userName;

    /**
     * Column: TEAM
     */
    private String team;

    /**
     * Column: PRF_IMG_STRG_DRCTRY
     */
    private String prfImgStrgDrctry;

    /**
     * Column: SKILLS
     */
    private String skills;

    /**
     * Column: PRJ_NAME
     */
    private String prjName;

    /**
     * Column: CONTRACT_PRICE
     */
    private Integer contractPrice;

    /**
     * Column: PRJ_START_DATE
     */
    private LocalDate prjStartDate;
}
