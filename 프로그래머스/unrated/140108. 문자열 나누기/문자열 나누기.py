def solution(s):
    answer = 0
    list1 = list(s)
    result = list1[0]               # 첫글자를 result에 넣어둠
    xO = 0                          # x와 같은 글자
    xX = 0                          # x와 다른 글자

    for i in range(len(list1)):     
        if xO == xX:                # 정답 최소가 1이라 처음 바로 +해도댐
            answer += 1             # 바로 플러스 
            xO = 0                  # 다시 초기화
            xX = 0                  # 다시 초기화
            result = list1[i]       # result 초기화 
        if result == list1[i]:      
            xO += 1                 # x와 같은 글자 면 +1
        else:
            xX += 1                 # x와 다른 글자 면 +1


    return answer