def solution(nums):
    answer = 0
    hash = {}
    length = len(nums)/2
    
    for i in nums:
        hash[i] = 1
        
    if len(hash) > length :
        answer = length
    else:
        answer = len(hash)
    return answer