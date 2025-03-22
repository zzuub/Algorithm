SELECT 
    BOOK_ID,
    AUTHOR_NAME,
    TO_CHAR(PUBLISHED_DATE, 'YYYY-MM-DD')
FROM BOOK B, AUTHOR A
WHERE B.AUTHOR_ID = A.AUTHOR_ID
  AND CATEGORY = '경제'
ORDER BY PUBLISHED_DATE;