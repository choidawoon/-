import java.util.Scanner;

public class 연속된_자연수의_합 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int cnt = 0;
		int sum = 0;
		
		for(int i=1; i<=N/2+2; i++) {
			int idx = i;
			boolean check = true;
			
			sum = 0;
			
			while(check) {
				
				if(idx>=N/2+2 || sum>=N) {
					check = false;
					break;
				}
	
				sum += idx;
				idx++;				
	
			}//while
			
			if(sum==N)
				cnt++;
			
		}//for
		
		System.out.println(cnt);
		
	}
}
