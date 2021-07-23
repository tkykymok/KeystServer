package com.c4c.keystone.form;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
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
}
