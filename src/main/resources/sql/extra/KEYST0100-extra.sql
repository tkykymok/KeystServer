SELECT
    KEYST0100.USER_ID,
    ,KEYST0100.USER_NAME
    ,KEYST0100.TEAM
    ,KEYST0100.PRF_IMG_STRG_DRCTRY
    ,KEYST0100.SKILLS
    ,KEYST5100.PRJ_NAME
    ,KEYST5110.CONTRACT_PRICE
    ,KEYST5110.PRJ_START_DATE
FROM
	KEYST0100
LEFT OUTER JOIN KEYST5110 ON
    KEYST0100.USER_ID = KEYST5110.USER_ID
INNER JOIN KEYST5100 ON
    KEYST5110.PRJ_CODE = KEYST5100.PRJ_CODE
WHERE KEYST5110.PRJ_END_DATE IS NULL
	AND KEYST0100.DELETE_FLG = '0'
;