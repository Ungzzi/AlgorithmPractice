SELECT
	CATEGORY,
    SUM(SALES) AS TOTAL_SALES
FROM
	BOOK B, BOOK_SALES BS
WHERE
	B.BOOK_ID = BS.BOOK_ID
    AND BS.SALES_DATE
    BETWEEN TO_DATE('2022-01-01', 'YYYY-MM-DD')
    AND TO_DATE('2022-01-31', 'YYYY-MM-DD')
GROUP BY CATEGORY
ORDER BY CATEGORY