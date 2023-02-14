def solution(k, m, score):
    answer = 0
    cnt = 0
    score.sort()
    for i in range(len(score)):
        if len(score) >= m :
            cnt += 1
            answer += min(score[-m:]) * m * 1
            for j in range(m):
                score.pop()
        else:
            break
    return answer