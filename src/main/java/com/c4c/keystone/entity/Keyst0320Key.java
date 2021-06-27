package com.c4c.keystone.entity;

import java.time.LocalDateTime;
import lombok.Data;

/**
 * Table: KEYST0320
 */
@Data
public class Keyst0320Key {
    /**
     * Column: RESERVE_ID
     * Remark: 予約ID
     */
    private Integer reserveId;

    /**
     * Column: RESERVE_DATETIME
     * Remark: 予約日時
     */
    private LocalDateTime reserveDatetime;
}