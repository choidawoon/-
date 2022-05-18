class 정수_제곱근_판별 {
    public long solution(long n) {
        long answer = 0;
        
        long idx = 1;
        
        while(true) {
        	if(Math.pow(idx, 2)>=n) {
        		break;
        	}
        	idx++;
        }
       
        if(idx*idx==n) {
        	idx++;
        	answer = idx*idx;        	
        }
        else
        	answer = -1;
        
        return answer;
        
    }
}