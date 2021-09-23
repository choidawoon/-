import java.util.Scanner;

public class most_increase_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] su = new int[N+1];
		int[] memo = new int[N+1];
		
		for(int i=1; i<=N; i++) {
			su[i] = sc.nextInt();
		}
		
		for(int i=1; i<=N; i++) {
			for(int j=0; j<=i; j++) {
//				if(su[j] < su[i] && memo[i] < memo[j]+1)
//				memo[i] = memo[j] + 1;
				if(su[j] < su[i])
					memo[i] = Math.max(memo[i], memo[j]+1);
			}
		}
		
		int max = 0;
		for(int i=1; i<=N; i++) {
			max = Math.max(max, memo[i]);
		}
		
		System.out.println(max);
		
	}
}
