import java.util.Arrays;

class Solution {
    public String solution(String s) {
        String answer = "";
        int[] arr = new int[s.length()];    //int형 배열을 s문자열의 길이만큼의 크기로 만든다.
        for (int i = 0; i < s.length(); i++) { 
            arr[i] = s.charAt(i); // char형 으로 변환해 int형 배열에 순차적으로 넣는다. 이때 아스키코드값으로 변환되어서 들어간다.
        }
        Arrays.sort(arr); // 아스키코드 값을 기준으로 오름차순 정렬한다.
        for (int i = s.length() - 1; 0 <= i; i--) {
            answer += String.valueOf((char)arr[i]); // 역순으로 answer값에 더해준다.
        }
        
        return answer;
    }
}
