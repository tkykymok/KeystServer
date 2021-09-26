package com.c4c.keystone.form;

import java.util.List;

import lombok.Data;

@Data
public class Keyst10400InitS {
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
     * Column: USER_NAME_KANA
     * Remark: ユーザー名かな
     */
    private String userNameKana;

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
    private List<Keyst10400InitS01> skillList;

    /**
     * 案件情報
     */
    private Keyst10400InitS02 prjInfo;
}
