import java.util.Scanner;

public class add_123 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int tc=1; tc<=t; tc++) {
			
			int n = sc.nextInt();
			int[] memo = new int[11];
			
			memo[1] = 1;
			memo[2] = 2;
			memo[3] = 4;
			
			for(int i=4; i<=n; i++) {
				memo[i] = memo[i-1] + memo[i-2] + memo[i-3];
			}
			
			System.out.println(memo[n]);
		}//tc
	}

}
