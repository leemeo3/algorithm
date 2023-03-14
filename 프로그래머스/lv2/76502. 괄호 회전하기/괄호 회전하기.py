from collections import deque

def solution(s):
    answer = 0
    result = deque(s)
    
    if len(s) % 2 == 0 :
        for i in range(len(s)) :
            last = result.popleft()
            result.append(last)
            slist = ''.join(result)
            
            while '[]' in slist or '()' in slist or '{}' in slist:
                if '[]' in slist:
                    slist = slist.replace('[]', '')
                if '()' in slist:
                    slist = slist.replace('()', '')
                if '{}' in slist:
                    slist = slist.replace('{}', '')
            if slist == '' :
                answer += 1
        return answer
    else :
        return 0