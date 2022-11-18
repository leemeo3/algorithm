class Solution {
    public int[] solution(long n) {
        String result = String.valueOf(n);
        int[] answer = new int[result.length()];
        int resultLen = result.length() - 1; // 가독성을 위한 변수생성으로 반복문을 반대로 돌리기위해 생성
        int cnt = 0; // answer 배열에는 순서대로 넣기위해 cnt 생성
    
        for (int i = resultLen; i >= 0; i--) {
            answer[cnt] = Integer.parseInt(String.valueOf(result.charAt(i)));
            cnt++; // cnt값 증가시키며 answer에 순서대로 삽입
        }
        return answer;
    }
}

// 반복문은 반대로 돌렸지만 cnt값을 통해 정답배열에는 순서대로 넣을 수 있다
// 예전에는 이런 생각을 못했는데 아무래도 계속 문법을 다루다보니
// 나도 모르게 이런 생각이 드는거같다
