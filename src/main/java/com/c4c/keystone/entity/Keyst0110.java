package com.c4c.keystone.entity;

import java.util.Date;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Table: KEYST0110
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class Keyst0110 extends Keyst0110Key {
    /**
     * Column: CREATED_DATETIME
     * Remark: 作成日時
     */
    private Date createdDatetime;

    /**
     * Column: CREATED_USER
     * Remark: 作成者ID
     */
    private Integer createdUser;

    /**
     * Column: LAST_MODIFIED_DATETIME
     * Remark: 最終変更日時
     */
    private Date lastModifiedDatetime;

    /**
     * Column: LAST_MODIFIED_USER
     * Remark: 最終変更者ID
     */
    private Integer lastModifiedUser;

    /**
     * Column: VERSION_EX_KEY
     * Remark: 排他制御カラム
     */
    private Integer versionExKey;
}
