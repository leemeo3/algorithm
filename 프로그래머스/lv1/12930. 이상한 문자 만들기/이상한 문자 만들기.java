import java.util.Arrays;
class Solution {
    public String solution(String s) {
        String answer = "";
        String[] real = s.split(""); // s문자열을 문자열배열 real에 담는다
        int start = 0; // 공백을 무시하고 단어의 첫번째 글자를 만났을때 인덱스표기를 하기위핸 변수 선언
        for (int i = 0; i < real.length; i++) {
            if (real[i].equals(" ")) { // 공백을 만나면 answer에도 똑같이 공백을 넣어주고 반복문 계속 진행 start변수는 계속0을 유지
                answer += " ";
                start = 0;
            } else if (start % 2 == 0) { // 공백이 아니라면은 0도 2로나눴을때 떨어지므로 실행됨 그리고 글자수에 따라 start값 계속 +
                answer += real[i].toUpperCase();
                start++;
            } else {
                answer += real[i].toLowerCase(); // 2로 나눴을때 
                start++;
            }
        }
        return answer;
    }
}
