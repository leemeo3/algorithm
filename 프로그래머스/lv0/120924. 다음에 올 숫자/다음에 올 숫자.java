class Solution {
    public int solution(int[] common) {
        int answer = 0;
        
        if (common[1] - common[0] == common[2] - common[1]) {
            int a = common[1] - common[0];
            answer = common[common.length-1] + a;
        }else if (common[1] / common[0] == common[2] / common[1]) {
            int b = common[1] / common[0];
            answer = common[common.length-1] * b;
        }
        
        return answer;
    }
}