package com.c4c.keystone.form;

import lombok.Data;

import java.time.LocalDate;
import java.time.LocalTime;

@Data
public class Keyst10300InitS02 {
    /**
     * Column: RESERVE_ID
     * Remark: 予約ID
     */
    private Integer reserveId;

    /**
     * Column: IMPL_YEAR_MONTH
     * Remark: 実施年月
     */
    private String implYearMonth;

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
     * Column: MANAGER_NAME
     * Remark: 管理者名(1on1担当者)
     */
    private String managerName;

    /**
     * Column: USER_COMMENT
     * Remark: ユーザーコメント
     */
    private String userComment;

    /**
     * Column: MANAGER_COMMENT
     * Remark: 管理者コメント
     */
    private String managerComment;

    /**
     * Column: VERSION_EX_KEY
     * Remark: 排他制御カラム
     */
    private Integer versionExKey;

}
