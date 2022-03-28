import java.util.Arrays;

class Ã¼À°º¹ {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = n-lost.length;
        
        Arrays.sort(lost);
        Arrays.sort(reserve);

        for(int i=0; i<lost.length; i++) {
        	for(int j=0; j<reserve.length; j++) {
        		if(lost[i]==reserve[j]) {
        			lost[i] = -100;
        			reserve[j] = -100;
        			answer++;
        			break;
        		}
        	}
        }
        
        for(int i=0; i<lost.length; i++) {
        	for(int j=0; j<reserve.length; j++) {
        		if(lost[i]==reserve[j]+1 || lost[i]==reserve[j]-1) {
        			reserve[j] = -100;
        			answer++;
        			break;
        		}
        	}
        }
        return answer;
    }
}
