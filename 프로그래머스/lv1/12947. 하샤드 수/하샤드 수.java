import java.util.ArrayList;

class Solution {
    public boolean solution(int x) {
        int x2 = x; // 변수에 값을 복사한다.
        int sum = 0; // 자릿수를 나눈 수를 모두 더할 변수 선언
        ArrayList<Integer> list = new ArrayList<>(); // 리스트 선언
        
        while (x2 > 0) { // 모든 자릿수를 검사할때까지 반복한다.
            list.add(x2 % 10); // 리스트에 값을 담는다. 근데 생각해보니 이 값은 sum += (x2 % 10)으로도 처리가 가능했고 그렇다면 리스트를 만들지 않아도 디ㅗㄴ다.
            x2 /= 10; // 계속 나눈다.
        }
        for (int i = 0; i < list.size(); i++) { // 이 반복문은 결국 선언하지 않아도 됐다. 반복문안에 짧은 코드 특히 저런 한줄만 들어간다면
                                                // 이유를 고민해보고 줄일수있다면 줄이자 아마 잘 생각하면 줄일수 있는 방법이 있을것이다.
                                                // 가독성을 오히려 늘리는 선에서..
            sum += list.get(i);
        }
        if (x % sum == 0) {     // 나누어떨어지는지 검사하고 answer에 담지않고 바로 
            return true;
        }else {
            return false;
        }
        // return answer;
    }
}
