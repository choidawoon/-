class 가운데_글자_가져오기 {
    public String solution(String s) {
        String answer = "";
        

        
        StringBuilder sb = new StringBuilder();
        int n = s.length();
        if(s.length()%2==0) {
        	sb.append(s.charAt(n/2-1));
        	sb.append(s.charAt(n/2));
        }
        else {
        	sb.append(s.charAt(n/2));
        }
        
        answer = sb.toString();
        return answer;
    }
}
