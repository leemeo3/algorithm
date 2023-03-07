def solution(s):
    answer = ''
    s = s.split()
    for i in range(len(s)) :
        s[i] = int(s[i])
    return str(min(s)) + " " + str(max(s))