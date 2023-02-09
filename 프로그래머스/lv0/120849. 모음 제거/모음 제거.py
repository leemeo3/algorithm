def solution(my_string):

    result = list(my_string)
    answer = ''
    for i in range(len(result)):
        if result[i] == "a" or result[i] == "e" or result[i] ==  "i" or result[i] ==  "o" or result[i] ==  "u":
            continue
        else:
            answer += result[i]
    return answer