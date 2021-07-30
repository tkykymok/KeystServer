package com.c4c.keystone.form;

import java.util.List;

import lombok.Data;

@Data
public class Keyst10400InitS01 {
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
     * Column: TEAM
     * Remark: チーム
     */
    private String team;

    /**
     * Column: PRF_IMG_STRG_DRCTRY
     * Remark: プロフィール画像格納先ディレクトリ
     */
    private String prfImgStrgDrctry;

    /**
     * Column: SKILLS
     * Remark: 保有スキル
     */
    private List<Keyst10400InitS02> skillList;
}
