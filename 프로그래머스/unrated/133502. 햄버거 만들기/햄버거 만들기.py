def solution(ingredient):
    answer = 0
    result = []
    for i in ingredient :               # 반복문을 ingredient 순서대로 돌림
        result.append(i)                # stack 구조로 사용할 리스트 선언해 넣음
        if result[-4:] == [1, 2, 3, 1]: # 스택 리스트의 마지막부터 4번째까지가 일치할 경우
            answer += 1                 # answer + 1
            for j in range(4):          # 그리고 1,2,3,1의 길이 만큼
                result.pop()            # pop해서 빼줌

    return answer