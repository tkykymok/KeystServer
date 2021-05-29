CREATE TABLE `KEYST0210`
(
    `SKILL_SHEET_ID`         INT NOT NULL AUTO_INCREMENT COMMENT 'スキルシートID',
    `REF_NO`                 INT NOT NULL COMMENT '明細番号',
    `PRJ_CODE`               VARCHAR(4) NULL COMMENT '案件コード',
    `PRJ_START_DATE`         DATE NULL COMMENT '稼働開始年月日',
    `PRJ_END_DATE`           DATE NULL COMMENT '稼働終了年月日',
    `BIZ_IN_CHARGE`          VARCHAR(1000) NULL COMMENT '担当業務',
    `COMMENT`                VARCHAR(1000) NULL COMMENT 'コメント',
    `DEV_SCALE`              VARCHAR(100) NULL COMMENT '開発規模',
    `OS`                     VARCHAR(2) NULL COMMENT 'OS',
    `DB`                     VARCHAR(2) NULL COMMENT 'DB',
    `FW_MW_TOOL`             VARCHAR(100) NULL COMMENT 'FW・MW・ツール等',
    `PG_LANG`                VARCHAR(50) NULL COMMENT '使用言語',
    `SCOPE_OF_WORK`          VARCHAR(50) NULL COMMENT '業務範囲',
    `CREATED_DATETIME`       TIMESTAMP NULL COMMENT '作成日時',
    `CREATED_USER`           INT NULL COMMENT '作成者ID',
    `LAST_MODIFIED_DATETIME` TIMESTAMP NULL COMMENT '最終変更日時',
    `LAST_MODIFIED_USER`     INT NULL COMMENT '最終変更者ID',
    `VERSION_EX_KEY`         INT NULL DEFAULT 0 COMMENT '排他制御カラム',
    PRIMARY KEY (`SKILL_SHEET_ID`, `REF_NO`)
);
