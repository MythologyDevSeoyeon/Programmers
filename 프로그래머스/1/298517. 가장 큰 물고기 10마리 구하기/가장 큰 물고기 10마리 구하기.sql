SELECT ID,
    MAX(LENGTH) LENGTH
FROM FISH_INFO
Where LENGTH is not null
group by 1
order by 2 desc,1
limit 10