def solution(progresses, speeds):
    answer = []
    cnt = 0
    while len(progresses) > 0:
        for i in range(len(progresses)):
            progresses[i] += speeds[i]

        for i in range(len(progresses)):
            if progresses[0] >= 100:
                del progresses[0]
                del speeds[0]
                cnt += 1
        if cnt > 0 :
            answer.append(cnt)
        cnt = 0
    
    return answer