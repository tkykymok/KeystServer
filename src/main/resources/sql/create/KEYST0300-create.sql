CREATE TABLE `KEYST0300`
(
    `RESERVE_ID`             INT        NOT NULL AUTO_INCREMENT COMMENT '予約ID',
    `IMPL_YEAR_MONTH`        VARCHAR(6) NOT NULL COMMENT '実施年月',
    `MANAGER_ID`             INT        NOT NULL COMMENT '管理者ID',
    `TEAM`                   VARCHAR(1) NOT NULL COMMENT 'チーム',
    `CREATED_DATETIME`       TIMESTAMP  NULL DEFAULT NULL COMMENT '作成日時',
    `CREATED_USER`           INT             DEFAULT NULL COMMENT '作成者ID',
    `LAST_MODIFIED_DATETIME` TIMESTAMP  NULL DEFAULT NULL COMMENT '最終変更日時',
    `LAST_MODIFIED_USER`     INT             DEFAULT NULL COMMENT '最終変更者ID',
    `VERSION_EX_KEY`         INT             DEFAULT '0' COMMENT '排他制御カラム',
    PRIMARY KEY (`RESERVE_ID`),
    UNIQUE KEY `RESERVE_ID_UNIQUE` (`RESERVE_ID`)
) COMMENT ='1on1予約ヘッダー'
