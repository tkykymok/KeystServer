package com.c4c.keystone.entity;

import java.time.LocalDateTime;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Table: KEYST5300
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class Keyst5300 extends Keyst5300Key {
    /**
     * Column: SKILL_NAME
     * Remark: スキル名
     */
    private String skillName;

    /**
     * Column: LANG_FLG
     * Remark: 言語フラグ
     */
    private Integer langFlg;

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
