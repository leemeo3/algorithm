def solution(arr):
    answer = max(arr)
    cnt = 0                             # arr내 공통되는 수 갯수
    
    while cnt != len(arr) :   
        for i in arr :
            if answer % i == 0 :
                cnt += 1                # 공통되는 수 갯수 +1
            else :
                cnt = 0
                answer += 1             # 아니라면 최소공배수 1씩 증가
                break
                
    return answer