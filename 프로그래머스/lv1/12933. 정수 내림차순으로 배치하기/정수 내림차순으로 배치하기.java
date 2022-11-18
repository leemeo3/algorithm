import java.util.Arrays;

class Solution {
    public long solution(long n) {
        long answer = 0;
        String result = String.valueOf(n); // 매개변수 자릿수별로 뜯기위해 문자열로 변환
        int[] arrays = new int[result.length()]; // 문자열로 변환된 result정보로 배열 생성
        String answer2 = ""; 
        
        for (int i = 0; i < arrays.length; i++) {
            arrays[i] = Integer.parseInt(String.valueOf(result.charAt(i))); // array배열에 한글자씩 삽입
        }
        Arrays.sort(arrays); // 배열 오름차순 정렬
        
        for (int i = arrays.length - 1; i >= 0; i--) {
            answer2 += arrays[i];  // 미리 생성해둔 문자열 answer2에 배열 값 하나씩 추가 (문자열더하기)
        }
        answer = Long.parseLong(answer2); // 다 더해둔 문자열 long 으로 형변환 후 long 변수 answer로 
        return answer;
    }
}
