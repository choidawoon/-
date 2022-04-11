import java.util.Arrays;

class 없는숫자더하기 {
    public int solution(int[] numbers) {
    	
    	Arrays.sort(numbers);
    	int[] compare = new int[10];
    	for(int i=0; i<10; i++) {
    		compare[i] = i;
    	}
    	
    	for(int i=0; i<10; i++) {
    		for(int j=0; j<numbers.length; j++) {
    			if(compare[i]==numbers[j]) {
    				compare[i] = -1;
    				break;
    			}
    		}
    	}
    	int answer = -1;
    	
    	for(int i=0; i<10; i++) {
    		if(compare[i]!=-1)
    			answer += compare[i];
    	}
    	
    	
        return answer;
    }
}