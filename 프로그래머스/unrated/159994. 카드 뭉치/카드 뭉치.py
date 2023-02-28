def solution(cards1, cards2, goal):
    answer = ''
    cnt = 0
    
    for i in goal :
        if cards1[0] == i :
            del cards1[0]
            cnt += 1
            if len(cards1) == 0 :
                cards1.append(" ")
        if cards2[0] == i :
            del cards2[0]
            cnt += 1
            if len(cards2) == 0 :
                cards2.append(" ")
        if cnt == len(goal) :
            answer = 'Yes'
            break
        else :
            answer = 'No'
    
    return answer