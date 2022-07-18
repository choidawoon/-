import java.util.Scanner;
import java.util.Stack;

public class 크레인_인형뽑기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int map[][] = new int[N][N];
		int result = 0;
		
		for(int i=0; i<N; i++) {
			for(int j=0; j<N; j++) {
				map[i][j] = sc.nextInt();
			}
		}
		
		int M = sc.nextInt();
		
		Stack<Integer> st = new Stack<Integer>();
		
		for(int tc=0; tc<M; tc++) {
			int sel = sc.nextInt()-1;
			
			for(int i=0; i<N; i++) {
				if(map[i][sel]!=0) {
					int tmp = map[i][sel];
					map[i][sel] = 0;
					if(!st.isEmpty() && tmp==st.peek()) {
						result +=2;
						st.pop();
					}
					else
						st.add(tmp);
					break;
				}
			}
		}
		
		System.out.println(result);
		
	}
}
