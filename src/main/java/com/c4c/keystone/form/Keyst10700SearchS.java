package com.c4c.keystone.form;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class Keyst10700SearchS {
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
     * Column: CUST_PIC
     * Remark: 顧客担当者名
     */
    private String custPic;

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
     * Remark: 最終変更日時
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
