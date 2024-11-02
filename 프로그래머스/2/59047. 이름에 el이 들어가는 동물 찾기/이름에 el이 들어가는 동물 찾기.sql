-- 코드를 입력하세요
SELECT ANIMAL_ID, NAME
from ANIMAL_INS
where  1=1
and upper(name) like '%EL%' 
and animal_type = 'Dog'
order by name;