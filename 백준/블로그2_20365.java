import java.util.Scanner;

public class 블로그2_20365 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		String str = sc.next();
		
		char carr[] = str.toCharArray();
		int b_cnt = 0;
		int r_cnt = 0;
		
		int total = 1;
		char pre = 'a';
		
		for(int i=0; i<str.length(); i++) {
			if(pre == carr[i])
				continue;
			if(carr[i]=='B') {
				pre = 'B';
				b_cnt++;
			}
			else if(carr[i]=='R') {
				pre = 'R';
				r_cnt++;
			}
		}
		
		total = Math.min(b_cnt, r_cnt);
		
		System.out.println(total+1);
		
	}
}
