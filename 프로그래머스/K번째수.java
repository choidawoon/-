import java.util.Arrays;

class K번째수 {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        for(int i=0; i<commands.length; i++) {
        	int a = commands[i][0];
        	int b = commands[i][1];
        	int c = commands[i][2];
        	int[] tmp = new int[b-a+1];
        	int idx = 0;
        	for(int j=a-1; j<b; j++) {
        		tmp[idx] = array[j];
        		idx++;
        	}
        	Arrays.sort(tmp);
        	answer[i] = tmp[c-1];
        }
        
        
         
        return answer;
    }
}
