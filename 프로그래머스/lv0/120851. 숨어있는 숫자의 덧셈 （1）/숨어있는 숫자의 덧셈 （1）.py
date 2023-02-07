import re

def solution(my_string):
    answer = 0
    numbers = re.findall(r'\d', my_string)
    
    for i in range(len(numbers)):
        cnt = int(numbers[i])
        answer += cnt
    return answer