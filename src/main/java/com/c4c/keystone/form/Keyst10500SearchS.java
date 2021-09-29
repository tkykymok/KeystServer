package com.c4c.keystone.form;

import java.util.List;

import lombok.Data;

@Data
public class Keyst10500SearchS {
    /**
     * 案件マスタ
     */
    Keyst10500SearchS01 prjMaster;

    /**
     * 案件割当明細
     */
    List<Keyst10500SearchS02> prjUserAllocation;
}
