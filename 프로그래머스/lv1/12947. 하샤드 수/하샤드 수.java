import java.util.ArrayList;

class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int x2 = x; // 변수 복사 이유는 while문을 돌리면서 원본에 덮어씌우기때문
        int sum = 0;
        ArrayList<Integer> list = new ArrayList<>();
        
        while (x2 > 0) { // 복사한 배열을 사용해 
            list.add(x2 % 10);
            x2 /= 10;
        }
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        if (x % sum == 0) { // 여기서 원본의 변수를 사용
            answer = true;
        }else {
            answer = false;
        }
        return answer;
    }
}
