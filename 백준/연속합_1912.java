import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] memo = new int[N];
		
		for(int i=0; i<N; i++) {
			memo[i] = sc.nextInt();
		}
		
		for(int i=1; i<N; i++) {
			memo[i] = Math.max(memo[i-1] + memo[i], memo[i]);
		}
		
		int max = Integer.MIN_VALUE;
		for(int i=0; i<N; i++) {
			max = Math.max(max, memo[i]);
		}
		
		System.out.println(max);
		
	}
}