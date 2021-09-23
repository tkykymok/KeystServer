package com.c4c.keystone.form;

import lombok.Data;

@Data
public class Keyst10300SaveQ {
    /**
     * Column: USER_ID
     * Remark: ユーザーID
     */
    private Integer userId;

    /**
     * Column: RESERVE_DATE
     * Remark: 実施月
     */
    private String reserveDate;

    /**
     * Column:
     * Remark: 開始時間
     */
    private String fromTime;

    /**
     * Column:
     * Remark: 終了時間
     */
    private String toTime;

    /**
     * Column: TEAM
     * Remark: チーム
     */
    private String team;

}
