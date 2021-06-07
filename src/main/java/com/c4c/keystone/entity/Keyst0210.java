package com.c4c.keystone.entity;

import java.util.Date;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Table: KEYST0210
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class Keyst0210 extends Keyst0210Key {
    /**
     * Column: PRJ_CODE
     * Remark: 案件コード
     */
    private String prjCode;

    /**
     * Column: PRJ_START_DATE
     * Remark: 稼働開始年月日
     */
    private Date prjStartDate;

    /**
     * Column: PRJ_END_DATE
     * Remark: 稼働終了年月日
     */
    private Date prjEndDate;

    /**
     * Column: BIZ_IN_CHARGE
     * Remark: 担当業務
     */
    private String bizInCharge;

    /**
     * Column: COMMENT
     * Remark: コメント
     */
    private String comment;

    /**
     * Column: DEV_SCALE
     * Remark: 開発規模
     */
    private String devScale;

    /**
     * Column: OS
     * Remark: OS
     */
    private String os;

    /**
     * Column: DB
     * Remark: DB
     */
    private String db;

    /**
     * Column: FW_MW_TOOL
     * Remark: FW・MW・ツール等
     */
    private String fwMwTool;

    /**
     * Column: PG_LANG
     * Remark: 使用言語
     */
    private String pgLang;

    /**
     * Column: SCOPE_OF_WORK
     * Remark: 業務範囲
     */
    private String scopeOfWork;

    /**
     * Column: CREATED_DATETIME
     * Remark: 作成日時
     */
    private Date createdDatetime;

    /**
     * Column: CREATED_USER
     * Remark: 作成者ID
     */
    private Integer createdUser;

    /**
     * Column: LAST_MODIFIED_DATETIME
     * Remark: 最終変更日時
     */
    private Date lastModifiedDatetime;

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
