def solution(hp):
    answer = 0
    cnt = 0
    while cnt <= hp :
        if (cnt + 5) <= hp :
            answer += 1
            cnt += 5
        elif (cnt + 3) <= hp :
            answer += 1
            cnt += 3
        elif (cnt + 1) <= hp :
            answer += 1
            cnt += 1
        else:
            break
    return answer