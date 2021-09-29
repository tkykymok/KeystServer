package com.c4c.keystone.form;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import lombok.Data;

import javax.validation.Valid;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.time.LocalDate;
import java.util.List;

@Data
public class Keyst10200UpdateQ1 {
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
    @Size(max = 1000, message = "{bizInCharge}{Size.less_max}")
    private String bizInCharge;

    /**
     * Column: COMMENT
     * Remark: コメント
     */
    @Size(max = 1000, message = "{comment}{Size.less_max}")
    private String comment;

    /**
     * Column: DEV_SCALE
     * Remark: 開発規模
     */
    @Valid
    private List<@Pattern(regexp = "[0-9]{1,4}", message = "{V00001}") String> devScale;

    /**
     * Column: OS
     * Remark: OS
     */
    private Integer os;

    /**
     * Column: DB
     * Remark: DB
     */
    private Integer db;

    /**
     * Column: FW_MW_TOOL
     * Remark: FW・MW・ツール等
     */
    private List<String> fwMwTool;

    /**
     * Column: PG_LANG
     * Remark: 使用言語
     */
    private List<Integer> pgLang;

    /**
     * Column: SOW_MANAGEMENT
     * Remark: 業務範囲_マネジメント
     */
    @JsonDeserialize(using = JsonUtils.FlagDeserializer.class)
    private Integer sowManagement;

    /**
     * Column: SOW_REQ_DEFINITION
     * Remark: 業務範囲_要件定義
     */
    @JsonDeserialize(using = JsonUtils.FlagDeserializer.class)
    private Integer sowReqDefinition;

    /**
     * Column: SOW_BASIC_DESIGN
     * Remark: 業務範囲_基本設計
     */
    @JsonDeserialize(using = JsonUtils.FlagDeserializer.class)
    private Integer sowBasicDesign;

    /**
     * Column: SOW_DETAIL_DESIGN
     * Remark: 業務範囲_詳細設計
     */
    @JsonDeserialize(using = JsonUtils.FlagDeserializer.class)
    private Integer sowDetailDesign;

    /**
     * Column: SOW_IMPLEMENTATION
     * Remark: 業務範囲_実装
     */
    @JsonDeserialize(using = JsonUtils.FlagDeserializer.class)
    private Integer sowImplementation;

    /**
     * Column: SOW_TEST
     * Remark: 業務範囲_テスト
     */
    @JsonDeserialize(using = JsonUtils.FlagDeserializer.class)
    private Integer sowTest;

    /**
     * Column: SOW_MAINTENANCE_OPERATION
     * Remark: 業務範囲_保守運用
     */
    @JsonDeserialize(using = JsonUtils.FlagDeserializer.class)
    private Integer sowMaintenanceOperation;

}

