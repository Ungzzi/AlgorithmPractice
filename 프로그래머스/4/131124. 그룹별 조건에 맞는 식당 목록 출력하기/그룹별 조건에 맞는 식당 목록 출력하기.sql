SELECT
    MEMBER_NAME,
    REVIEW_TEXT,
    TO_CHAR(REVIEW_DATE, 'YYYY-MM-DD')
FROM
    MEMBER_PROFILE MP,
    REST_REVIEW RR
WHERE
    MP.MEMBER_ID = RR.MEMBER_ID
    AND RR.MEMBER_ID IN (
        SELECT
            MEMBER_ID
        FROM
            REST_REVIEW
        GROUP BY
            MEMBER_ID
        HAVING
            COUNT(MEMBER_ID) =
            (
            SELECT
                MAX(CNT) MAX_CNT
            FROM
                (
                SELECT
                    MEMBER_ID,
                    COUNT(MEMBER_ID) CNT
                FROM
                    REST_REVIEW
                GROUP BY
                    MEMBER_ID
                )
            )
    )
ORDER BY 
    REVIEW_DATE, REVIEW_TEXT