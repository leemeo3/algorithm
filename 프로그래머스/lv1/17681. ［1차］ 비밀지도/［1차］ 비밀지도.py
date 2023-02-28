def solution(n, arr1, arr2):
    answer = []
    list1 = []              # 이진수 각각의 자릿수를 담을 리스트 1
    list2 = []              # 이진수 각각의 자릿수를 담을 리스트 2
    result = ""             # 각각의 이진수를 합쳐서 answer에 담을 변수 선언
    
    for i in range(n) :
        arr1[i] = format(arr1[i], 'b').zfill(n) # 이진법으로 변환 
        for j in arr1[i] :
            list1.append(j)                     # 변환한 이진법 각자릿수 리스트에 삽입
    for i in range(n) :
        arr2[i] = format(arr2[i], 'b').zfill(n) # 위와 동일
        for j in arr2[i] :
            list2.append(j)
            
    for i in range(n*n):                        # n*n 만큼 반복(리스트 총길이)
        if list1[i] == '1' :                    
            result += "#"
        elif list2[i] == '1' :
            result += "#"
        else :
            result += " "

        if len(result) % n == 0 :               # n번만큼 반복되면 result 초기화
            answer.append(result)
            result = ""
    return answer