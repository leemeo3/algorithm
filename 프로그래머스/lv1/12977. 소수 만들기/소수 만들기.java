class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int total = 0;
        int cnt = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    total = nums[i] + nums[j] + nums[k];
                    cnt = 0;
                    for (int l = 1; l < total + 1; l++) {
                        if (total % l == 0) {
                            cnt += 1; // 나누어 떨어지는 숫자 카운트
                        }
                    }
                    if (cnt == 2) { // 나누어떨어지는 숫자가 2개뿐일때
                        answer += 1;
                    }
                }
            }
        }
        return answer;
    }
}