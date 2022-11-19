class Solution {
    public int[] solution(int denum1, int num1, int denum2, int num2) {
        int[] answer = {};
        int result = 0;
        int deResult = 0;
        int maximum = 1;
        answer = new int[2];
        // num1, num2 는 서로 같은 최소값이 되도록 곱해줘야함
        // denum1, denum2는 각각 num1, num2을 곱한만큼 곱해줘야함
        // 배열에는 denum, num 순서로 들어가야함
        // 분수의 분자와 분모는 모두 0을 초과하고 1000 미만인 정수
            deResult = (denum1 * num2) + (denum2 * num1);
            result = num1 * num2;
        
        
        for (int i = 1; i <= deResult; i++) {
            if(deResult % i == 0 && result % i == 0) {
                maximum = i;
            }
        }
        
        answer[0] = deResult/maximum;
        answer[1] = result/maximum;
        
        return answer;
    }
}