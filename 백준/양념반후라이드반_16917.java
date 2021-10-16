import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int sauce = sc.nextInt();
		int fried = sc.nextInt();
		int half = sc.nextInt();

		int sauce_cnt = sc.nextInt();
		int fried_cnt = sc.nextInt();
		int half_cnt = 0;
		
		long min = (sauce*sauce_cnt) + (fried*fried_cnt) + (half*half_cnt);
		int cnt = Math.min(sauce_cnt, fried_cnt);
		
		if(sauce+fried > half*2) {
			cnt = Math.max(sauce_cnt, fried_cnt);
		}
		
		for(int i=1; i<=cnt; i++) {
			sauce_cnt--;
			fried_cnt--;
			if(sauce_cnt-1<0)
				sauce_cnt=0;
			if(fried_cnt-1<0)
				fried_cnt=0;
			half_cnt+=2;
			min = Math.min(min, (sauce*sauce_cnt) + (fried*fried_cnt) + (half*half_cnt));
		}
		
		System.out.println(min);
	}
	

}
