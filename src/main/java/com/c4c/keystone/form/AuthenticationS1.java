package com.c4c.keystone.form;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Data;

@Data
public class AuthenticationS1 {
    /**
     * Column: USER_ID
     * Remark: ユーザーID
     */
    private Integer userId;

    /**
     * Column: USER_NAME
     * Remark: ユーザー名
     */
    private String userName;

    /**
     * Column: ADMIN_FLG
     * Remark: 管理者フラグ
     */
    @JsonSerialize(using = JsonUtils.FlagSerializer.class)
    private String adminFlg;
}
