SELECT 
  d.HOUR, 
  NVL(COUNT, 0) AS COUNT 
FROM 
  (
    SELECT 
      LEVEL -1 AS HOUR 
    FROM 
      DUAL CONNECT BY LEVEL <= 24
  ) d 
  LEFT JOIN (
    SELECT 
      EXTRACT(
        HOUR 
        FROM 
          CAST(DATETIME AS TIMESTAMP)
      ) AS HOUR, 
      COUNT(
        EXTRACT(
          HOUR 
          FROM 
            CAST(DATETIME AS TIMESTAMP)
        )
      ) AS COUNT 
    FROM 
      ANIMAL_OUTS 
    GROUP BY 
      EXTRACT(
        HOUR 
        FROM 
          CAST(DATETIME AS TIMESTAMP)
      )
  ) a ON a.HOUR = d.HOUR
ORDER BY d.HOUR