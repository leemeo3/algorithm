class Solution {
    public int solution(int n) {
        // 피자는 여섯 조각
        // 나눠먹을 사람 수 n
        // 여섯조각의 피자를 남기지않고 먹어야한다면 최소 몇판
        
        int answer = 1;
        
        while (!((answer * 6) % n == 0)) {
            answer++;
        }
        
        return answer;
    }
}