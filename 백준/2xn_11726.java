import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] memo = new int[N+1];
		
		for(int i=1; i<=N; i++) {
			if(i==1)
				memo[i] = 1;
			else if(i==2)
				memo[i] = 2;
			else
			memo[i] = (memo[i-1] + memo[i-2]) % 10007;
			
		}
		System.out.println(memo[N]);
	}

}