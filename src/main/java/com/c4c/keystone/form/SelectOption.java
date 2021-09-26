package com.c4c.keystone.form;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import lombok.Data;

@Data
public class SelectOption {
    /**
     * コード
     */
    String  code;

    /**
     * 名称
     */
    String name;

    /**
     * 無効フラグ
     */
    @JsonSerialize(using = JsonUtils.FlagSerializer.class)
    Integer disableFlg;
}
