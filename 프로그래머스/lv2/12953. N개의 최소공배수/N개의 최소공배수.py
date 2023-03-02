def solution(arr):
    answer = max(arr)
    
    while True :
        cnt = 0                     # arr내 공통되는 수 갯수
        for i in arr :
            if answer % i == 0 :
                cnt += 1            # 공통되는 수 갯수 +1
            else :
                break
        
        if cnt == len(arr) :        # 공통되는 수가 arr길이와 같다면 while종료
            break
        else :
            answer += 1             # 아니라면 최소공배수 1씩 증가
    return answer