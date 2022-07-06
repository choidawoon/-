import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class 특정_문자_뒤집기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		Stack<Character> st = new Stack<Character>();
		Queue<Character> qu = new LinkedList<Character>();
		
		boolean check[] = new boolean[str.length()];
		for(int i=0; i<str.length(); i++) {
			if((str.charAt(i)>='a' && str.charAt(i)<='z') || (str.charAt(i)>='A' && str.charAt(i)<='Z')) {
				st.add(str.charAt(i));
			}
			else {
				qu.add(str.charAt(i));
				check[i] = true;
			}
		}
		
		
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<str.length(); i++) {
			if(check[i])
				sb.append(qu.poll());
			else
				sb.append(st.pop());
		}
		
		System.out.println(sb.toString());
		
	}
}
