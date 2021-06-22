package com.c4c.keystone.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;
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
    private LocalDate prjStartDate;

    /**
     * Column: PRJ_END_DATE
     * Remark: 稼働終了年月日
     */
    private LocalDate prjEndDate;

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
     * Column: SOW_MANAGEMENT
     * Remark: 業務範囲_マネジメント
     */
    private String sowManagement;

    /**
     * Column: SOW_REQ_DEFINITION
     * Remark: 業務範囲_要件定義
     */
    private String sowReqDefinition;

    /**
     * Column: SOW_BASIC_DESIGN
     * Remark: 業務範囲_基本設計
     */
    private String sowBasicDesign;

    /**
     * Column: SOW_DETAIL_DESIGN
     * Remark: 業務範囲_詳細設計
     */
    private String sowDetailDesign;

    /**
     * Column: SOW_IMPLEMENTATION
     * Remark: 業務範囲_実装
     */
    private String sowImplementation;

    /**
     * Column: SOW_TEST
     * Remark: 業務範囲_テスト
     */
    private String sowTest;

    /**
     * Column: SOW_MAINTENANCE_OPERATION
     * Remark: 業務範囲_保守運用
     */
    private String sowMaintenanceOperation;

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
