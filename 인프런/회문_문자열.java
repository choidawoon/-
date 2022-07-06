import java.util.Scanner;

public class 회문_문자열 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next().toLowerCase();
		
		boolean check = false;
		for(int i=0; i<str.length()/2; i++) {
			if(str.charAt(i)!=str.charAt(str.length()-1-i))
				check = true;
		}
		
		if(check)
			System.out.println("NO");
		else
			System.out.println("YES");
		
	}
}
