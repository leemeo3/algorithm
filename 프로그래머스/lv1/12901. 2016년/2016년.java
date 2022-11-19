class Solution {
    public String solution(int a, int b) {
        String answer = "";
        int[] month = {0,31,29,31,30,31,30,31,31,30,31,30,31};
        //               1  2  3  4  5  6  7  8  9  10 11 12
        String[] week = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};
        int totalDate = 0;
        for (int i = 0; i < a; i++) {
            totalDate += month[i];
        }
        totalDate += b;

        while (true) {
            answer = week[0];
            totalDate--;
            if (totalDate == 0)break;
            
            answer = week[1];
            totalDate--;
            if (totalDate == 0)break;
            
            answer = week[2];
            totalDate--;
            if (totalDate == 0)break;
            
            answer = week[3];
            totalDate--;
            if (totalDate == 0)break;
            
            answer = week[4];
            totalDate--;
            if (totalDate == 0)break;
            
            answer = week[5];
            totalDate--;
            if (totalDate == 0)break;
            
            answer = week[6];
            totalDate--;
            if (totalDate == 0)break;
        }
        
        return answer;
    }
}
