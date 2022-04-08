import java.util.Scanner;

public class 시험감독_13458 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int tc_cnt = sc.nextInt();
		int stuent[] = new int[tc_cnt];
		
		int cnt = 0;
		
		for(int i=0; i<tc_cnt; i++) {
			stuent[i] = sc.nextInt();
		}
		
		int cap = sc.nextInt();
		int second = sc.nextInt();
		
		for(int i=0; i<tc_cnt; i++) {
			if(cap>=stuent[i]) {
				cnt++;
			}
			else {
				int a = stuent[i] - cap;
				cnt++;
				int b = (int) Math.ceil((double)a/second);
				cnt += b;
			}
		}
		
		System.out.println(cnt);
	}

}
