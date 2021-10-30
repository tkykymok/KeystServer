package com.c4c.keystone.form;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.validation.constraints.FutureOrPresent;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class Keyst10300ReserveQ {
    /**
     * Column: RESERVE_ID
     * Remark: 予約ID
     */
    private Integer reserveId;

    /**
     * Column: RESERVE_DATE
     * Remark: 予約日
     */
    @FutureOrPresent
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
    @NotNull(message = "ワタシノキモチを選択してください")
    private Integer feeling;

    /**
     * Column: REMARK
     * Remark: 備考
     */
    @Size(max = 100, message = "備考{Size.less_max}")
    private String remark;

    /**
     * Column: VERSION_EX_KEY
     * Remark: 排他制御カラム
     */
    private Integer versionExKey;

}
