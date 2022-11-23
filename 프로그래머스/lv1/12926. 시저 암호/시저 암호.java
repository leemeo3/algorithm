class Solution {
    public String solution(String s, int n) {
        String answer = "";
        int i = 0;
        int start = 0;
        while (true) {
            start = 0;
            if (((int)s.charAt(i)) <= 90 && ((int)s.charAt(i)) >= 65) {
                start = ((int)s.charAt(i));
                start += n;
                if (start > 90) {
                    start -= 26;
                    answer += String.valueOf((char)start);
                }else {
                    answer += String.valueOf((char)start);
                }
            } else if (((int)s.charAt(i)) <= 122 && ((int)s.charAt(i)) >= 97) {
                start = ((int)s.charAt(i));
                start += n;
                if (start > 122) {
                    start -= 26;
                    answer += String.valueOf((char)start);
                }else {
                    answer += String.valueOf((char)start);
                }
            }else {
                start = ((int)s.charAt(i));
                start += n;
                answer += " ";
            }
            i++;
            if (i == s.length()) {
                break;
            }
        }
        return answer;
    }
}