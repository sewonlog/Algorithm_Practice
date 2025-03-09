-- 코드를 입력하세요
SELECT A.category, sum(B.sales) as total_sales
from book A
join book_sales B
on A.book_id = b.book_id
where to_char(B.sales_date, 'YYYY-MM-DD') like '2022-01%'
group by category
order by category
