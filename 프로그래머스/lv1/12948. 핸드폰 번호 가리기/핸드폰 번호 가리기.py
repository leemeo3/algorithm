def solution(phone_number):
    answer = ''
    length = len(phone_number) - 4
    for i in range(len(phone_number)) :
        if i < length :
            answer += phone_number[i].replace(phone_number[i], "*")
        else :
            answer += phone_number[i]
    
    return answer