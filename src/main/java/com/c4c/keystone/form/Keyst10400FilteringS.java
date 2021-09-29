package com.c4c.keystone.form;

import java.util.List;

import lombok.Data;

@Data
public class Keyst10400FilteringS {
    /**
     * Column: TEAM
     * Remark: チーム
     */
    private List<String> teamList;

    /**
     * Column: SKILL_NAME
     * Remark: スキル名
     */
    private List<String> skillNameList;

    /**
     * Column: PRJ_NAME
     * Remark: 案件名
     */
    private List<String> prjNameList;
}
