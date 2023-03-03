def solution(n):
    answer = 0
    fn0 = 0
    fn1 = 1
    for i in range(n-1) :
        answer = fn0 + fn1
        fn0 = fn1
        fn1 = answer
    answer = answer % 1234567
    return answer