def solution(n, m, section):
    deque = []
    answer = 0
    cnt = 0
    
    while True :
        if len(deque) == 0 :
            answer += 1
            deque.append(section[cnt])
            cnt += 1
        elif deque[0] + m-1 >= section[cnt] :
            cnt += 1
        else :
            deque.pop(0)
        
        if len(section) == cnt :
            break
    return answer