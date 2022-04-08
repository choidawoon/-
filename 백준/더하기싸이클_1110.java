import java.util.Scanner;

public class 더하기싸이클_1110 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		
		int N = sc.nextInt();
		int cnt = 0;
		boolean check = true;
		int same = N;
		
		while(check) {
			if(same>=10) {
				int a = same/10;
				int b = same%10;
				int c = a+b;
				if(c>=10) {
					c = c%10;
				}
				same = b*10 + c;
			}
			else {
				int a = 0;
				int b = same%10;
				same = b*10 + b;
			}
			cnt++;
			if(N==same)
				check = false;
		}
		System.out.println(cnt);
	}
}
