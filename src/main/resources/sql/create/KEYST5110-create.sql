CREATE TABLE `KEYST5110`
(
    `PRJ_CODE`               VARCHAR(5) NOT NULL COMMENT '案件コード',
    `USER_ID`                INT        NOT NULL COMMENT 'ユーザーID',
    `CONTRACT_PRICE`         INT        NOT NULL COMMENT '契約単価',
    `PRJ_START_DATE`         DATE       NOT NULL COMMENT '稼働開始年月日',
    `PRJ_END_DATE`           DATE       NULL COMMENT '稼働終了年月日',
    `CREATED_DATETIME`       TIMESTAMP  NULL COMMENT '作成日時',
    `CREATED_USER`           INT        NULL COMMENT '作成者ID',
    `LAST_MODIFIED_DATETIME` TIMESTAMP  NULL COMMENT '最終変日時',
    `LAST_MODIFIED_USER`     INT        NULL COMMENT '最終変更者ID',
    `VERSION_EX_KEY`         INT        NULL DEFAULT 0 COMMENT '排他制御カラム',
    PRIMARY KEY (`PRJ_CODE`, `USER_ID`)
) COMMENT = '案件割当明細';
