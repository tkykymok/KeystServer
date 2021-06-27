package com.c4c.keystone.form;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
public class Keyst10200DispSklShtS2 {
    /**
     * Column: SKILL_SHEET_ID
     * Remark: スキルシートID
     */
    private Integer skillSheetId;

    /**
     * Column: REF_NO
     * Remark: 明細番号
     */
    private Integer refNo;

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
    private List<String> devScale;

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
    private List<String> pgLang;

    /**
     * Column: SOW_MANAGEMENT
     * Remark: 業務範囲_マネジメント
     */
    @JsonSerialize(using = JsonUtils.FlagSerializer.class)
    private String sowManagement;

    /**
     * Column: SOW_REQ_DEFINITION
     * Remark: 業務範囲_要件定義
     */
    @JsonSerialize(using = JsonUtils.FlagSerializer.class)
    private String sowReqDefinition;

    /**
     * Column: SOW_BASIC_DESIGN
     * Remark: 業務範囲_基本設計
     */
    @JsonSerialize(using = JsonUtils.FlagSerializer.class)
    private String sowBasicDesign;

    /**
     * Column: SOW_DETAIL_DESIGN
     * Remark: 業務範囲_詳細設計
     */
    @JsonSerialize(using = JsonUtils.FlagSerializer.class)
    private String sowDetailDesign;

    /**
     * Column: SOW_IMPLEMENTATION
     * Remark: 業務範囲_実装
     */
    @JsonSerialize(using = JsonUtils.FlagSerializer.class)
    private String sowImplementation;

    /**
     * Column: SOW_TEST
     * Remark: 業務範囲_テスト
     */
    @JsonSerialize(using = JsonUtils.FlagSerializer.class)
    private String sowTest;

    /**
     * Column: SOW_MAINTENANCE_OPERATION
     * Remark: 業務範囲_保守運用
     */
    @JsonSerialize(using = JsonUtils.FlagSerializer.class)
    private String sowMaintenanceOperation;

    /**
     * Column: VERSION_EX_KEY
     * Remark: 排他制御カラム
     */
    private Integer versionExKey;
}
