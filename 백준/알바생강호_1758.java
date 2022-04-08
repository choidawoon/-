import java.util.Arrays;
import java.util.Scanner;

public class 알바생강호_1758 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int arr[] = new int[N];
		
		for(int i=0; i<N; i++) {
			arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr);
		int idx = 0;
		long sum = 0;
		for(int i=N-1; i>=0; i--) {
			if(arr[i]-idx>0) {
				sum = sum + (arr[i] - idx);
			}
			idx++;
		}
		System.out.println(sum);
	}
}
