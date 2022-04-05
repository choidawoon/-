import java.util.Arrays;

public class 로또의최고순위와최저순위 {
	public int[] solution(int[] lottos, int[] win_nums) {
        int max = 0;
        int min = 0;
        
        Arrays.sort(lottos);
        Arrays.sort(win_nums);
        
        for(int i=0; i<6; i++) {
        	for(int j=0; j<6; j++) {
        		if(lottos[i]==win_nums[j]) {
        			lottos[i] = -1;
        			min++;
        		}
        	}
        }
        
        max = min;
        
        for(int i=0; i<6; i++) {
        	if(lottos[i]==0)
        		max++;
        }
        
        min = 7-min;
        max = 7-max;
        
        if(min>=7)
        	min = 6;
        if(max>=7)
        	max = 6;
        
        int[] answer = {max, min}; 
        return answer;
    }
}
