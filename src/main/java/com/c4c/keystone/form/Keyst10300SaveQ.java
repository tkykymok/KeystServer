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
    @NotNull(message = "日付を選択してください")
    @FutureOrPresent(message = "本日以降の日付を選択してください")
    private LocalDate reserveDate;

    /**
     * Column:
     * Remark: 開始時間
     */
    @NotNull(message = "開始時間を選択してください")
//    @Pattern(regexp = "^([01][0-9]|2[0-3]):[0-5][0-9]$", message = "開始時間は正しく選択してください")
    private LocalTime fromTime;

    /**
     * Column:
     * Remark: 終了時間
     */
    @NotNull(message = "終了時間を選択してください")
//    @Pattern(regexp = "^([01][0-9]|2[0-3]):[0-5][0-9]$", message = "終了時間は正しく選択してください")
    private LocalTime toTime;

    /**
     * Column: TEAM
     * Remark: チーム
     */
    private String team;

}
