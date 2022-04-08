import java.util.Scanner;
import java.util.Stack;

public class 제로_10773 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		Stack<Integer> st = new Stack<>();
		
		for(int i=0; i<N; i++) {
			int n = sc.nextInt();
			if(n==0) {
				st.pop();
			}
			else {
				st.add(n);
			}
		}
		int sum = 0;
		while(!st.isEmpty()) {
			sum += st.pop();
		}
		System.out.println(sum);
	}
}
