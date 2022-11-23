class Solution {
    public String solution(String new_id) {
        // 1단계
        String step2 = "";
        step2 = new_id.toLowerCase(); // 모든 문자 소문자로 치환
        // 2단계
        String step3 = step2.replaceAll("[^a-z0-9_.-]", ""); // 정규식을 통한 조건에 맞는 문자제외하고 모두 제거
        // 3단계                                              // a부터z까지, 0부터9까지 _.-제외하고 전부 제거 (replaceAll 함수사용)
        String step4 = "";
        step4 = step3.replaceAll("[.]+", ".");  // 마침표(.)가 2번이상 연속될시 마침표(.) 1개로 치환
        // 4단계
        String step5 = "";
        String[] step5Result = step4.split(""); // 문자열 배열화
        for (int i = 0; i < step5Result.length; i++) {
            if (i == 0 || i == step5Result.length - 1) {  //i인덱스가 첫번째 이거나 마지막 이거나
                step5Result[i] = step5Result[i].replaceAll("\\.", ""); // 마침표(.)가 있을 경우 제거
                step5 += step5Result[i];
            }else {
                step5 += step5Result[i];
            }
        }
        // 5단계
        String step6 = "";
        if (step5.isEmpty() || step5 == null || step5.equals("")) { // 빈 문자열 일 경우 a로 치환
            step6 = "a";
        }else {
            step6 = step5;
        }
        // 6단계
        String step7 = "";
        if (step6.length() >= 16) {
            step7 = step6.substring(0,15);
            String[] step6Result = step7.split("");
            step7 = "";
            for (int i = 0; i < step6Result.length; i++) {
                if (i == step6Result.length - 1) {
                    step6Result[i] = step6Result[i].replaceAll("\\.", "");
                    step7 += step6Result[i];
                }else {
                    step7 += step6Result[i];
                }
            }
        }else {
            step7 = step6;
        }
        // 7단계
        String answer = step7;
        if (answer.length() < 3) {
            String trimString = String.valueOf(answer.charAt(answer.length() - 1));
            while (true) {
                answer += trimString;
                if (answer.length() >= 3) {
                    break;
                }
            }
        }
        return answer;
        }
    }
