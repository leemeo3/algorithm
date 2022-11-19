class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int heightMaxSize = 0;
        int widthMaxSize = 0;
        
        for (int i = 0; i < sizes.length; i++) {
            if (sizes[i][0] < sizes[i][1]) {
                int result = 0;
                result = sizes[i][0];
                sizes[i][0] = sizes[i][1];
                sizes[i][1] = result;
            }
        }
        
        heightMaxSize = sizes[0][0];
        widthMaxSize = sizes[0][1];
        for (int i = 0; i < sizes.length; i++) {
            if (sizes[i][0] > heightMaxSize) {
                heightMaxSize = sizes[i][0];
            }
            if (sizes[i][1] > widthMaxSize) {
                widthMaxSize = sizes[i][1];
            }
        }
        
        answer = heightMaxSize * widthMaxSize;
        return answer;
    }
}