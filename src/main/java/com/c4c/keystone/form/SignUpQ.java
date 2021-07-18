package com.c4c.keystone.form;

import lombok.Data;

@Data
public class SignUpQ {
    /**
     * Column: USER_NAME
     * Remark: ユーザー名
     */
    private String userName;

    /**
     * Column: LOGIN_ID
     * Remark: ログインID
     */
    private String loginId;

    /**
     * Column: LOGIN_PW
     * Remark: ログインパスワード
     */
    private String loginPw;


}
