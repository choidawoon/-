class JadenCase_문자열_만들기 {
    public String solution(String s) {
        String answer = "";
        
        String[] starr = s.toLowerCase().split("");
        StringBuilder sb = new StringBuilder();
        
        boolean check = true;
        
        for(int i=0; i<starr.length; i++) {
        	if(check)
        		sb.append(starr[i].toUpperCase());
        	else
        		sb.append(starr[i]);
        	
        	if(starr[i].equals(" "))
        		check = true;
        	else
        		check = false;
        	
        }
        
        answer = sb.toString();
        
        return answer;
    }
}