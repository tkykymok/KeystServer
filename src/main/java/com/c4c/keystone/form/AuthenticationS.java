package com.c4c.keystone.form;

import lombok.Data;

@Data
public class AuthenticationS {
    /**
     * Json Web Token
     */
    private String jwt;

    /**
     * ログインユーザー情報
     */
    private AuthenticationS1 loginUserInfo;

}
