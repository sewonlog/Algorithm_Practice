-- 코드를 입력하세요
SELECT BOARD_ID, WRITER_ID, TITLE, PRICE, case when status = 'SALE' then '판매중' when status = 'RESERVED' then '예약중' when status = 'DONE' then '거래완료' end as STATUS
from used_goods_board
where TO_CHAR(CREATED_DATE, 'YYYY-MM-DD') = '2022-10-05'
order by board_id desc;