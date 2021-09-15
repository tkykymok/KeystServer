CREATE TABLE `KEYST0400`
(
    `NOTIFICATION_ID`           INT           NOT NULL COMMENT 'お知らせID',
    `TITLE`                     VARCHAR(50)   NULL COMMENT '件名',
    `CONTENT`                   VARCHAR(1000) NULL COMMENT '本文',
    `NOTIFICATION_REG_ID`       INT           NOT NULL COMMENT 'お知らせ登録者ID\n',
    `NOTIFICATION_REG_DATETIME` DATETIME      NOT NULL COMMENT 'お知らせ登録日時',
    `POST_START_DATE`           DATE          NOT NULL COMMENT '掲載開始日',
    `POST_END_DATE`             DATE          NOT NULL COMMENT '掲載終了日',
    `DELETE_FLG`                INT           NULL DEFAULT 0 COMMENT '削除フラグ',
    `CREATED_DATETIME`          TIMESTAMP     NULL COMMENT '作成日時',
    `CREATED_USER`              INT           NULL COMMENT '作成者ID',
    `LAST_MODIFIED_DATETIME`    TIMESTAMP     NULL COMMENT '最終変更日時',
    `LAST_MODIFIED_USER`        INT           NULL COMMENT '最終変更者ID',
    `VERSION_EX_KEY`            INT           NULL DEFAULT 0 COMMENT '排他制御カラム',
    PRIMARY KEY (`NOTIFICATION_ID`),
    UNIQUE INDEX `NOTIFICATION_ID_UNIQUE` (`NOTIFICATION_ID` ASC) VISIBLE
);
