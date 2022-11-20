class Solution {
    public int[] solution(long n) {
        String result = String.valueOf(n);  // n을 뒤집기 위해 문자열로 만들기
        int[] answer = new int[result.length()]; // 문자열n 크기의 배열 만들기
        int resultLen = result.length() - 1; // for문의 길이를 위한 변수 선언
        int cnt = 0;    // 역순으로 돌 for문안에서 정상적으로 돌 answer 배열을 위한 cnt 변수 선언
    
        for (int i = resultLen; i >= 0; i--) {
            answer[cnt] = Integer.parseInt(String.valueOf(result.charAt(i)));  // 배열에 하나씩 for문이 반대로 돌면서 들어가고
  //근데 사실 answer[cnt++]을 넣고 밑의 cnt++없애는 것이 더보기 좋다                     // answer 배열은 cnt에 의해 정상적으로 돌아감
            cnt++;
        }
        return answer;
    }
}

// 사실 근데 5번열에서 선언한 변수는 나는 가독성을 늘리기위한 변수 선언이라고 생각했는데
// 사실 코드리뷰를 해보면서 느낀 결과는 오히려 가독성을 떨어트리는 변수였다.
// 또한 cnt변수를 사실 cnt++이 아닌 변수안에 answer[cnt++]처럼 선언한다면 가독성을 더 늘릴 수 있다.
