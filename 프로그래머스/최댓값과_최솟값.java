class 최댓값과_최솟값 {
    public String solution(String s) {
        String answer = "";
        
        String starr[] = s.split(" ");
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        
        for(int i=0; i<starr.length; i++) {
        	int tmp = Integer.parseInt(starr[i]);
        	max = Math.max(max, tmp);
        	min = Math.min(min, tmp);
        }
        
        StringBuilder sb = new StringBuilder();
        
        sb.append(min);
        sb.append(" ");
        sb.append(max);
        
        answer = sb.toString();
        
        return answer;
    }
}