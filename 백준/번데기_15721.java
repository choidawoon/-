import java.util.Scanner;

public class 번데기_15721 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int count = sc.nextInt();
		int what = sc.nextInt();
		
		int b_cnt = 0;
		int d_cnt = 0;
		int start = 2;
		
		boolean check = true;
		
		while(check) {
			for(int i=0; i<4; i++) {
				if(i%2==0)
					b_cnt++;
				else
					d_cnt++;
				if(b_cnt==count && what==0) {
					System.out.println((b_cnt + d_cnt-1)%N);
					check = false;
					break;
				}
				else if(d_cnt==count && what==1) {
					System.out.println((b_cnt + d_cnt-1)%N);
					check = false;
					break;
				}
			}
			
			for(int i=0; i<start; i++) {
				b_cnt++;
				if(b_cnt==count && what==0) {
					System.out.println((b_cnt + d_cnt-1)%N);
					check = false;
					break;
				}
			}
			
			for(int i=0; i<start; i++) {
				d_cnt++;
				if(d_cnt==count && what==1) {
					System.out.println((b_cnt + d_cnt-1)%N);
					check = false;
					break;
				}
			}
			start++;
		}
		
	}
}
