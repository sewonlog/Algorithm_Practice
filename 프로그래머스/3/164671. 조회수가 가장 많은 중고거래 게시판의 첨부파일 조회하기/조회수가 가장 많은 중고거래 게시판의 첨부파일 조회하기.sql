-- 코드를 입력하세요
SELECT '/home/grep/src/' || A.board_id || '/' || B.file_id || B.file_name || B.file_ext AS file_path
from USED_GOODS_BOARD A
inner join USED_GOODS_FILE B
on A.board_id = B.board_id
where A.views = (select max(views) from used_goods_board)
order by file_id desc;
