CREATE TABLE `KEYST5100`
(
    `PRJ_CODE`               VARCHAR(5)   NOT NULL COMMENT '案件コード',
    `PRJ_NAME`               VARCHAR(30)  NOT NULL COMMENT '案件名',
    `CUST_CODE`              VARCHAR(5)   NULL COMMENT '顧客コード',
    `END_CUST_NAME`          VARCHAR(30)  NULL COMMENT 'エンド顧客名',
    `REMARK`                 VARCHAR(255) NULL COMMENT '備考',
    `DELETE_FLG`             INT          NOT NULL DEFAULT 0 COMMENT '削除フラグ',
    `CREATED_DATETIME`       TIMESTAMP    NULL COMMENT '作成日時',
    `CREATED_USER`           INT          NULL COMMENT '作成者ID',
    `LAST_MODIFIED_DATETIME` TIMESTAMP    NULL COMMENT '最終変日時',
    `LAST_MODIFIED_USER`     INT          NULL COMMENT '最終変更者ID',
    `VERSION_EX_KEY`         INT          NULL     DEFAULT 0 COMMENT '排他制御カラム',
    PRIMARY KEY (`PRJ_CODE`)
) COMMENT = '案件マスタ';
