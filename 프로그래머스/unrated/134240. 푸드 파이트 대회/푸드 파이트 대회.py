def solution(food):
    player1 = []
    player2 = []
    center = ""
    answer = ""
    
    for i in range(len(food)) :
        if i == 0 :
            center += "0"
        else:
            if food[i] % 2 == 0 :
                while food[i] != 0:
                    food[i] -= 2
                    player1.append(i)
                    player2.append(i)
            else:
                while food[i] > 1:
                    food[i] -= 2
                    player1.append(i)
                    player2.append(i)

    for i in player1:
        answer += str(i)
    answer += center
    player2.sort(reverse=True)
    for i in player2:
        answer += str(i)

    return answer