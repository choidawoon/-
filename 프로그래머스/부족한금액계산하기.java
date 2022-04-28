class 부족한금액계산하기 {
    public long solution(int price, int money, int count) {
        long answer = 0;
        
        long total = 0;
        
        for(int i=1; i<=count; i++) {
        	int tmp = i * price;
        	total += tmp;
        }
        
        if(total>money) 
        	answer = total - money;
        
        
        return answer;
    }
}