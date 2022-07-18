import java.util.Scanner;
import java.util.Stack;

public class 쇠막대기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		char carr[] = str.toCharArray();
		int result  = 0;
		
		Stack<Character> st = new Stack<Character>();
		
		for(int i=0; i<str.length(); i++) {
			if(carr[i]=='(') {
				st.add(carr[i]);
			}
			else {
				st.pop();
				if(carr[i-1]=='(')
					result += st.size();
				else
					result++;
			}
		}
		
		System.out.println(result);
		
	}
}
