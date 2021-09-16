CREATE TABLE `KEYST5200`
(
    `CUST_CODE`              VARCHAR(5)   NOT NULL COMMENT '顧客コード',
    `CUST_NAME`              VARCHAR(20)  NOT NULL COMMENT '顧客名',
    `CUST_PIC`             	 VARCHAR(30)  NULL COMMENT '顧客担当者名',
    `DELETE_FLG`             INT          NOT NULL DEFAULT 0 COMMENT '削除フラグ',
    `CREATED_DATETIME`       TIMESTAMP    NULL COMMENT '作成日時',
    `CREATED_USER`           INT          NULL COMMENT '作成者ID',
    `LAST_MODIFIED_DATETIME` TIMESTAMP    NULL COMMENT '最終変更日時',
    `LAST_MODIFIED_USER`     INT          NULL COMMENT '最終変更者ID',
    `VERSION_EX_KEY`         INT          NULL DEFAULT 0 COMMENT '排他制御カラム',
    PRIMARY KEY (`CUST_CODE`)
) COMMENT = '顧客マスタ';