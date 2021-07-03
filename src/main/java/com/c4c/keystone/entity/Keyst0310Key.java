package com.c4c.keystone.entity;

import java.time.LocalDate;
import java.time.LocalTime;
import lombok.Data;

/**
 * Table: KEYST0310
 */
@Data
public class Keyst0310Key {
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
     * Column: RESERVE_TIME
     * Remark: 予約時間
     */
    private LocalTime reserveTime;
}