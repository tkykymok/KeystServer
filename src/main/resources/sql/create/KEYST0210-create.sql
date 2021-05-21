CREATE TABLE `KEYST0210`
(
    `SKILL_SHEET_ID`         INT NOT NULL AUTO_INCREMENT,
    `REF_NO`                 INT NOT NULL,
    `PRJ_CODE`               VARCHAR(4) NULL,
    `PRJ_START_DATE`         DATE NULL,
    `PRJ_END_DATE`           DATE NULL,
    `BIZ_IN_CHARGE`          VARCHAR(1000) NULL,
    `COMMENT`                VARCHAR(1000) NULL,
    `DEV_SCALE`              VARCHAR(100) NULL,
    `OS`                     VARCHAR(2) NULL,
    `DB`                     VARCHAR(2) NULL,
    `FW_MW_TOOL`             VARCHAR(100) NULL,
    `PG_LANG`                VARCHAR(50) NULL,
    `SCOPE_OF_WORK`          VARCHAR(50) NULL,
    `CREATED_DATETIME`       TIMESTAMP NULL,
    `CREATED_USER`           VARCHAR(8) NULL,
    `LAST_MODIFIED_DATETIME` TIMESTAMP NULL,
    `LAST_MODIFIED_USER`     VARCHAR(8) NULL,
    `VERSION_EX_KEY`         INT NULL DEFAULT 0,
    PRIMARY KEY (`SKILL_SHEET_ID`, `REF_NO`)
);
