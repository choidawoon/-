import java.util.Scanner;

public class 에라토스테네스의체_2960 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		boolean check[] = new boolean[N+1];
		boolean ck = false;
		int result = 0;
		
		int cnt = 0;
		for(int i=2; i<=N; i++) {
			if(!ck) {
				for(int j=i; j<=N; j+=i) {
					if(!check[j]) {
						cnt++;
						check[j] = true;
					}
					if(cnt==M) {
						result = j;
						ck = true;
						cnt++;
					}
				}
			}
		}
		System.out.println(result);
	}
}
