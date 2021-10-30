package com.c4c.keystone.form;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.validation.constraints.FutureOrPresent;
import javax.validation.constraints.NotNull;

import lombok.Data;

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
    @NotNull(message = "{reserveDate}{NotEmpty}")
    @FutureOrPresent(message = "{FutureOrPresent}")
    private LocalDate reserveDate;

    /**
     * Column:
     * Remark: 開始時間
     */
    @NotNull(message = "{fromTime}{NotEmpty}")
    private LocalTime fromTime;

    /**
     * Column:
     * Remark: 終了時間
     */
    @NotNull(message = "{toTime}{NotEmpty}")
    private LocalTime toTime;

    /**
     * Column: TEAM
     * Remark: チーム
     */
    private String team;

}
