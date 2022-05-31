class 하샤드_수 {
    public boolean solution(int x) {
        boolean answer = true;
        
        int sum = 0;
        int tmp = x;
        
        while(tmp>=1) {
        	int a = tmp % 10;
        	sum += a;
        	tmp = tmp/10;
        }
        
        if(x%sum!=0)
        	answer = false;
        
        return answer;
    }
}