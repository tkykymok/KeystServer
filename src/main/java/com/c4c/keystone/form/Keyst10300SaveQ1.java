package com.c4c.keystone.form;

import java.time.LocalDate;
import java.time.LocalTime;

import lombok.Data;

@Data
public class Keyst10300SaveQ1 {
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

    /**
     * Column: FEELING
     * Remark: ワタシノキモチ
     */
    private Integer feeling;

    /**
     * Column: REMARK
     * Remark: 備考
     */
    private String remark;

}
