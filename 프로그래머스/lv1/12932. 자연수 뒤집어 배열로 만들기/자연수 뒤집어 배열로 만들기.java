class Solution {
    public int[] solution(long n) {
        String result = String.valueOf(n);
        int[] answer = new int[result.length()];
        int resultLen = result.length() - 1;
        int cnt = 0;
    
        for (int i = resultLen; i >= 0; i--) {
            answer[cnt++] = Integer.parseInt(String.valueOf(result.charAt(i)));
        }
        return answer;
    }
}