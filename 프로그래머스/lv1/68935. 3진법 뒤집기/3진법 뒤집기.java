class Solution {
    public int solution(int n) {
        // 3진법으로 변환
        String n3 = (Integer.toString(n,3));
        // 문자열 나눠서 배열에 넣기 위한 배열 선언
        String[] strArray = n3.split("");
        // 뒤집은 문자 넣을 배열 선언
        String[] strRevers = new String[strArray.length];
        // for문과 반대로 돌 count 변수 선언
        int cnt = strRevers.length - 1;
        // 문자열에 이어붙일 변수 선언
        String answerResult = "";
        for (int i = 0; i < strRevers.length; i++) {
            strRevers[i] = strArray[cnt];
            cnt--;
            answerResult += strRevers[i];
        }
        int answer = Integer.parseInt(answerResult, 3);
        return answer;
    }
}