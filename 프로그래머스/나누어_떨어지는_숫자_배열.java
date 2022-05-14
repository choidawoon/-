import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class 나누어_떨어지는_숫자_배열 {
    public List<Integer> solution(int[] arr, int divisor) {
        int[] answer = new int[arr.length];
        
        for(int i=0; i<arr.length; i++) {
        	if(arr[i]%divisor==0) {
        		answer[i] = arr[i];
        	}
        }
        
        Arrays.sort(answer);
        
        List<Integer> list = new ArrayList<Integer>();
        for(int i=0; i<arr.length; i++) {
        	if(answer[i]!=0) {
        		list.add(answer[i]);
        	}
        }
        if(list.isEmpty())
        	list.add(-1);
        
        return list;
    }
}