class 가운데_글자_가져오기 {
    public String solution(String s) {
        String answer = "";
        
        // 홀수일때 2/n + 1
        // 짝수일때 2/n, 2/n + 1
        
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