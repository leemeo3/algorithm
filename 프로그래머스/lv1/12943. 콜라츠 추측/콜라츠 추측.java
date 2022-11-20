class Solution {
    public int solution(int num) {
        int answer = 0;
        while (true) {
            if (num == 0) {
                break;
            }else if (num == 1) {
                break;
            }else if (num % 2 == 0) {
                num /= 2;
            }else if (num % 2 == 1) {
                num = num * 3 + 1;
            }     
            answer++;
            if (num == 1) {
                break;
            }

            if (answer == 500) {
                answer = -1;
                break;
            }
        }
        return answer;
    }
}

// 나는 이 문제를 처음 접근했을때 너무 쉽다고 생각했다.
// 내가 무슨 코드를 짜야할지 명확히 보였다.
// 626331의 경우의 수도 나는 int값의 범위내에서는 처리 될거라고 생각했다. 홀수일때의 경우의수에 +1때문에 결국 짝수가 되고 계속 나눌거라고 생각했다.
// 정말 말그대로 위 코드대로 처리는 되기는 했는데 다른 분들의 코드를 보니 많은 고민을 하고 접근한거같더라.
// 그래서 반성을 했고 근데 팀원분께서 통과를 위한 코딩테스트라고 하셨는데 그말은 나도 동의를 했다.
// 더 다양한 접근 방식
