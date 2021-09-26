package com.c4c.keystone.entity;

import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * Table: KEYST0400
 */
@Data
public class Keyst0400ExtraS01 {
    /**
     * Column: NOTIFICATION_ID
     * Remark: お知らせID
     */
    private Integer notificationId;

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
     * Remark: お知らせ登録者名
     */
    private String notificationRegPersonName;

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
     * Column: VERSION_EX_KEY
     * Remark: 排他制御カラム
     */
    private Integer versionExKey;
}
