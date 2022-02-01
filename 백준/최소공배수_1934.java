import java.util.Scanner;

public class 최소공배수_1934 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		for(int tc=1; tc<=t; tc++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			int gcd = gcd(a,b);
			int lcm = a*b/gcd;
			System.out.println(lcm);
		}//tc
	}
	static int gcd(int a, int b) {
		if(b>a) {
			int c=a;
			a=b;
			b=c;
		}
		if(b==0) {
			return a;
		}
		else {
			return gcd(b, a%b);
		}
	}
}
