package com.c4c.keystone.form;

import java.time.LocalDate;
import java.time.LocalTime;

import lombok.Data;

@Data
public class Keyst10300DispReserveInfoS1 {
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
     * Column: IMPL_YEAR_MONTH
     * Remark: 実施年月
     */
    private String implYearMonth;

    /**
     * Column: MANAGER_ID
     * Remark: 管理者ID
     */
    private Integer managerId;

    /**
     * Column: TEAM
     * Remark: チーム
     */
    private String team;

}
