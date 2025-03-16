-- 코드를 입력하세요
SELECT A.animal_id, B.name
from ANIMAL_INS A
join ANIMAL_OUTS B 
on A.animal_id = B.animal_id
where A.datetime > B.datetime
order by A.datetime asc;