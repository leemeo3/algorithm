def solution(price):
    answer = 0
    if price >= 500000 :
        answer = int(price - (price * 0.2))
    elif price >= 300000 :
        answer = int(price - (price * 0.1))
    elif price >= 100000 :
        answer = int(price - (price * 0.05))
    else :
        answer = price
        
    return answer