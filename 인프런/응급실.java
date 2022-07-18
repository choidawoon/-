import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 응급실 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		String sub = sc.next();
		String str = sc.next();
		
		Queue<Character> qu = new LinkedList<Character>();
		for(int i=0; i<sub.length(); i++) {
			qu.add(sub.charAt(i));
		}
		
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i)==qu.peek())
				qu.poll();
			if(qu.isEmpty())
				break;
		}
		
		if(qu.isEmpty())
			System.out.println("YES");
		else
			System.out.println("NO");
		
	}
}
