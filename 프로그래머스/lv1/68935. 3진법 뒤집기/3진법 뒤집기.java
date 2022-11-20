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

// 이 문제도 너무 어렵게만 생각했다.
// 일단 10진법을 3진법으로 변환해 int에 담을 생각을 했는데 그러지말고 바로 문자열에 담을 수 있었고
// 그 담은 문자열을 바로 뒤짚어서 다시 10진법으로 바꾸면은 바로 해결인데
// 코드를 너무 지저분하고 길게 쓴거 같다.
// 아마도 내가 문자열을 뒤집고 다시 넣는것에 대해서 많이 두려워한거같다
// 쉽게 생각하자 
