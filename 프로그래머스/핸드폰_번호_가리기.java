class 핸드폰_번호_가리기 {
    public String solution(String phone_number) {
        String answer = "";
        
        StringBuilder sb = new StringBuilder();
        char carr[] = phone_number.toCharArray();
        
        for(int i=0; i<phone_number.length()-4; i++) {
        	sb.append("*");
        }
        for(int i=phone_number.length()-4; i<phone_number.length(); i++) {
        	sb.append(carr[i]);
        }
        
        answer = sb.toString();
        
        return answer;
    }
}