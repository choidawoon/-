import java.util.Scanner;
import java.util.Stack;

public class 후위식_연산 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		
		char carr[] = str.toCharArray();
		
		Stack<Integer> st = new Stack<Integer>();
		for(int i=0; i<str.length(); i++) {
			
			if(carr[i]=='+') {
				int a = st.pop();
				int b = st.pop();
				st.add(a+b);
			}
			else if(carr[i]=='-') {
				int a = st.pop();
				int b = st.pop();
				st.add(b-a);
			}
			else if(carr[i]=='*') {
				int a = st.pop();
				int b = st.pop();
				st.add(a*b);
			}
			else if(carr[i]=='/') {
				int a = st.pop();
				int b = st.pop();
				st.add(b/a);
			}
			else {
				int tmp = carr[i]-'0';
				st.add(tmp);
			}
			
		}//for
		
		System.out.println(st.pop());
		
	}
}
