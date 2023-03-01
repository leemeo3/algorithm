def solution(today, terms, privacies):
    answer = []
    time_dict = dict()                  # 딕셔너리 자료형으로 유효기간 구분
    todayYear, todayMonth, todayDay = int(today[0:4]), int(today[5:7]), int(today[8:10])

    
    for i in terms :
        case = i[0]
        time_dict[case] = int(i[2:])    # a:6 b:12 c:3
        
    number = 0                          # answer에 넣어줄 파기할 정보 번호
    for i in privacies :
        number += 1                     # 0번 인덱스가 1부터 시작이기에 1추가
        date, case = i.split()          # split으로 날짜와 유효기간 분리
        year, month, day = int(i[0:4]), int(i[5:7]), int(i[8:10])#날짜 int형으로 변경
        month += time_dict[case]        # 일치하는 딕셔너리 인트값 month에 추가
        
        while month > 12 :                 
            year += 1
            month -= 12
        
        if year > todayYear :
            continue
        elif year == todayYear :
            if month > todayMonth :
                continue
            elif month == todayMonth :
                if day > todayDay :
                    continue
        answer.append(number)
    return answer