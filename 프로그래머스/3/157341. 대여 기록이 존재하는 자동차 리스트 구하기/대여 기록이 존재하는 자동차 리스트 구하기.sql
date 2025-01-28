-- 코드를 입력하세요
SELECT distinct car_id
from CAR_RENTAL_COMPANY_CAR
where car_type = '세단'
and car_id in (select distinct car_id from CAR_RENTAL_COMPANY_RENTAL_HISTORY where to_char(start_date, 'MM') = '10')
order by car_id desc;