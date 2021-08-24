package com.c4c.keystone.form;

import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Data
public class SignUpQ {
    /**
     * Column: USER_NAME
     * Remark: ユーザー名
     */
    @NotEmpty(message = "{userName}{NotEmpty}")
    private String userName;

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
    @Pattern(regexp = "[A-Za-z0-9]{4,}", message = "{V00001}")
    private String loginPw;


}
