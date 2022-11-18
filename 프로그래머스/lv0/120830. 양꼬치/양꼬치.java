class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        int food = n * 12000;
        int drink = k * 2000;
        int service = (n / 10) * 2000;
        
        answer = food + drink - service;
        return answer;
    }
}