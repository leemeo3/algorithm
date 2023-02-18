def solution(s, skip, index):
    answer = ''
    sAscii = []
    skipAscii = []
    
    for i in skip :
        skipAscii.append(ord(i))
        
    for i in s :
        cnt = 0
        check = ord(i)
        sAscii.clear()
        while len(sAscii) < index :
            check += 1
            
            if check > 122 :
                check = ord('a')
            
            if check in skipAscii :
                continue
            else :
                sAscii.append(check)
        answer += chr(sAscii[index - 1])
    
    return answer