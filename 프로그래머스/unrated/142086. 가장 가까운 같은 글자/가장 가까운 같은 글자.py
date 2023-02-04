def solution(s):
    answer = []
    listJ = list(s)     # 비교 당할 리스트
    listI = list(s)     # 비교하는 자신 리스트
                        # i리스트를 j리스트와 비교
    for i in range(len(listJ)):             # 리스트 12 길이는 같으니까 아무거나 상관 무
        cnt = 0                             # 앞글자까지의 거리 저장하는 변수
        for j in range(i+1):                
            if i == 0 :                     # 첫글자는 처음 나와서 무조껀 -1
                answer.append(-1)
            elif listJ[j] != listI[i] :     # 서로 다른 글자면 계속 넘어감
                continue
            elif listJ[j] == listI[i] :     # 같은 글자가 나왔을때
                if i == j:                  # i와 j 인덱스가 같으면 제외이기때문에
                    if cnt == 0:            # 앞글자까지 거리 변수가 그대로 라면 -1
                        answer.append(-1)
                    else:
                        answer.append(cnt)  # 앞글자까지 거리 변수가 변화가 있다면 그대로 +
                elif i != j:                # 같은글자가 나왔는데 i와 j 인덱스가 다르다면
                    cnt = i - j             # 변수에 거리 수정해줘야함
                    continue                # 그리고 계속..
    return answer