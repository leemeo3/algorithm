class Solution {
    public int solution(int[][] sizes) {
        // 가로 길이의 최대값과 세로 길이의 최대값을 구한 후 두 값을 곱한다.
        // 대신 가로 길이와 세로 길이를 바꿔서 최대값을 낮출수있다면 바꾼다.
        
        int answer = 0;
        int heightMaxSize = 0; // 세로 길이 최대값
        int widthMaxSize = 0; // 가로 길이 최대값
        
        for (int i = 0; i < sizes.length; i++) { // 세로길이보다 가로길이가 길다면 교체하는 반복문
            if (sizes[i][0] < sizes[i][1]) { 
                int result = 0; // 데이터를 저장하기 위해 임시로 선언한 변수
                result = sizes[i][0]; 
                sizes[i][0] = sizes[i][1];
                sizes[i][1] = result;
            }
        }
        
        heightMaxSize = sizes[0][0]; // 세로 길이 최대값의 초기값
        widthMaxSize = sizes[0][1]; // 가로 길이 최대값의 초기값
        for (int i = 0; i < sizes.length; i++) { // 배열의 크기만큼 반복문
            if (sizes[i][0] > heightMaxSize) { // 세로 길이를 교체하는 if문
                heightMaxSize = sizes[i][0];
            }
            if (sizes[i][1] > widthMaxSize) { // 가로 길이를 교체하는 if문
                widthMaxSize = sizes[i][1];
            }
        }
        
        answer = heightMaxSize * widthMaxSize;
        return answer;
    }
}

// 위 코딩 방식과 같이 교체하는 코드는 코딩테스트에서 상당히 유용하고 자주 사용할 개념이므로
// 잘 숙지하고 잘 응용할 것
