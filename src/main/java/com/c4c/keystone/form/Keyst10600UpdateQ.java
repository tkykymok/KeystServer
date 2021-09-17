package com.c4c.keystone.form;

import lombok.Data;

import java.time.LocalDate;

@Data
public class Keyst10600UpdateQ {
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
