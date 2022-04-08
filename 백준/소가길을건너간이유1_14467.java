import java.util.Scanner;

public class 소가길을건너간이유1_14467 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		int cnt = 0;
		int	bull[] = new int[10];
		for(int i=0; i<10; i++) {
			bull[i] = 2;
		}
		
		for(int tc=0; tc<t; tc++) {
			int a = sc.nextInt()-1;
			int b = sc.nextInt();
			if(bull[a]==2) {
				bull[a] = b;
			}
			else {
				if(bull[a]!=b) {
					cnt++;
					bull[a] = b;
				}
			}
		}
		System.out.println(cnt);
	}
}
