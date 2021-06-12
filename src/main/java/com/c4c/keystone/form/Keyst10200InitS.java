package com.c4c.keystone.form;

import lombok.Data;

import java.util.List;

@Data
public class Keyst10200InitS {
    /**
     * ユーザー基本情報
     */
    Keyst10200InitS01 userBasicInfo;

    /**
     * スキルシート情報
     */
    List<Keyst10200InitS03> skillSheetInfoList;
}
