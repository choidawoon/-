import java.util.Scanner;

public class 일로만들기_1463 {

	static int N;
	static int cnt;
	static int min = Integer.MAX_VALUE;
	static int[] memo;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		memo = new int[N+1];
		memo[0] = 0;
		memo[1] = 0;
		
		for(int i=2; i<=N; i++) {
			memo[i] = memo[i-1] + 1;
			if(i%3==0)
				memo[i] = Math.min(memo[i], memo[i/3] + 1);
			if(i%2==0)
				memo[i] = Math.min(memo[i], memo[i/2] +1 );
		}
		
		System.out.println(memo[N]);
		
	}
}
