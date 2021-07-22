package com.c4c.keystone.form;

import java.util.List;

import lombok.Data;

@Data
public class Keyst10400InitS {
    /**
     * ユーザー基本情報
     */
    Keyst10400InitS01 userBasicInfo;

    /**
     * 案件情報リスト
     */
    List<Keyst10400InitS03> prjInfo;
}
