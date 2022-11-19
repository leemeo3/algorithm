class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        int value = -1000;
        int result = -1000;
        
        if(num == 1) {
            answer[0] = total;
            return answer;
        }
        
        
        while (!(result == total)) {
            result = 0;
            value++;
            for (int i = 0; i < num; i++) {
                result += value + i;
            }
        }
        
        for (int i = 0; i < num; i++) {
            answer[i] = value;
            value++;
        }
        
        return answer;
    }
}