import java.util.Arrays;


class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        Arrays.sort(participant); // 마라토너 전체 인원 오름차순 정렬
        Arrays.sort(completion); // 마라토너 완주자 인원 오름차순 정렬 -> 같은 인덱스값에서 정보가 일치하지 않는순간 완주하지 못한사람을 찾을 수 있음
        
        for (int i = 0; i < completion.length; i++) {
            if (participant[i].equals(completion[i])) { // 전체인원과 완주자 이퀄함수로 비교
                    // 사실 else 문을 위에서 처리하고 else를 붙이지 않는 것이 맞는데 내가 보기 힘들기도하고
                    // 내가 생각하는 가독성과는 맞지않아서 이와같이 코드를 짬
            }else {
                answer += participant[i]; // answer에 미완주자 삽입
                break; // 배열은 정지
            }
        }
        if (answer == "") { // 완주자 배열이 전체인원보다 짧기에 for문을 완주자 기준으로 돌렸고 그 때문에 마지막인덱스의 경우는 알지 못함
            answer = participant[participant.length - 1]; // 그래서 마지막 인덱스까지 아무것도 안들어왔을시 무조껀 그사람이 미완주자 이기에 
        }
        
        return answer;
    }
}
