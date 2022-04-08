import java.util.Scanner;

public class 홀수일까짝수일까_5549 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		for(int tc=1; tc<=t; tc++) {
			
			String str = sc.next();
			int a = str.charAt(str.length()-1);
			
			if(a%2==1)
				System.out.println("#" + tc + " Odd");
			else
				System.out.println("#" + tc + " Even");
		}//tc
	}
}
