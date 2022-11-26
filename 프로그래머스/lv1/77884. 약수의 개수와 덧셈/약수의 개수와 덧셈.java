class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        int cnt = 0; // 약수의 갯수를 파악하기 위한 변수
        for (int i = left; i <= right; i++) { // left부터 right까지 반복
            cnt = 0;                        // 약수의 초기화
            for (int j = 1; j <= i; j++) {  // 1부터 i(현재값)까지 나누어 떨어지는지 확인
                if (i % j == 0) { // j는 i까지 계속 증가
                    cnt++; // 나누어 떨어지는 cnt 증가
                }
            }
            System.out.println(i + "의 약수는 " + cnt + "개");
            if (cnt % 2 == 0) { // 약수의 갯수가 짝수일때 + 홀수일떄 - 
                answer += i;
            }else {
                answer -= i;
            }
        }
        return answer;
    }
}
