def solution(s):
    cnt = 0             # 반복 횟수
    zeroCnt = 0         # 제거할 0의 갯수
    while True :
        cnt += 1        # 반복 횟수 증가
        check = ""      # 이진 변환 이전 check 할 수 저장
        for i in s :    
            if i == "1" :   #1일 경우 이진 변환 예정이므로 check 저장
                check += i
            else :          #1이 아닐 경우 0이기에 제거할 0 갯수 +1
                zeroCnt += 1
        s = format(len(check), 'b') # check의 길이 2진수 변환
        if s == "1" :               # 이진수 변환 값이 1이면 종료
            break
    return [cnt,zeroCnt]