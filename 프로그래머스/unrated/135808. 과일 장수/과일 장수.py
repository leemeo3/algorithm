def solution(k, m, score):
    answer = 0
    score.sort()                        # 사과 상자 정렬
    for i in range(len(score)):         # 사과 상자만큼 반복
        if len(score) >= m :            # 사과 상자 길이가 상자에 담을 
                                        #사과 갯수보다 크거나 같을때까지
            answer += min(score[-m:]) * m * 1 # 이익값 추가
            for j in range(m):          #  상자에 넣은 사과 빼기
                score.pop()
        else:
            break
    return answer