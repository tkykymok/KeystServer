package com.c4c.keystone.form;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Keyst10200InitS04 {
    /**
     * Column: SKILL_SHEET_ID
     * Remark: スキルシートID
     */
    private Integer skillSheetId;

    /**
     * Column: SKILL_SHEET_REG_DATETIME
     * Remark: スキルシート登録日時
     */
    private LocalDateTime skillSheetRegDatetime;
}
