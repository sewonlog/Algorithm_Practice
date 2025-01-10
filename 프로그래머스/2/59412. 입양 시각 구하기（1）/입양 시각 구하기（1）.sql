-- 코드를 입력하세요
SELECT TO_NUMBER(TO_CHAR(DATETIME, 'HH24')) as HOUR, count(animal_id) AS COUNT
from ANIMAL_OUTS
group by TO_CHAR(DATETIME, 'HH24')
having TO_CHAR(DATETIME, 'HH24') >= '09' AND TO_CHAR(DATETIME, 'HH24') <= '19'
order by hour;
