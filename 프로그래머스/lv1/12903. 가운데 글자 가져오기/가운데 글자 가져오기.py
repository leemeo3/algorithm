def solution(s):
    answer = ''
    s = list(s)
    if len(s) % 2 == 0 :
        answer += s[int(len(s)/2 - 1)]
        answer += s[int(len(s)/2)]
    else :
        answer += s[int(len(s)/2)]
    return answer