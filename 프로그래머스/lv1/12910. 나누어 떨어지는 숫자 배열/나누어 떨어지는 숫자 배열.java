import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int divisor) {

        int cnt = 0; //나누어 떨어지는 값이 하나도 없을때를 대비하기 위한 cnt 생성
        int cnt2 = 0; // divisor로 나누어 떨어지는 값을 담을 배열을 생성하기 위한 cnt2 생성
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % divisor == 0){ // divisor로 나누어 떨어지는 값일때 cnt 증가
                cnt2++;    
            }
        }
        int[] answer = new int[cnt2];   // 위에서 구한 cnt값을 통해 배열 생성
        for (int i = 0; i < arr.length; i++) { // 이후 다시 for문을 돌려 값을 다시 넣어주면서 새로운 cnt생성
            if (arr[i] % divisor == 0) { 
                answer[cnt] = arr[i];
                cnt++;
            }
        }
        Arrays.sort(answer);    // 오름차순 정렬
        if (cnt == 0) { // cnt가 0 일 경우 나누어떨어지는 값이 하나도 없다는 뜻이기에 배열에 -1을 담는다
            answer = new int[1];
            answer[0] = -1;
        }
        return answer;
    }
}

// 8번행의 for문과 14번행의 for문을 두고 본다면 결국 이것은 같은 행위를 2번 하는것인데
// 순전히 이유가 나누어떨어지는 값을 담기위한 배열의 length값을 구하는 거였다면
// 굳이 배열을 쓰지 않고 리스트에 잠시 담아둔뒤 14번 배열에서의 cnt값을 활용해 배열을 생성하고
// 넣어 줄 수 있지 않을까?
// 근데 방금 생각들었는데 결국 그 리스트도 배열에 값을 넣기위해 for문을 돌릴 것 이기에
// 큰 차이는 없겠다.
