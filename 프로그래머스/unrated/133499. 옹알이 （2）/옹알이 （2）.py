def solution(babbling):
    answer = 0
    baby = ["aya", "ye", "woo", "ma"]
    for i in range(len(babbling)):
        for j in baby:
            if j * 2 not in babbling[i] :
                babbling[i] = babbling[i].replace(j, " ").strip()
        if babbling[i] == '':
            answer += 1
    return answer