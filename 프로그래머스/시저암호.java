class 시저암호 {
    public String solution(String s, int n) {
        String answer = "";
        
        StringBuilder sb = new StringBuilder();
        
        for(int i=0; i<s.length(); i++) {
        	
        	char tmp = s.charAt(i);
        	
        	if(tmp==' ') {
        		sb.append(tmp);
        	}
        	
        	if(tmp>='a' && tmp<='z') {
        		if(tmp+n>'z') 
        			tmp = (char)(tmp+n-26);
        		else
        			tmp = (char)(tmp+n);
        		sb.append(tmp);
        	}
        	
        	if(tmp>='A' && tmp<='Z') {
        		if(tmp+n>'Z') 
        			tmp = (char)(tmp+n-26);
        		else
        			tmp = (char)(tmp+n);
        		sb.append(tmp);
        	}
        	
        }
         
        answer = sb.toString();
        return answer;
        
    }
}
