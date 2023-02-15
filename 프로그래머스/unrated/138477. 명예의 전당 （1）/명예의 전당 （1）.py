from heapq import heappop, heappush

def solution(k, score):
    answer = []
    heap = []               # 힙 리스트 선언     
    for s in score :        
        heappush(heap, s)   # 힙 리스트에 값 넣기
        if len(heap) > k :  # 힙 리스트가 k보다 길어 졌을때
            heappop(heap)   # 가장 작은 값 삭제
        answer.append(heap[0])  # 정답에 제일 작은 값 넣어주기
    return answer