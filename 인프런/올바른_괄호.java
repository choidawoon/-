import java.util.Scanner;
import java.util.Stack;

public class 올바른_괄호 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		char carr[] = str.toCharArray();
		String result = "YES";
		
		Stack<Character> st = new Stack<Character>();
		for(int i=0; i<str.length(); i++) {
			if(carr[i]=='(')
				st.push(carr[i]);
			else {
				if(st.isEmpty()) {
					result = "NO";
					break;
				}
				st.pop();
			}
		}
		
		if(!st.isEmpty())
			result = "NO";
		
		System.out.println(result);
		
	}
}
