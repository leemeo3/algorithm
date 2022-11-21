import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        Set<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if (i == j) {
                    continue;
                }else {
                    set.add(numbers[i] + numbers[j]);
                }
            }
        }
        List<Integer> list = new ArrayList<Integer>(set);
        int[] answer = new int[list.size()];

        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }
        Arrays.sort(answer);
        return answer;
    }
}