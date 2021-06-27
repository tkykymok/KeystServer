CREATE TABLE `KEYST0310`
(
    `RESERVE_ID`             INT          NOT NULL COMMENT '予約ID',
    `START_DATETIME`         DATETIME     NOT NULL COMMENT '開始日時',
    `USER_ID`                INT          NULL COMMENT 'ユーザーID',
    `FEELING`                VARCHAR(1)   NULL COMMENT 'ワタシノキモチ',
    `USER_COMMENT`           VARCHAR(255) NULL COMMENT 'ユーザーコメント',
    `MANAGER_COMMENT`        VARCHAR(255) NULL COMMENT '管理者コメント',
    `REMARK`                 VARCHAR(255) NULL COMMENT '備考',
    `CREATED_DATETIME`       TIMESTAMP    NULL DEFAULT NULL COMMENT '作成日時',
    `CREATED_USER`           INT               DEFAULT NULL COMMENT '作成者ID',
    `LAST_MODIFIED_DATETIME` TIMESTAMP    NULL DEFAULT NULL COMMENT '最終変更日時',
    `LAST_MODIFIED_USER`     INT               DEFAULT NULL COMMENT '最終変更者ID',
    `VERSION_EX_KEY`         INT               DEFAULT '0' COMMENT '排他制御カラム',

    PRIMARY KEY (`RESERVE_ID`, `START_DATETIME`)
) COMMENT = '1on1予約明細';
