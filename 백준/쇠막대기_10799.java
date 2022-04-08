import java.util.Scanner;
import java.util.Stack;

public class 쇠막대기_10799 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		char[] arr = str.toCharArray();
		int stick = 0;
		int result = 0;
		
		Stack<Character> st = new Stack<>();
		
		for(int i=0; i<str.length(); i++) {
			if(arr[i]=='(') {
				stick++;
			}
			else {
				stick--;
				if(arr[i-1]=='(') {
					result += stick;
				}
				else if(arr[i-1]==')') {
					result++;
				}
			}
		}
		System.out.println(result);
	}
}
