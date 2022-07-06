import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class 중복문자제거 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		
//		ArrayList<Character> list = new ArrayList<Character>();
		StringBuilder sb = new StringBuilder();
//		
//		for(int i=0; i<str.length(); i++) {
//			if(!list.contains(str.charAt(i))) {
//				list.add(str.charAt(i));
//				sb.append(str.charAt(i));
//			}
//		}
		
		for(int i=0; i<str.length(); i++) {
			if(str.indexOf(str.charAt(i))==i)
				sb.append(str.charAt(i));
		}
		
		
		System.out.println(sb.toString());
		
	}
}
