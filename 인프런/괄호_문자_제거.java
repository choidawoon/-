import java.util.Scanner;
import java.util.Stack;

public class 괄호_문자_제거 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		
		char carr[] = str.toCharArray();
		
		StringBuilder sb = new StringBuilder();
		Stack<Character> st = new Stack<Character>();
		for(int i=0; i<str.length(); i++) {
			if(carr[i]=='(')
				st.add(carr[i]);
			else if(carr[i]==')')
				st.pop();
			else {
				if(st.isEmpty())
					sb.append(carr[i]);
			}
		}
		
		System.out.println(sb.toString());
		
	}
}
