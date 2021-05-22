package com.c4c.keystone.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;

/**
 * Table: KEYST0200
 */
@Data
@EqualsAndHashCode
public class Keyst0200ExtraS01 {
    /**
     * Column: SKILL_SHEET_ID
     */
    private Integer skillSheetId;

    /**
     * Column: USER_ID
     */
    private String userId;

    /**
     * Column: COMMENT
     */
    private String comment;
}
