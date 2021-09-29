package com.c4c.keystone.form;

import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Data
public class Keyst10600UpdateQ {
    /**
     * Column: NOTIFICATION_ID
     * Remark: お知らせID
     */
    private Integer notificationId;

    /**
     * Column: TITLE
     * Remark: 件名
     */
    @NotEmpty(message = "{title}{NotEmpty}")
    private String title;

    /**
     * Column: CONTENT
     * Remark: 本文
     */
    @NotEmpty(message = "{content}{NotEmpty}")
    private String content;

    /**
     * Column: POST_START_DATE
     * Remark: 掲載開始日
     */
    @NotNull(message = "{postStartDate}{NotEmpty}")
    private LocalDate postStartDate;

    /**
     * Column: POST_END_DATE
     * Remark: 掲載終了日
     */
    @NotNull(message = "{postEndDate}{NotEmpty}")
    private LocalDate postEndDate;

    /**
     * Column: VERSION_EX_KEY
     * Remark: 排他制御カラム
     */
    private Integer versionExKey;
}
