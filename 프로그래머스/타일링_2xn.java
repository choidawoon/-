class 타일링_2xn {
    public int solution(int n) {
        int answer = 0;
        
        int[] memo = new int[n+1];
		memo[1] = 1;
        memo[2] = 2;
		for(int i=3; i<=n; i++) {
			memo[i] = (memo[i-1] + memo[i-2]) % 1000000007;
		}
        
        return memo[n];
        
    }
}