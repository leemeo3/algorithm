class Solution {
    public String solution(String s, int n) { 
        String answer = "";
        int i = 0;
        int start = 0;
        while (true) {
//            System.out.println(((int)s.charAt(i))); // 받은 문자열 그대로 아스키코드로 변환한 코드
            if (((int)s.charAt(i)) <= 90 && ((int)s.charAt(i)) >= 65) { // 대문자인지 확인
                start = ((int)s.charAt(i) + n); // start변수에 n만큼 추가한 아스키코드를 넣는다.
                if (start > 90) { // 아스키코드값이 대문자Z을 초과하는 범위일 경우
                    start -= 26; // 아스키코드 값의 한바퀴인 26을 빼줌
                    answer += String.valueOf((char)start); // answer 변수에 순차적으로 넣어줌
                }else {
                    answer += String.valueOf((char)start); // 대문자Z를 초과하는 값이 아닐 경우 바로 answer 변수에 넣어줌
                }
            } else if (((int)s.charAt(i)) <= 122 && ((int)s.charAt(i)) >= 97) { // 소문자 인지 확인
                start = ((int)s.charAt(i) + n); // start변수에 n만큼 추가한 아스키코드를 넣는다.
                if (start > 122) { // 아스키코드값이 소문자z를 초과하는 범위일 경우
                    start -= 26; // 아스키코드 값의 한바퀴인 26을 빼줌
                    answer += String.valueOf((char)start);
                }else {
                    answer += String.valueOf((char)start);
                }
            }else {
                answer += " "; // 둘다의 경우가 아니라면 공백뿐이기에 공백을 그대로 넣어줌
            }
            i++;
            if (i == s.length()) {break;} // while문이기에 별도의 브레이크 
        }
        return answer;
    }
}
