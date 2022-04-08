import java.util.Scanner;

public class 수들의합_1789 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	
		long N = sc.nextInt();
		long cnt = 1;
		
		for(int i=1; i<N; i++) {
			if(N-i>=i+1) {
				N = N-i;
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}
