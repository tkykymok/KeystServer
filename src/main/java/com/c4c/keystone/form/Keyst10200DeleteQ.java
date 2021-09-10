package com.c4c.keystone.form;

import lombok.Data;

import javax.validation.Valid;
import javax.validation.constraints.Size;
import java.util.List;

@Data
public class Keyst10200DeleteQ {
    /**
     * Column: SKILL_SHEET_ID
     * Remark: スキルシートID
     */
    private Integer skillSheetId;
    
    /**
     * Column: VERSION_EX_KEY
     * Remark: 排他制御カラム
     */
    private Integer versionExKey;
}
