package com.c4c.keystone.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Table: KEYST5110
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class Keyst5110 extends Keyst5110Key {
    /**
     * Column: CONTRACT_PRICE
     * Remark: 契約単価
     */
    private Integer contractPrice;

    /**
     * Column: PRJ_START_DATE
     * Remark: 稼働開始年月日
     */
    private LocalDate prjStartDate;

    /**
     * Column: PRJ_END_DATE
     * Remark: 稼働終了年月日
     */
    private LocalDate prjEndDate;

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
     * Remark: 最終変日時
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
