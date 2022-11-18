class Solution {
    public long solution(long n) {
        long answer = 0;
        long result = (long)Math.sqrt(n); // 제곱근을 구할 수 있는 함수
        if (Math.pow(result, 2) == n) { // result의 제곱근(2)이 n 과같은 수 일 경우
            answer = (long) Math.pow(result + 1, 2); // answer값에 제곱근 +1 값에 제곱
        }else {
            answer = -1; // 경우의 수에 해당하지 않을 경우 -1
        }
        return answer;
    }
}
