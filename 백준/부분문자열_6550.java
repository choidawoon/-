import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 부분문자열_6550 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()) {
			String str1 = sc.next();
			String str2 = sc.next();
			
			Queue<Character> qu = new LinkedList<Character>();
			
			char carr1[] = str1.toCharArray();
			char carr2[] = str2.toCharArray();
			
			for(int i=0; i<str1.length(); i++) {
				qu.add(carr1[i]);
			}
			
			for(int i=0; i<str2.length(); i++) {
				if(carr2[i]==qu.peek()) {
					qu.poll();
				}
				if(qu.isEmpty())
					break;
			}
			
			if(qu.isEmpty())
				System.out.println("Yes");
			else
				System.out.println("No");
			
			
		}//while
		

	}

}
