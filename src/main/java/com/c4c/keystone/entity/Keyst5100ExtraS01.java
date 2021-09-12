package com.c4c.keystone.entity;

import java.time.LocalDateTime;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Table: KEYST5100
 */
@Data
@EqualsAndHashCode
public class Keyst5100ExtraS01 {
    /**
     * Column: PRJ_CODE
     * Remark: 案件コード
     */
    private String prjCode;

    /**
     * Column: PRJ_NAME
     * Remark: 案件名
     */
    private String prjName;

    /**
     * Column: CUST_CODE
     * Remark: 顧客コード
     */
    private String custCode;

    /**
     * Column: CUST_NAME
     * Remark: 顧客名
     */
    private String custName;

    /**
     * Column: END_CUST_NAME
     * Remark: エンド顧客名
     */
    private String endCustName;

    /**
     * Column: REMARK
     * Remark: 備考
     */
    private String remark;

    /**
     * Column: DELETE_FLG
     * Remark: 削除フラグ
     */
    private Integer deleteFlg;

    /**
     * Column: CREATED_DATETIME
     * Remark: 作成日時
     */
    private LocalDateTime createdDatetime;

    /**
     * Column: CREATED_USER
     * Remark: 作成者ID
     */
    private Integer createdUser;

    /**
     * Column: LAST_MODIFIED_DATETIME
     * Remark: 最終変日時
     */
    private LocalDateTime lastModifiedDatetime;

    /**
     * Column: LAST_MODIFIED_USER
     * Remark: 最終変更者ID
     */
    private Integer lastModifiedUser;

    /**
     * Column: VERSION_EX_KEY
     * Remark: 排他制御カラム
     */
    private Integer versionExKey;
}
