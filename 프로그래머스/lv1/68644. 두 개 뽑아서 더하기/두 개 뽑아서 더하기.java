import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        Set<Integer> set = new HashSet<Integer>(); // set은 리스트와 유사하지만 중복을 없애준다.
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if (i == j) { // 같은 인덱스의 값은 더하지 않는다
                    continue;
                }else {
                    set.add(numbers[i] + numbers[j]); // set 리스트에 더한 값을 넣어준다.
                }
            }
        }
        List<Integer> list = new ArrayList<Integer>(set); //리스트로 변환해준다
        int[] answer = new int[list.size()];

        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }
        Arrays.sort(answer); // 
        return answer;
    }
}
