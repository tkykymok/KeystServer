package com.c4c.keystone.form;

import java.util.Date;
import java.util.List;

public class Keyst10200DispS3 {
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
    private List<String> fwMwTool;

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
     * Column: VERSION_EX_KEY
     * Remark: 排他制御カラム(スキルシート明細)
     */
    private Integer versionExKey;
}
