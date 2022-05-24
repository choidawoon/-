import java.util.Arrays;

class 실패율 {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        
        Arrays.sort(stages);
        
        int total = stages.length;
        double percent[] = new double[N];
        
        for(int i=1; i<=N; i++) {
        	
        	int cnt = 0;
        	for(int j=0; j<stages.length; j++) {
        		if(stages[j]==i) {
        			cnt++;
        		}
        	}
        	percent[i-1] = cnt/(double)total;
        	total = total-cnt;
        }
        
        
        for(int i=0; i<N; i++) {
        	answer[i] = i+1;
        }
        
        //버블정렬
        for(int j=0; j<N-1; j++) {
        	for(int i=0; i<N-1; i++) {
        		if(percent[i]<percent[i+1]) {
        			
        			double tmp = percent[i];
        			percent[i] = percent[i+1];
        			percent[i+1] = tmp;
        			
        			int tm = answer[i];
        			answer[i] = answer[i+1];
        			answer[i+1] = tm;
        			
        		}
        	}        	
        }
        
        return answer;
        
    }
}