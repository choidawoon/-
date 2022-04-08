import java.util.Scanner;

public class 구구단_12221 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		for(int tc=1; tc<=t; tc++) {
			
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			if(a>=10 || b>=10)
				System.out.println("#" + tc + " -1");
			else
				System.out.println("#" + tc + " " + a*b);
			
		}
	}
}
