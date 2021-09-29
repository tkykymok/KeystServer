package com.c4c.keystone.form;

import java.util.List;

import lombok.Data;

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
    private List<Keyst10400InitS01> skillList;


}
