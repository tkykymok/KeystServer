package com.c4c.keystone.form;

import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

@Data
public class Keyst10300SaveQ {
    /**
     * Column: RESERVE_ID
     * Remark: 予約ID
     */
    private Integer reserveId;

    /**
     * Column: RESERVE_DATE
     * Remark: 予約日
     */
    private LocalDate reserveDate;

    /**
     * Column:
     * Remark: 開始時間
     */
    private LocalTime fromTime;

    /**
     * Column:
     * Remark: 終了時間
     */
    private LocalTime toTime;

    /**
     * Column: TEAM
     * Remark: チーム
     */
    private String team;

}
