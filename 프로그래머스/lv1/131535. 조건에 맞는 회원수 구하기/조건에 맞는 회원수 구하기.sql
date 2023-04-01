-- 코드를 입력하세요
SELECT count(*) AS users
from user_info
where joined like '%2021%' AND age BETWEEN 20 AND 29