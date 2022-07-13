import java.util.Scanner;

public class 최대_길이_연속부분수열 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		int arr[] = new int[N];
		int max = 0;
		int cnt = 0;
		
		for(int i=0; i<N; i++)
			arr[i] = sc.nextInt();
		
		for(int i=0; i<N; i++) {
			int idx = i;
			int life = 0;
			cnt = 0;
			
			boolean check = true;
			while(check) {
				
				if(idx>=N) {
					check = false;
					break;
				}
				
				if(arr[idx]==0)
					life++;
				
				if(life>M)
					break;
				
				cnt++;
				idx++;
				
			}//while
			
			max = Math.max(max, cnt);
			
		}//for
		
		System.out.println(max);
		
	}
}
