def solution(n):
    answer = []
    answer.append(1)
    answer.append(1)
    answer.append(2)
    if n == 1 :
        return 1 % 1234567
    elif n == 2 :
        return 2 % 1234567

    
    for i in range(3, n + 1) :
        answer.append(answer[i-1] + answer[i-2])
    return answer[n] % 1234567