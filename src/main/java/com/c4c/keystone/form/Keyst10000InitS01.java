package com.c4c.keystone.form;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Keyst10000InitS01 {
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
     * Column: NOTIFICATION_REG_DATETIME
     * Remark: お知らせ登録日時
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime notificationRegDatetime;

}
