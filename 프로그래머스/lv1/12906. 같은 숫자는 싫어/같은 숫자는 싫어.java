import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        ArrayList<Integer> list = new ArrayList<>(); // 리스트를 생성한다.
        int start = arr[0]; // 변수에 배열 인덱스0의 값으로 초기화한다.
        list.add(start); // 리스트에 이 값을 추가한다. -> 이 변수는 선언할 수밖에 없다. 반복문안에서 계속 바꿔줘야한다. 
        for (int i = 0; i < arr.length; i++) {  // 배열을 모두 검사할 반복문
            if (start != arr[i]) { // 변수의 값과 배열의 값이 일치하지 않을때 같은 숫자는 싫다가 되기에 변수값을 배열값으로 변경하고 리스트에 추가한다.
                start = arr[i];
                list.add(arr[i]);
            }
        }
        
        int[] answer = new int[list.size()]; // 리스트에 담긴 수의 크기만큼의 배열을 다시 만든다.
        for (int i = 0; i < answer.length; i++) { // 배열에 담는다.
            answer[i] = list.get(i);
        }
        return answer; // 제출한다.
    }
}
