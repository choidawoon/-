import java.util.Scanner;
import java.util.Stack;

public class 스택_10828 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		Stack<Integer> st = new Stack<>();
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<N; i++) {
			String str = sc.next();
			
			if(str.equals("push")) {
				st.add(sc.nextInt());
			}
			else if(str.equals("pop")) {
				if(st.isEmpty())
					sb.append("-1\n");
				else
					sb.append(st.pop() + "\n");
			}
			else if(str.equals("size"))
				sb.append(st.size() + "\n");
			else if(str.equals("empty")) {
				if(st.isEmpty())
					sb.append("1\n");
				else
					sb.append("0\n");
			}
			else if(str.equals("top")) {
				if(st.isEmpty())
					sb.append("-1\n");
				else
					sb.append(st.peek() + "\n");
			}
		}
		
		System.out.println(sb);
	}
}
