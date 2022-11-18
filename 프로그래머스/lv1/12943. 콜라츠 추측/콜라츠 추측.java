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
// 문제자체는 항해99 2주차 과정의 중간 정도에 있는 문제였지만
// 구현난이도는 요구사항을 그대로 적어주기만하면 되는거라 가장 쉬웠지 않았나싶다.
