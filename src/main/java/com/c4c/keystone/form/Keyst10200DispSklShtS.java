package com.c4c.keystone.form;

import lombok.Data;

import java.util.List;

@Data
public class Keyst10200DispSklShtS {
    /**
     * スキルシートヘッダー
     */
    Keyst10200DispSklShtS1 skillSheetHeader;

    /**
     * スキルシート明細一覧
     */
    List<Keyst10200DispSklShtS2> skillSheetDetail;
}
