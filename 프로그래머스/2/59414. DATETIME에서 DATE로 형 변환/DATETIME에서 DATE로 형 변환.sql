-- 코드를 입력하세요
SELECT ANIMAL_ID, NAME, to_char(datetime, 'YYYY-MM-DD') as 날짜
from ANIMAL_INS
order by animal_id