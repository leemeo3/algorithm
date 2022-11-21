class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int maxWin = 0;
        int zeroCnt = 0;

        for (int i = 0; i < lottos.length; i++) {
            if (lottos[i] == 0) {
                zeroCnt++;
                maxWin++;
                continue;
            }
            for (int j = 0; j < win_nums.length; j++) {
                if (lottos[i] == win_nums[j]) {
                    maxWin++;
                }
            }
        }
        int minwin = maxWin - zeroCnt;
        int[] answer = new int[2];
        
        switch (maxWin) { // 최대 순위
            case 6: maxWin = 1; // 1위
                break;
            case 5: maxWin = 2; // 2위
                break;
            case 4: maxWin = 3; // 3위
                break;
            case 3: maxWin = 4; // 4위
                break;
            case 2: maxWin = 5; // 5위
                break;
            default: maxWin = 6; // 나머지 6위
                break;
        }
        switch (minwin) { // 최저 순위
            case 6: minwin = 1; // 1위
                break;
            case 5: minwin = 2; // 2위
                break;
            case 4: minwin = 3; // 3위
                break;
            case 3: minwin = 4; // 4위
                break;
            case 2: minwin = 5; // 5위
                break;
            default: minwin = 6; // 나머지 6위
                break;
        }
        answer[0] = maxWin;
        answer[1] = minwin;
        
        return answer;
    }
}