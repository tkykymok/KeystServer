package com.c4c.keystone.form;

import java.util.List;

import lombok.Data;

@Data
public class Keyst10300DispReserveInfoS {
    /**
     * 1on1予約ヘッダー
     */
	Keyst10300DispReserveInfoS1 reserveInfoHeader;

    /**
     * 1on1予約明細一覧
     */
    List<Keyst10300DispReserveInfoS2> reserveInfoDetail;
}
