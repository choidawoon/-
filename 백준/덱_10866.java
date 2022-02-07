import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class µ¦_10866 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		Deque<Integer> dq = new ArrayDeque<Integer>();
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<N; i++) {
			String str = sc.next();
			if(str.equals("push_back")) {
				int a = sc.nextInt();
				dq.addLast(a);
			}
			else if(str.equals("push_front")) {
				int a = sc.nextInt();
				dq.addFirst(a);
			}
			else if(str.equals("pop_front")) {
				if(!dq.isEmpty()) 
					sb.append(dq.pollFirst() + "\n");
				else
					sb.append("-1\n");
			}
			else if(str.equals("pop_back")) {
				if(!dq.isEmpty())
					sb.append(dq.pollLast() + "\n");
				else
					sb.append("-1\n");
			}
			else if(str.equals("size")) {
				sb.append(dq.size() + "\n");
			}
			else if(str.equals("empty")) {
				if(dq.isEmpty())
					sb.append("1\n");
				else
					sb.append("0\n");
			}
			else if(str.equals("front")) {
				if(!dq.isEmpty()) 
					sb.append(dq.peekFirst() + "\n");
				else
					sb.append("-1\n");
			}
			else {
				if(!dq.isEmpty())
					sb.append(dq.peekLast() + "\n");
				else
					sb.append("-1\n");
			}
			
		}//for	
		System.out.println(sb);	
	}
}
