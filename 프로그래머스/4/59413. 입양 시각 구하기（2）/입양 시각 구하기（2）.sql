select hour, count(B.animal_id)
from
    (select level -1 as hour
     from dual
     connect by level <= 24) A left join animal_outs B on A.hour = TO_CHAR(B.DATETIME, 'HH24')
group by hour
order by hour;
