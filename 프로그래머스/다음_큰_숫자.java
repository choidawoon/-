class 다음_큰_숫자 {
    public int solution(int n) {
        int answer = 0;
        
        String str = Integer.toBinaryString(n);
        int cnt = 0;
        
        for(int i=0; i<str.length(); i++) {
        	if(str.charAt(i)=='1')
        		cnt++;        	
        }
        
        	for(int i=n+1; i<1000000; i++) {
        		String tmp = Integer.toBinaryString(i);
        		int tmp_cnt = 0;
        		
        		for(int j=0; j<tmp.length(); j++) {
        			if(tmp.charAt(j)=='1')
        				tmp_cnt++;
        			if(tmp_cnt>cnt)
        				break;
        		}
        		
        		if(tmp_cnt==cnt) {
        			answer = i;
        			break;
        		}
        		
        	}
         
        return answer;
        
    }
}
