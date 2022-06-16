import java.util.*;

public class 같은_숫자는_싫어 {
    public int[] solution(int []arr) {
        int[] answer = {};
        
        ArrayList<Integer> list = new ArrayList<Integer>();
        int tmp = 10;
        for(int i=0; i<arr.length; i++) {
        	if(arr[i]!=tmp) {
        		list.add(arr[i]);
        		tmp = arr[i];
        	}
        }
        
        answer = new int[list.size()];
        for(int i=0; i<list.size(); i++) {
        	answer[i] = list.get(i);
        }
       
        return answer;
    }
}
