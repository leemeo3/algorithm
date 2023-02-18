def solution(triangle):
    answer = 0
    cnt = 0
    for i in range(1, len(triangle)):                                       # i는 첫번째 배열 인덱스
        cnt += 1
        for j in range(i + 1):                                              # j는 두번째 배열 인덱스
            if j == 0:                                                      # 제일 왼쪽일 경우
                triangle[i][j] += triangle[i-1][j]                          # 이전인덱스의 j의 0번째값 더함
            elif j == i:                                                    # 제일 오른쪽일 경우
                triangle[i][j] += triangle[i-1][j-1]                        # 이전인덱스의 j의 끝값 더함
            else:                                                           # 가운데일 경우
                triangle[i][j] += max(triangle[i-1][j], triangle[i-1][j-1]) # 이전인덱스의 양옆의 값중 큰값을 더함
    answer = max(triangle[cnt])                                             # 마지막 인덱스의 가장 큰값을 answer에 입력
    return answer