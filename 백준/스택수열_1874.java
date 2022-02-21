import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class 스택수열_1874 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		StringBuilder sb = new StringBuilder();
		
		int N = sc.nextInt();
		int arr[] = new int[N];
		for(int i=0; i<N; i++) {
			arr[i] = sc.nextInt();
		}
		
		int idx = 0;
		Stack<Integer> st = new Stack<Integer>();
		for(int i=1; i<=N; i++) {
			
			st.add(i);
			sb.append("+\n");
			
			while(!st.isEmpty()) {
				if(st.peek()==arr[idx]) {
					st.pop();
					sb.append("-\n");
					idx++;
				}
				else
					break;
			}//while
		}//for
		
		if(st.isEmpty())
			System.out.println(sb);
		else
			System.out.println("NO");
		
	}
}
