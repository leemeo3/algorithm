def solution(cards1, cards2, goal):
    answer = ''
    cnt = 0                         # 삭제된 리스트의 값이 goal과 같은지 확인할 cnt
    
    for i in goal :
        if cards1[0] == i :         # cards1의 첫번째 값이 i와 같으면
            del cards1[0]           # 첫번째 값 삭제
            cnt += 1                # 카운트 + 1
            if len(cards1) == 0 :   # 리스트가 비어있을 경우 인덱스에러를 피하기 위한 예외처리
                cards1.append(" ")
        if cards2[0] == i :         # cards1과 동일
            del cards2[0]
            cnt += 1
            if len(cards2) == 0 :
                cards2.append(" ")
        if cnt == len(goal) :       # 카운트가 goal의 길이와 같아지면 Yes를 반환하면서 강제종료
            answer = 'Yes'
            break
        else :
            answer = 'No'           # 아니라면 계속 No
    
    return answer