def solution(babbling):
    answer = 0
    baby = ["aya", "ye", "woo", "ma"]           # 조카가 발음할 수 있는 단어
    for i in range(len(babbling)):
        for j in baby:                          # 조카가 발음할 수 있는 단어 j
            if j * 2 not in babbling[i] :       # 연속해서 같은 발음 나올 경우 예외처리
                babbling[i] = babbling[i].replace(j, " ").strip()# 같은 발음 나오면 공백 치환
        if babbling[i] == '':                   # 공백치환후 공백제거 했으므로 ''일시 카운트 1
            answer += 1
    return answer