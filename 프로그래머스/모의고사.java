import java.util.ArrayList;
import java.util.List;

class 모의고사 {
    public List<Integer> solution(int[] answers) {
        List<Integer> answer = new ArrayList<Integer>();
        
        int[] student_1 = {1,2,3,4,5};
        int[] student_2 = {2,1,2,3,2,4,2,5};
        int[] student_3 = {3,3,1,1,2,2,4,4,5,5};
        
        int cnt[] = new int[3];
        
        for(int i=0; i<answers.length; i++) {
        	int s[] = new int[3];
        	
        		s[0] = student_1[i%5];
        		s[1] = student_2[i%8];
        		s[2] = student_3[i%10];
        	
        	for(int j=0; j<3; j++) {
        		if(s[j] == answers[i]) {
        			cnt[j]++;
        		}
        	}
        }
        
        int max = 0;
        for(int i=0; i<3; i++) {
        	max = Math.max(max, cnt[i]);
        }
        
        for(int i=0; i<3; i++) {
        	if(max==cnt[i])
        		answer.add(i+1);
        }
        
        return answer;
        
    }
}