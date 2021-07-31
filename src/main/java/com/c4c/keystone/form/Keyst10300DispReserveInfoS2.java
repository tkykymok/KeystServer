package com.c4c.keystone.form;

import lombok.Data;

@Data
public class Keyst10300DispReserveInfoS2 {
    /**
     * Column: USER_ID
     * Remark: ユーザーID
     */
    private Integer userId;

    /**
     * Column: FEELING
     * Remark: ワタシノキモチ
     */
    private String feeling;

    /**
     * Column: USER_COMMENT
     * Remark: ユーザーコメント
     */
    private String userComment;

    /**
     * Column: MANAGER_COMMENT
     * Remark: 管理者コメント
     */
    private String managerComment;

    /**
     * Column: REMARK
     * Remark: 備考
     */
    private String remark;

}
