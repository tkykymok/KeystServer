package com.c4c.keystone.form;

import java.util.List;

import javax.validation.Valid;

import lombok.Data;

@Data
public class Keyst10500UpdateQ {
    /**
     * 案件マスタ
     */
    @Valid
    Keyst10500UpdateQ1 prjMaster;

    /**
     * 案件割当明細
     */
    @Valid
    List<Keyst10500UpdateQ2> prjUserAllocationList;
}
