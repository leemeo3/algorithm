import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        String result = String.valueOf(n); // int 자료형을 문자열로 변환시킨 후
        
        for (int i = 0; i < result.length(); i++) { // 문자열의 길이만큼 반복
            answer += Integer.parseInt(String.valueOf(result.charAt(i))); // int answer변수에 int형으로 변환해가며 한자릿수씩 더하기
        }

        return answer;
    }
}
