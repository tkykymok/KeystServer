CREATE TABLE `KEYST0200`
(
    `SKILL_SHEET_ID`           INT          NOT NULL AUTO_INCREMENT COMMENT 'スキルシートID',
    `USER_ID`                  INT          NOT NULL COMMENT 'ユーザーID',
    `STRONG_AREA`              VARCHAR(500) NULL COMMENT '得意分野',
    `PR`                       VARCHAR(500) NULL COMMENT 'PR',
    `EVALUATION_OF_SALES`      VARCHAR(500) NULL COMMENT '営業評価',
    `SKILL_SHEET_REG_DATETIME` DATETIME     NULL COMMENT 'スキルシート登録日時',
    `DELETE_FLG`               VARCHAR(1)   NOT NULL DEFAULT 0 COMMENT '削除フラグ',
    `CREATED_DATETIME`         TIMESTAMP    NULL COMMENT '作成日時',
    `CREATED_USER`             INT          NULL COMMENT '作成者ID',
    `LAST_MODIFIED_DATETIME`   TIMESTAMP    NULL COMMENT '最終変日時',
    `LAST_MODIFIED_USER`       INT          NULL COMMENT '最終変更者ID',
    `VERSION_EX_KEY`           INT          NULL     DEFAULT 0 COMMENT '排他制御カラム',
    PRIMARY KEY (`SKILL_SHEET_ID`),
    UNIQUE INDEX `SKILL_SHEET_ID_UNIQUE` (`SKILL_SHEET_ID` ASC) VISIBLE
) comment ='スキルシートヘッダー';
