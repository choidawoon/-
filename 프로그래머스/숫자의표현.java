class 숫자의표현 {
    public int solution(int n) {
        int answer = 0;
        
        for(int i=1; i<=n; i++) {
        	
        	int sum  = 0;
        	int idx = i;
        	
        	while(sum+idx<=n) {
        		sum += idx;
        		idx++;
        	}//while
        	
        	
        	if(sum==n)
        		answer++;
  
        }//for
        
        return answer;
        
    }
}
