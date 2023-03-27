def solution(n, m, section):
    deque = []
    answer = 0
    cnt = 0
    
    while True :
        if len(deque) == 0 :                    # deque 리스트가 비어 있을때
            answer += 1                         # 페인트칠하는 카운트는 +1
            deque.append(section[cnt])          
            cnt += 1                            # section 인덱스 +1
        elif deque[0] + m-1 >= section[cnt] :   # 체크할 section 인덱스가 deque리스트 + 롤러 길이의 범위에 들었을때
            cnt += 1                            # 그 다음 section 인덱스가 범위에 드는지 확인하기 위해 +1
        else :
            deque.pop(0)
        
        if len(section) == cnt :                # 체크할 section의 인덱스 끝까지 도달했을때
            break
    return answer