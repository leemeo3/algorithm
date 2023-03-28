from collections import Counter

def solution(k, tangerine):
    answer = 0              
    count = Counter(tangerine).most_common()    # 중복이 많은순으로 정렬
    
    for i in count :
        k -= i[1]                               # 중복값의 value
        answer += 1                             # 최솟값 cnt 추가
        
        if k <= 0 :                             # k가 0이거나 0보다 작을때
            break
    return answer