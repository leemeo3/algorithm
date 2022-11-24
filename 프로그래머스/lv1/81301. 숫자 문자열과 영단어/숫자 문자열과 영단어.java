class Solution {
    public int solution(String s) {
        int answer = 0;
        for (int i = 0; i < 9; i++) {
            s = s.replace("zero", String.valueOf(0));
            s = s.replace("one", String.valueOf(1));
            s = s.replace("two", String.valueOf(2));
            s = s.replace("three", String.valueOf(3));
            s = s.replace("four", String.valueOf(4));
            s = s.replace("five", String.valueOf(5));
            s = s.replace("six", String.valueOf(6));
            s = s.replace("seven", String.valueOf(7));
            s = s.replace("eight", String.valueOf(8));
            s = s.replace("nine", String.valueOf(9));
        }
        answer = Integer.parseInt(s);
        return answer;
    }
}