-- 코드를 입력하세요
SELECT a.name, a.datetime
from ANIMAL_INS A
left outer join ANIMAL_OUTS B
on a.animal_id = b.animal_id
where b.animal_id is null
order by a.datetime asc
limit 3;
