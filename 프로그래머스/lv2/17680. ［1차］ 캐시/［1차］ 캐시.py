def solution(cacheSize, cities):
    answer = 0
    cityList = []                       # hit miss 판단할 리스트 선언
    for i in range(len(cities)) :   
        cities[i] = cities[i].lower()   # 통일을 위해 전체 소문자로 바꿈
        
        if cacheSize > 0 :                  # 캐시 사이즈가 0보다 클 경우에만 경우의 수 따지기
            if len(cityList) > cacheSize :  # 캐시사이즈 보다 커질 경우 리스트 첫번째인덱스 삭제
                    cityList.pop(0)
            if cities[i] in cityList :
                cityList.pop(cityList.index(cities[i])) # 있을 경우 리스트내에 있던 city에 덮어 씌우기
                answer += 1
                cityList.append(cities[i])
            elif cities[i] not in cityList :            # 캐시미스
                answer += 5
                cityList.append(cities[i])     
        else :                              # 캐시 사이즈가 0일 경우 계속 5 증가
            answer += 5
    return answer