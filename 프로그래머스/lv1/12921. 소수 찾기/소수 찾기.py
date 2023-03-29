def solution(n):
    num = set(range(2, n+1)) # 중복을 제거한 2부터 n까지의 숫자를 생성
    
    for i in range(2, n+1) :
        if i in num :
            num -= set(range(2*i, n+1, i)) # i의 배수는 num에서 제거
    return len(num)