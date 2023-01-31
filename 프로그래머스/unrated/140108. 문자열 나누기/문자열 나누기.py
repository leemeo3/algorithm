def solution(s):
    answer = 0
    list1 = list(s)
    result = list1[0]
    xO = 0
    xX = 0

    for i in range(len(list1)):
        if xO == xX:
            answer += 1
            xO = 0
            xX = 0
            result = list1[i]
        if result == list1[i]:
            xO += 1
        else:
            xX += 1


    return answer