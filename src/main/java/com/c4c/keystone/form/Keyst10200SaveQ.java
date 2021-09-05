package com.c4c.keystone.form;

import lombok.Data;

import javax.validation.Valid;
import javax.validation.constraints.Size;
import java.util.List;

@Data
public class Keyst10200SaveQ {
    /**
     * Column: USER_ID
     * Remark: ユーザーID
     */
    private Integer userId;

    /**
     * Column: STRONG_AREA
     * Remark: 得意分野
     */
    @Size(max = 500, message = "{strongArea}{Size.less_max}")
    private String strongArea;

    /**
     * Column: PR
     * Remark: PR
     */
    @Size(max = 500, message = "{pr}{Size.less_max}")
    private String pr;

    /**
     * Column: EVALUATION_OF_SALES
     * Remark: 営業評価
     */
    @Size(max = 500, message = "{evaluationOfSales}{Size.less_max}")
    private String evaluationOfSales;

    /**
     * スキルシート明細List
     */
    @Valid
    List<Keyst10200SaveQ1> skillSheetDetail;
}
