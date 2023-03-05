def solution(s):
    cntP = 0
    cntY = 0
    for i in s :
        if i == 'p' or i == 'P' :
            cntP += 1
        elif i == 'y' or i == 'Y' :
            cntY += 1
    if cntP == cntY :
        return True
    else :
        return False

