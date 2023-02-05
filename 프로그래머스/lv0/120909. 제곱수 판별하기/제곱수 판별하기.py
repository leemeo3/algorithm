def solution(n):
    result = n ** (1/2)

    if result % 1 == 0:
        return 1
    else :
        return 2