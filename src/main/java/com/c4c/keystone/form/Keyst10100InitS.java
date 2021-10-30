package com.c4c.keystone.form;

import lombok.Data;

import java.util.List;

@Data
public class Keyst10100InitS {
    /**
     * ユーザー基本情報
     */
    Keyst10100InitS01 userBasicInfo;

    /**
     * Column: SKILLS
     * Remark: 保有スキル
     */
    private List<Keyst10100InitS02> skillList;


}
