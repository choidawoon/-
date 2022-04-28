import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

class 두개뽑아서더하기 {
    public int[] solution(int[] numbers) {
        int[] answer;
        
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        Arrays.sort(numbers);
        
        for(int i=0; i<numbers.length-1; i++) {
        	for(int j=i+1; j<numbers.length; j++) {
        		int sum = numbers[i] + numbers[j];
        		if(!list.contains(sum))
        			list.add(sum);
        	}
        }
        
        Collections.sort(list);
        
        answer = new int[list.size()];
        for(int i=0; i<list.size(); i++) {
        	answer[i] = list.get(i);
        }
        
        return answer;
    }
}