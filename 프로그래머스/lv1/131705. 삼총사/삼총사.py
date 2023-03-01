def solution(number):
    answer = 0
    number.sort()
    numLen = int(len(number)/2)
    
    # for i in range(numLen + 1) :        # 전체 범위는 리스트의 절반까지만
    for i in range(len(number)) :
        s2 = i + 1                      # 두번째 인덱스 시작 값
        s3 = i + 2                      # 세번째 인덱스 시작 값
        for j in range(s2, len(number)) :
            for k in range(s3, len(number)) :
                if number[i] + number[j] + number[k] == 0 :
                    answer += 1
            s3 += 1                     # 세번째 시작 인덱스 +1 
        s2 += 1                         # 두번째 시작 인덱스 +1 
    return answer