package com.c4c.keystone.form;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Data
public class SignUpQ {
    /**
     * Column: USER_NAME
     * Remark: ユーザー名
     */
    @NotBlank(message = "ユーザー名は必須入力です。")
    private String userName;

    /**
     * Column: LOGIN_ID
     * Remark: ログインID
     */
    @NotBlank(message = "ログインIDは必須入力です。")
    private String loginId;

    /**
     * Column: LOGIN_PW
     * Remark: ログインパスワード
     */
    @NotBlank(message = "パスワードは必須入力です。")
    @Size(min = 4, message = "パスワードは4文字以上で入力してください。")
    private String loginPw;


}
