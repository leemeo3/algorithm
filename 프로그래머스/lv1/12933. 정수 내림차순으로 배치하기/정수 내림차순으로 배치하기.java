import java.util.Arrays;

class Solution {
    public long solution(long n) {
        long answer = 0;
        String result = String.valueOf(n);
        int[] arrays = new int[result.length()];
        String answer2 = "";
        
        for (int i = 0; i < arrays.length; i++) {
            arrays[i] = Integer.parseInt(String.valueOf(result.charAt(i)));
        }
        Arrays.sort(arrays);
        
        for (int i = arrays.length - 1; i >= 0; i--) {
            answer2 += arrays[i];
        }
        answer = Long.parseLong(answer2);
        return answer;
    }
}