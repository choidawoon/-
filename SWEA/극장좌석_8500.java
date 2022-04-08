import java.util.Arrays;
import java.util.Scanner;

public class 극장좌석_8500 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		for(int tc=1; tc<=t; tc++) {
			
			int N = sc.nextInt();
			
			int arr[] = new int[N];
			for(int i=0; i<N; i++) {
				arr[i] = sc.nextInt();
			}
			
			Arrays.sort(arr);
			
			int sum = N;
			
			for(int i=0; i<N; i++) {
				sum += arr[i];
			}
			
			sum += arr[N-1];
			
			System.out.println("#" + tc + " " + sum);
			
		}//tc
	}
}
