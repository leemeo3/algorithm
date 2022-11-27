import java.util.Arrays;

class Solution {
    public String[] solution(String[] strings, int n) {
        String[] answer = new String[strings.length];
        
        for (int i = 0; i < strings.length; i++) {
            answer[i] = String.valueOf(strings[i].charAt(n)); // strings의 배열의 i번째 인덱스의 n 번째 단어 뽑아내기
            strings[i] = answer[i] + strings[i]; // n번째 단어 + stirngs배열의 i번째 인덱스 단어
        }
        Arrays.sort(strings); // 맨앞글자 기준으로 정렬
        
        for (int i = 0; i < strings.length; i++) {
            strings[i] = strings[i].substring(1,strings[i].length()); //정렬한 이후 맨 앞글자 잘라줌
            answer[i] = strings[i]; // 정답배열에 정상적인 단어 다시 
        }
        
        return answer;
    }
}
