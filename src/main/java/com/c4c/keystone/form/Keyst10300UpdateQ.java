package com.c4c.keystone.form;

import java.time.LocalDate;
import java.time.LocalTime;

import lombok.Data;

@Data
public class Keyst10300UpdateQ {
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
     * Column: USER_COMMENT
     * Remark: ユーザーコメント
     */
    private String userComment;

    /**
     * Column: MANAGER_COMMENT
     * Remark: 管理者コメント
     */
    private String managerComment;

}
