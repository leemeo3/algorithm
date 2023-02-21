function solution(arr) {
    var answer = 0;
    var result = 0;
    for (var i = 0; i < arr.length; i++) {
        result += arr[i];
    }
    answer = result / arr.length;
    
    return answer;
}