import java.util.Scanner;

public class 동철이의프로그래밍대회_6913 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		for(int tc=1; tc<=t; tc++) {
			
			int N = sc.nextInt();
			int M = sc.nextInt();
			int max = 0;
			int cnt = 0;
			
			int arr[] = new int[N];
			
			for(int i=0; i<N; i++) {
				for(int j=0; j<M; j++) {
					int a = sc.nextInt();
					if(a==1) 
						arr[i]++;
				}
			}
			
			for(int i=0; i<N; i++) {
				max = Math.max(max, arr[i]);
			}
			
			for(int i=0; i<N; i++) {
				if(arr[i]==max)
					cnt++;
			}
			
			System.out.println("#" + tc + " " + cnt + " " + max);
		
		}//tc
	}
}
