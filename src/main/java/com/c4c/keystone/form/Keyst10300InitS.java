package com.c4c.keystone.form;

import java.util.List;

import com.c4c.keystone.entity.Keyst0300ExtraS01;

import lombok.Data;

@Data
public class Keyst10300InitS {
    /**
     * 予約情報
     */
    private List<Keyst0300ExtraS01> reserveInfoList;

    /**
     * 現在月
     */
    private String thisMonth;


}