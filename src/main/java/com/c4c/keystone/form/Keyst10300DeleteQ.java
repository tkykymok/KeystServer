package com.c4c.keystone.form;

import lombok.Data;

import java.time.LocalDate;
import java.time.LocalTime;

@Data
public class Keyst10300DeleteQ {
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
