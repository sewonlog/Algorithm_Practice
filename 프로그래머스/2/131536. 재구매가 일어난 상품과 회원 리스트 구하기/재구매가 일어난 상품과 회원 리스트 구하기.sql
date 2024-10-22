-- 코드를 입력하세요
SELECT USER_ID, PRODUCT_ID
from ONLINE_SALE
GROUP BY USER_ID, PRODUCT_ID
HAVING COUNT(USER_ID) >= 2
order by user_id, product_id desc;
