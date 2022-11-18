class Solution {
    public String solution(int n) {
        String answer = "";
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                answer += "수";
            }else {
                answer += "박";
            }
        }
        return answer;
    }
}

// 삼항연산자를 이용하면 더욱 코드는 간결해지지만 나에게 있어서는
// 가독성에 문제가 있어보여서 사용하고 싶진 않다
// 하지만 언젠간 써야할때가 오긴 하겠지?
