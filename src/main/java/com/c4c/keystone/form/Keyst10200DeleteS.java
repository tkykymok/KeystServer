package com.c4c.keystone.form;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class Keyst10200DeleteS extends ResponseFormBase {
    /**
     * Column: USER_ID
     * Remark: ユーザーID
     */
    private Integer userId;
}
