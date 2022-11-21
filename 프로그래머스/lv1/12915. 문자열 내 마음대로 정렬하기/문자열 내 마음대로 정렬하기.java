import java.util.Arrays;

class Solution {
    public String[] solution(String[] strings, int n) {
        String[] answer = new String[strings.length];
        
        for (int i = 0; i < strings.length; i++) {
            answer[i] = String.valueOf(strings[i].charAt(n));
            strings[i] = answer[i] + strings[i];
        }
        Arrays.sort(strings);
        
        for (int i = 0; i < strings.length; i++) {
            strings[i] = strings[i].substring(1,strings[i].length());
            answer[i] = strings[i];
        }
        
        return answer;
    }
}