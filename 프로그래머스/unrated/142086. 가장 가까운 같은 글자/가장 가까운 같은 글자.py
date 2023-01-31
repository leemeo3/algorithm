def solution(s):
    answer = []
    listJ = list(s)
    listI = list(s)

    for i in range(len(listJ)):
        cnt = 0
        for j in range(i+1):
            if i == 0 :
                answer.append(-1)
            elif listJ[j] != listI[i] :
                continue
            elif listJ[j] == listI[i] :
                if i == j:
                    if cnt == 0:
                        answer.append(-1)
                    else:
                        answer.append(cnt)
                elif i != j:
                    cnt = i - j
                    continue
    return answer