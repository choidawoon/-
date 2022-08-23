import java.util.Scanner;

public class 조합의_경우수 {
	static int N;
	static int M;
	static int result = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		M = sc.nextInt();
		
		System.out.println(recur(N,M));
		
	}
	static int recur(int n, int r) {
		if(n==r || r==0) {
			return 1;
		}
		return recur(n-1,r-1) + recur(n-1,r);
	}
}
