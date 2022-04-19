class 신규아이디추천 {
    public String solution(String new_id) {
        String answer;
        
        String step1 = new_id.toLowerCase();

        char[] step1_arr = step1.toCharArray();
        StringBuilder step2 = new StringBuilder();
        for (char c : step1_arr) {
            if ((c >= 'a' && c <= 'z') || (c >= '0' && c <= '9') || c == '-' || c == '_' || c == '.') {
                step2.append(c);
            }
        }

        String step3 = step2.toString().replace("..", ".");
        while (step3.contains("..")) {
            step3 = step3.replace("..", ".");
        }

        String step4 = step3;
        if (step4.length() > 0) {
            if (step4.charAt(0) == '.') {
                step4 = step4.substring(1, step4.length());
            }
        }
        if (step4.length() > 0) {
            if (step4.charAt(step4.length() - 1) == '.') {
                step4 = step4.substring(0, step4.length() - 1);
            }
        }

        String step5 = step4;
        if (step5.equals("")) {
            step5 = "a";
        }

        String step6 = step5;
        if (step6.length() >= 16) {
            step6 = step6.substring(0, 15);

            if (step6.charAt(step6.length() - 1) == '.') {
                step6 = step6.substring(0, step6.length() - 1);
            }
        }

        StringBuilder step7 = new StringBuilder(step6);
        if(step6.length()==2) {
        	step7.append(step6.charAt(1));
        }
        if(step6.length()==1) {
        	step7.append(step6);
        	step7.append(step6);
        }

        answer = step7.toString();
        return answer;
    }
}