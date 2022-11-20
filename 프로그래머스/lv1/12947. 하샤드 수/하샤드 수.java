class Solution {
    public boolean solution(int x) {
        int x2 = x;
        int sum = 0;
        
        while (x2 > 0) {
            sum += x2 % 10; // 내가 변수에 연산한 값을 바로 넣는다는게 어색해서 그런거 같다.
                            // 아마도 한번에 한가지 일만 수행하는게 가독성이 더 좋다라고 판단한 오류아닐까?
            x2 /= 10;
        }
        if (x % sum == 0) {
            return true;
        }else {
            return false;
        }
    }
}

// 수정한 코드로 다시 실행하니 아주 깔끔히 성공했다.
// 한번에 한가지 일만 수행보다 두가지 일도 수행할 수 있으면 하고 세가지 일은 아마 그럴 일이 있을까?? 라는 생각이 먼저 든다. ( 수의 사칙연산은 아무리 많아도 한가지로 봐야하지않을까)
