class 삼진법_뒤집기 {
    public int solution(int n) {
        int answer = 0;
        
        int a = 1;
        int cnt = 0;
        while(n>=a) {
        	a = a*3;
        	cnt++;
        }
        
        int three[] = new int[cnt];
        int reverse[] = new int[cnt];
        
        for(int i=cnt-1; i>=0; i--) {
        	int idx = 1;
        	
        	for(int j=0; j<i; j++) {
        		idx = idx*3;
        	}
        	
        	int su = 0;
        	while(n>=idx) {
        		if(n>=idx) {
        			su++;
        			n = n-idx;
        		}
        	}
        	
        	three[i] = su;
        	
        }
        
        for(int i=0; i<cnt; i++) {
        	reverse[cnt-1-i] = three[i];
        }
        
        for(int i=0; i<cnt; i++) {
        	int idx =1;
        	for(int j=0; j<i; j++) {
        		idx = idx*3;
        	}
        	idx = idx * reverse[i];
        	answer += idx;
        }
        
        return answer;
        
    }
}