package com.c4c.keystone.form;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

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
    @NotNull(message = "{userComment}{NotEmpty}")
    @Size(max = 200, message = "{userComment}{Size.less_max}")
    private String userComment;

    /**
     * Column: MANAGER_COMMENT
     * Remark: 管理者コメント
     */
    @Size(max = 200, message = "{managerComment}{Size.less_max}")
    private String managerComment;

    /**
     * Column: VERSION_EX_KEY
     * Remark: 排他制御カラム
     */
    private Integer versionExKey;

}
