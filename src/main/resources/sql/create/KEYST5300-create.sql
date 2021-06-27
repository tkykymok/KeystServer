CREATE TABLE `KEYST5300`
(
    `SKILL_CODE`             VARCHAR(2)  NOT NULL COMMENT 'スキルコード',
    `SKILL_NAME`             VARCHAR(20) NOT NULL COMMENT 'スキル名',
    `LANG_FLG`               VARCHAR(1)  NULL COMMENT '言語フラグ',
    `CREATED_DATETIME`       TIMESTAMP   NULL COMMENT '作成日時',
    `CREATED_USER`           INT         NULL COMMENT '作成者ID',
    `LAST_MODIFIED_DATETIME` TIMESTAMP   NULL COMMENT '最終変更日時',
    `LAST_MODIFIED_USER`     INT         NULL COMMENT '最終変更者ID',
    `VERSION_EX_KEY`         INT         NULL DEFAULT 0 COMMENT '排他制御カラム',
    PRIMARY KEY (`SKILL_CODE`)
) comment ='スキルマスタ';
