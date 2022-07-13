import java.util.Scanner;

public class 연속_부분수열 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		int arr[] = new int[N];
		int cnt = 0;
		
		for(int i=0; i<N; i++)
			arr[i] = sc.nextInt();
		
		
		for(int i=0; i<N; i++) {
			int sum = 0;
			int idx = i;
			boolean check = true;
			
			while(check) {
				if(sum>=M || idx>=N) {
					check = false;
					break;
				}
				sum += arr[idx];
				idx++;
			}
			if(sum==M)
				cnt++;
		}
		
		System.out.println(cnt);
		
	}
}
