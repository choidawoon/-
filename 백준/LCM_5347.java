import java.util.Scanner;

public class LCM_5347 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int tc=0; tc<t; tc++) {
			long a = sc.nextInt();
			long b = sc.nextInt();
			
			long gcd = gcd(a,b);
			long lcm = a*b/gcd;
			System.out.println(lcm);
		}
	}
	static long gcd(long a, long b) {
		if(b>a) {
			long c=a;
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
