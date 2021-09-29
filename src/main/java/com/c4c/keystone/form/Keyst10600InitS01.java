package com.c4c.keystone.form;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * Table: KEYST0400
 */
@Data
public class Keyst10600InitS01 {
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
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
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
     * Remark: 掲載終了フラグ
     */
    @JsonSerialize(using = JsonUtils.FlagSerializer.class)
    private Integer expiredFlag;

    /**
     * Column: VERSION_EX_KEY
     * Remark: 排他制御カラム
     */
    private Integer versionExKey;
}
