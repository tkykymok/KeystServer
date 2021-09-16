package com.c4c.keystone.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Table: KEYST0400
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class Keyst0400 extends Keyst0400Key {
    /**
     * Column: TITLE
     * Remark: 件名
     */
    private String title;

    /**
     * Column: CONTENT
     * Remark: 本文
     */
    private String content;

    /**
     * Column: NOTIFICATION_REG_ID
     * Remark: お知らせ登録者ID
     */
    private Integer notificationRegId;

    /**
     * Column: NOTIFICATION_REG_DATETIME
     * Remark: お知らせ登録日時
     */
    private LocalDateTime notificationRegDatetime;

    /**
     * Column: POST_START_DATE
     * Remark: 掲載開始日
     */
    private LocalDate postStartDate;

    /**
     * Column: POST_END_DATE
     * Remark: 掲載終了日
     */
    private LocalDate postEndDate;

    /**
     * Column: DELETE_FLG
     * Remark: 削除フラグ
     */
    private Integer deleteFlg;

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
