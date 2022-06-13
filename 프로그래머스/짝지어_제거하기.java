import java.util.Stack;

class 짝지어_제거하기
{
    public int solution(String s)
    {
        int answer = -1;

        Stack<Character> st = new Stack<Character>();
        
        for(int i=0; i<s.length(); i++) {
        	if(!st.isEmpty()) {
        		if(st.peek()==s.charAt(i)) {
        			st.pop();
        		}
        		else {
        			st.add(s.charAt(i));
        		}
        	}
        	else {
        		st.add(s.charAt(i));
        	}
        }
        
        if(st.isEmpty())
        	answer = 1;
        else
        	answer = 0;
        
        return answer;
    
    }
}