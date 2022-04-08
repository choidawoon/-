import java.util.Scanner;

public class ¼Ò¼ö_2581 {
	static int idx = 0;
	static int sum = 0;
	static int min = Integer.MAX_VALUE;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int M = sc.nextInt();
		int N = sc.nextInt();
		
		for(int i=M; i<=N; i++) {
			check(i);
		}
		if(min==Integer.MAX_VALUE) {
			System.out.println("-1");
		}
		else {
			System.out.println(sum);
			System.out.println(min);
		}
		
	}
	static void check(int a) {
		boolean su = true;
		for(int i=2; i<a; i++) {
			if(a%i==0) {
				su = false;
				break;
			}
		}
		if(su && a!=1) {
			sum += a;
			min = Math.min(min, a);
		}
	}
}
