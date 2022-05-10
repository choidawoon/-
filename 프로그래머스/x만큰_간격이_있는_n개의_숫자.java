class x만큰_간격이_있는_n개의_숫자 {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        
        long sum = 0;
        
        for(int i=0; i<n; i++) {
        	sum += x;
        	answer[i] = sum;
        }
        return answer;
    }
}