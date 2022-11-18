import java.util.ArrayList;

class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int x2 = x;
        int sum = 0;
        ArrayList<Integer> list = new ArrayList<>();
        
        while (x2 > 0) {
            list.add(x2 % 10);
            x2 /= 10;
        }
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        if (x % sum == 0) {
            answer = true;
        }else {
            answer = false;
        }
        return answer;
    }
}