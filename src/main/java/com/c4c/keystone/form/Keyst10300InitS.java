package com.c4c.keystone.form;

import lombok.Data;

import java.util.List;

@Data
public class Keyst10300InitS {
    /**
     * Column: RESERVE_ID
     * Remark: 予約ID
     */
    private Integer reserveId;

    /**
     * 当月
     */
    private String thisMonth;

    /**
     * チーム
     */
    private String team;

    /**
     * 予約情報一覧
     */
    private List<Keyst10300InitS01> reserveInfoList;

    /**
     * コメント履歴一覧
     */
    private List<Keyst10300InitS02> commentHistoryList;

}
