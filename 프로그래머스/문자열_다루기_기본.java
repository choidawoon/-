class 문자열_다루기_기본 {
    public boolean solution(String s) {
        boolean answer = true;
        
        char carr[] = s.toCharArray();
        
        if(s.length()==4 || s.length()==6) {
        	
        for(int i=0; i<s.length(); i++) {
        	if(carr[i]=='0' || carr[i]=='1' || carr[i]=='2' || carr[i]=='3' || carr[i]=='4' || carr[i]=='5' || carr[i]=='6' || carr[i]=='7' || carr[i]=='8' || carr[i]=='9') {
        		continue;
        		}
        	else
        		answer = false;
        	}

        }
        
        else
        	answer = false;
        
        return answer;
    }
}