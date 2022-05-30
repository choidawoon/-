class 문자열을_정수로_바꾸기 {
    public int solution(String s) {
        int answer = 0;
        boolean check = false;
        
        if(s.charAt(0)=='+') {
        	s = s.substring(1);
        	answer = Integer.parseInt(s);
        }
        
        if(s.charAt(0)=='-') {
        	s = s.substring(1);
        	answer = Integer.parseInt(s);
        	answer = -answer;
        }
        
        else
        	answer = Integer.parseInt(s);
        
        return answer;
    }
}