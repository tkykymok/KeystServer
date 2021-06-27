package com.c4c.keystone.entity;

import java.time.LocalDateTime;
import lombok.Data;

/**
 * Table: KEYST0310
 */
@Data
public class Keyst0310Key {
    /**
     * Column: RESERVE_ID
     * Remark: 予約ID
     */
    private Integer reserveId;

    /**
     * Column: START_DATETIME
     * Remark: 開始日時
     */
    private LocalDateTime startDatetime;
}