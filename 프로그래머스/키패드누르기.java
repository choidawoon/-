class Å°ÆÐµå´©¸£±â {
    public String solution(int[] numbers, String hand) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        
        int now_right = 12;
        int now_left = 10;
        
        
        for(int i=0; i<numbers.length; i++) {
        	if(numbers[i]==1 || numbers[i]==4 || numbers[i]==7) {
        		now_left = numbers[i];
        		sb.append("L");
        	}
        	else if(numbers[i]==3 || numbers[i]==6 || numbers[i]==9) {
        		now_right = numbers[i];
        		sb.append("R");
        	}
        	else {
        		if(numbers[i]==0) {
        			numbers[i] = 11;
        		}
        		int left_dis = Math.abs(numbers[i]-now_left)/3 + Math.abs(numbers[i]-now_left)%3;
        		int right_dis = Math.abs(numbers[i]-now_right)/3 + Math.abs(numbers[i]-now_right)%3;
        		if(left_dis==right_dis) {
        			if(hand.equals("left")) {
        				sb.append("L");
        				now_left = numbers[i];
        			}
        			else {
        				sb.append("R");
        				now_right = numbers[i];
        			}
        		}
        		else {
        			if(left_dis < right_dis) {
        				sb.append("L");
        				now_left = numbers[i];
        			}
        			else {
        				sb.append("R");
        				now_right = numbers[i];
        			}
        		}
        		
        	}
        	
        }//for
        
        answer = sb.toString();
        return answer; 
    }
}
