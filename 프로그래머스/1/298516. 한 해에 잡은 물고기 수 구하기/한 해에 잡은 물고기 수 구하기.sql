-- 코드를 작성해주세요
select 
    count(1) as FISH_COUNT
from FISH_INFO
where substr(TIME,1,4) = 2021
