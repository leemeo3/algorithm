import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int divisor) {

        int cnt = 0;
        int cnt2 = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % divisor == 0){
                cnt2++;    
            }
        }
        int[] answer = new int[cnt2];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % divisor == 0) {
                answer[cnt] = arr[i];
                cnt++;
            }
        }
        Arrays.sort(answer);
        if (cnt == 0) {
            answer = new int[1];
            answer[0] = -1;
        }
        return answer;
    }
}