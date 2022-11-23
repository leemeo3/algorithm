class Solution {
    public String solution(String new_id) {
        // 1단계
        String step2 = "";
        step2 = new_id.toLowerCase();

        // 2단계
        String step3 = step2.replaceAll("[^a-z0-9_.-]", "");

        // 3단계
        String step4 = "";
        // String new_id_3 = new_id_2.replaceAll("[.]+", ".");
        step4 = step3.replaceAll("[.]+", ".");

        // 4단계
        String step5 = "";
        String[] step5Result = step4.split("");
        for (int i = 0; i < step5Result.length; i++) {
            if (i == 0 || i == step5Result.length - 1) {
                step5Result[i] = step5Result[i].replaceAll("\\.", "");
                step5 += step5Result[i];
            }else {
                step5 += step5Result[i];
            }
        }

        // 5단계
        String step6 = "";
        if (step5.isEmpty() || step5 == null || step5.equals("")) {
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
