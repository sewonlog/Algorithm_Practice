-- 코드를 입력하세요
SELECT extract(month from start_date) month, car_id, count(*) RECORDS
from CAR_RENTAL_COMPANY_RENTAL_HISTORY
where car_id in (select car_id
                from CAR_RENTAL_COMPANY_RENTAL_HISTORY
                where extract(month from start_date) in (8,9,10)
                group by car_id
                having count(*) >= 5)
and extract(month from start_date) between 8 and 10
group by extract(month from start_date), car_id
having count(*) <> 0
order by 1 asc, 2 desc