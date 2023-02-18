def solution(s, skip, index):
    answer = ''
    sAscii = []     # s 리스트
    skipAscii = []  # skip 리스트 
    
    for i in skip :
        skipAscii.append(ord(i))    # skip 아스키코드로 변환
        
    for i in s :
        check = ord(i)              # check에 s를 하나씩 변환해 넣기
        sAscii.clear()              # s 리스트 초기화
        while len(sAscii) < index : # s 리스트 길이가 인덱스를 넘으면 종료
            check += 1              # 한번 반복할때마다 +1 추가
            
            if check > 122 :        # Z를 넘어갈 경우 a로 바꾸기
                check = ord('a')
            
            if check in skipAscii : # check가 스킵리스트에 있을경우 넘어감
                continue
            else :
                sAscii.append(check) # 없다면 리스트에 추가
        answer += chr(sAscii[index - 1]) # 리스트 제일 마지막 글자 answer
    
    return answer