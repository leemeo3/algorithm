def solution(t, p):
    answer = 0
    cnt = len(p)
    for i in range(len(t)):
        if int(t[i:cnt]) <= int(p):
            answer += 1
        cnt += 1
        if cnt == len(t)+1:
            break
    return answer