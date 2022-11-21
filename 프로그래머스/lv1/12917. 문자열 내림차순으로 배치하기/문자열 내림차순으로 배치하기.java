import java.util.Arrays;

class Solution {
    public String solution(String s) {
        String answer = "";
        int[] arr = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            arr[i] = s.charAt(i);
        }
        Arrays.sort(arr); // 정렬하는거 잊지말자 
        for (int i = s.length() - 1; 0 <= i; i--) {
            answer += String.valueOf((char)arr[i]);
        }
        
        return answer;
    }
}