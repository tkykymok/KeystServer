package com.c4c.keystone.form;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AuthenticationQ {
    /**
     * Column: LOGIN_ID
     * Remark: ログインID
     */
    @NotEmpty(message = "{loginId}{NotEmpty}")
    private String loginId;

    /**
     * Column: LOGIN_PW
     * Remark: ログインパスワード
     */
    @NotEmpty(message = "{loginPw}{NotEmpty}")
    private String loginPw;
}
