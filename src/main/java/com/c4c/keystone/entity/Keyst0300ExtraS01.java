package com.c4c.keystone.entity;

import java.time.LocalDate;
import java.time.LocalTime;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Table: KEYST0300
 */
@Data
@EqualsAndHashCode
public class Keyst0300ExtraS01 {
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
     * Column: MANAGER_ID
     * Remark: 管理者ID
     */
    private Integer managerId;

    /**
     * Column: TEAM
     * Remark: チーム
     */
    private String team;

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
     * Column: USER_ID
     * Remark: ユーザーID
     */
    private Integer userId;

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
     * Column: REMARK
     * Remark: 備考
     */
    private String remark;

    /**
     * Column: FEELING
     * Remark: ワタシノキモチ
     */
    private Integer feeling;

    /**
     * Column: USER_NAME
     * Remark: ユーザー名
     */
    private String userName;

}
