class 최조직사각형 {
    public int solution(int[][] sizes) {
        int answer = 0;
        
        int max = 0;
        int min = 0;
        
        for(int i=0; i<sizes.length; i++) {
        	int tmp_max = 0;
        	int tmp_min = 10000;
        	
        	tmp_max = Math.max(sizes[i][0], sizes[i][1]);
        	tmp_min = Math.min(sizes[i][0], sizes[i][1]);
        	
        	max = Math.max(max, tmp_max);
        	min = Math.max(min, tmp_min);
        }
        
        answer = max*min;
        return answer;
        
    }
}