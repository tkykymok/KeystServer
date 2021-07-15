package com.c4c.keystone.form;

import lombok.Data;

@Data
public class AuthenticationQ {
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

    public AuthenticationQ() {
    }

    public AuthenticationQ(String loginId, String loginPw) {
        this.loginId = loginId;
        this.loginPw = loginPw;
    }
}
