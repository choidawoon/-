class 제일_작은_수_제거하기 {
    public int[] solution(int[] arr) {
        int[] answer = new int[arr.length-1];
        
        if(arr.length==1) {
        	int[] result = new int[1];
        	result[0] = -1;
        	return result;
        }
        
        else {
        	int min = Integer.MAX_VALUE;
        	
        	for(int i=0; i<arr.length; i++) {
        		min = Math.min(min, arr[i]);
        	}
        	
        	int idx = 0;
        	boolean check = false;
        	
        	for(int i=0; i<answer.length; i++) {
        		
        		if(arr[i]==min && !check) {
        			check = true;
        			answer[i] = arr[idx+1];
        			idx++;
        			idx++;
        		}
        		
        		else {
        			answer[i] = arr[idx];
        			idx++;
        		}
        		
        	}
        	return answer;
        }
                
    }
}