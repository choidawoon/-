class 다트게임 {
    public int solution(String dartResult) {
        int answer = 0;
        
        int score[] = new int[3];
        int idx = 0;
        
        for(int i=0; i<dartResult.length(); i++) {
        	boolean two = false;
        	boolean minus = false;
        	
        	if(dartResult.charAt(i)=='*') {
        		two = true;
        	}
        	
        	if(dartResult.charAt(i)=='#') {
        		minus = true;
        	}
        	
        	if(dartResult.charAt(i)=='S') {
        		int a = Integer.parseInt(dartResult.substring(i-1,i));
        		if(i-2>=0 && dartResult.charAt(i-2)=='1')
        			a = 10;
        		int tmp = (int) Math.pow(a, 1);
        		score[idx] = tmp;
        		idx++;
        	}
        	if(dartResult.charAt(i)=='D') {
        		int a = Integer.parseInt(dartResult.substring(i-1,i));
        		if(i-2>=0 && dartResult.charAt(i-2)=='1')
        			a = 10;
        		int tmp = (int) Math.pow(a, 2);
        		score[idx] = tmp;
        		idx++;
        	}
        	if(dartResult.charAt(i)=='T') {
        		int a = Integer.parseInt(dartResult.substring(i-1,i));
        		if(i-2>=0 && dartResult.charAt(i-2)=='1')
        			a = 10;
        		int tmp = (int) Math.pow(a, 3);
        		score[idx] = tmp;
        		idx++;
        	}
        	
        	if(two) {
        		score[idx-1] = 2 * score[idx-1];
        		if(idx-2>=0) {
        			score[idx-2] = 2 * score[idx-2];
        		}
        	}
        	
        	if(minus) {
        		score[idx-1] = -score[idx-1];
        	}
        	
        }
        
        for(int i=0; i<3; i++) {
        	answer += score[i];
        }
        
        return answer;
    }
}