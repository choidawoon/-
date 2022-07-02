import java.util.Arrays;

class 예산 {
    public int solution(int[] d, int budget) {
        int answer = 0;
         
        Arrays.sort(d);
        for(int i=0; i<d.length; i++) {
        	if(budget>=d[i]) {
        		answer++;
        		budget -= d[i];
        	}
        }
        
        return answer;
    }
}
