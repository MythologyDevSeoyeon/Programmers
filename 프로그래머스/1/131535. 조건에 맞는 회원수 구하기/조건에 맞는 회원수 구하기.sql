-- 코드를 입력하세요
SELECT count(USER_ID) USERS
FROM USER_INFO
WHERE substr(JOINED,1,4) = 2021 and age between 20 and 29 
