import java.util.Stack;

class 크레인_인형뽑기_게임 {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        
        Stack<Integer> st = new Stack<Integer>();
        
        for(int i=0; i<moves.length; i++) {
        	int pick = moves[i]-1;
        	for(int j=0; j<board.length; j++) {
        		if(board[j][pick]!=0) {
        			if(!st.isEmpty() && board[j][pick]==st.peek()) {
        				st.pop();
        				answer +=2;
        			}
        			else {
        				st.add(board[j][pick]);        				
        			}
        			board[j][pick] = 0;
        			break;
        		}
        	}
        }
        
        return answer;
    }
}