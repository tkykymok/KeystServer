package com.c4c.keystone.form;

import lombok.Data;

@Data
public class Keyst10600DeleteQ {
    /**
     * Column: NOTIFICATION_ID
     * Remark: お知らせID
     */
    private Integer notificationId;

    /**
     * Column: VERSION_EX_KEY
     * Remark: 排他制御カラム
     */
    private Integer versionExKey;
}
