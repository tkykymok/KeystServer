package com.c4c.keystone.entity;

import java.time.LocalDateTime;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Table: KEYST0300
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class Keyst0300 extends Keyst0300Key {
    /**
     * Column: IMPL_YEAR_MONTH
     * Remark: 実施年月
     */
    private String implYearMonth;

    /**
     * Column: MANAGER_ID
     * Remark: 管理者ID
     */
    private Integer managerId;

    /**
     * Column: TEAM
     * Remark: チーム
     */
    private String team;

    /**
     * Column: CREATED_DATETIME
     * Remark: 作成日時
     */
    private LocalDateTime createdDatetime;

    /**
     * Column: CREATED_USER
     * Remark: 作成者ID
     */
    private Integer createdUser;

    /**
     * Column: LAST_MODIFIED_DATETIME
     * Remark: 最終変更日時
     */
    private LocalDateTime lastModifiedDatetime;

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
