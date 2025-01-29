-- 코드를 입력하세요
SELECT A.writer_id as USER_ID, B.NICKNAME, sum(A.price) as TOTAL_SALES
from USED_GOODS_BOARD A
inner join USED_GOODS_USER B
on A.writer_id = B.user_id
where a.status = 'DONE'
group by A.writer_id, B.nickname
having sum(A.price) >= 700000
order by 3 asc;