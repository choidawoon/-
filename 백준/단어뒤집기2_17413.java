import java.util.Scanner;
import java.util.Stack;

public class 단어뒤집기2_17413 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		char[] arr = str.toCharArray();
		
		Stack<Character> st = new Stack<>();
		boolean check = false;
		
		for(int i=0; i<str.length(); i++) {
			if(arr[i]=='<') {
				check = true;
				while(!st.isEmpty()) {
					System.out.print(st.pop());
				}
				System.out.print(arr[i]);
			}
			else if(arr[i]=='>') {
				check = false;
				System.out.print(arr[i]);
			}
			else if(arr[i]==' ') {
				while(!st.isEmpty()) {
					System.out.print(st.pop());
				}
				System.out.print(" ");
			}
			else if(check)
				System.out.print(arr[i]);
			else
			st.add(arr[i]);
		}
		while(!st.isEmpty()) {
			System.out.print(st.pop());
		}
	}
}
