def solution(a, b, n):
    answer = 0
    result = 0
    while n >= a :
        if n < a:
            break
        result = int(n / a) * a
        n = (n - result) + (b * (result/a))
        answer += (b * (result/a))
    return answer