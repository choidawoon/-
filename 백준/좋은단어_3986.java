import java.util.Scanner;
import java.util.Stack;

public class 좋은단어_3986 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int cnt = 0;
		
		
		for(int i=0; i<N; i++) {
			String str = sc.next();
			char[] arr = str.toCharArray();
			Stack<Character> st = new Stack<>();
			
			for(int j=0; j<str.length(); j++) {
				if(!st.isEmpty()) {
					if(st.peek()==arr[j]) {
						st.pop();
					}
					else {
						st.push(arr[j]);
					}
				}
				else {
					st.push(arr[j]);
				}
			}
			if(st.isEmpty()) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}

}
