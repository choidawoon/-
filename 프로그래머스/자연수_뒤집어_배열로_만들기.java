class 자연수_뒤집어_배열로_만들기 {
    public int[] solution(long n) {
    	
    	int cnt = 0;
    	long tmp = n;
    	while(tmp>0) {
    		tmp = tmp/10;
    		cnt++;
    	}
    	
        int[] answer = new int[cnt];
        
        int idx = 0;
        while(n>0) {
        	answer[idx] = (int) (n%10);
        	n = n/10;
        	idx++;
        }
        
        return answer;
        
    }
}