def solution(n):
    answer = format(n, 'b')
    one_cnt1 = 0
    for i in answer :
        if i == '1' :
            one_cnt1 += 1
    
    cnt = 0
    while True :
        one_cnt2 = 0
        cnt += 1
        result = format(n + cnt, 'b')
        for i in result :
            if i == '1' :
                one_cnt2 += 1
        
        if one_cnt1 == one_cnt2 :
            answer = n + cnt
            break
    
    return answer