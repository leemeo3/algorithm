def solution(n, arr1, arr2):
    answer = []
    list1 = []
    list2 = []
    result = ""
    
    for i in range(n) :
        arr1[i] = format(arr1[i], 'b').zfill(n)
        for j in arr1[i] :
            list1.append(j)
    for i in range(n) :
        arr2[i] = format(arr2[i], 'b').zfill(n)
        for j in arr2[i] :
            list2.append(j)
            
    for i in range(n*n):
        if list1[i] == '1' :
            result += "#"
        elif list2[i] == '1' :
            result += "#"
        else :
            result += " "

        if len(result) % n == 0 :
            answer.append(result)
            result = ""
    return answer