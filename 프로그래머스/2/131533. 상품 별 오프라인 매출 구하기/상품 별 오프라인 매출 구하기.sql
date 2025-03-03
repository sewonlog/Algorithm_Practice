-- 코드를 입력하세요
SELECT a.product_code, sum(a.price * b.sales_amount) as sales
from PRODUCT A
join OFFLINE_SALE B
on A.product_id = B.product_id
group by product_code
order by sales desc, product_code
