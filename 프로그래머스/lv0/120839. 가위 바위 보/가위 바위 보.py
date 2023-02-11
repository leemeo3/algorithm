def solution(rsp):
    answer = ''
    rspList = list(rsp)
    
    for i in range(len(rspList)):
        if rspList[i] == "2":
            answer += "0"
        elif rspList[i] == "0":
            answer += "5"
        else:
            answer += "2"
    return answer