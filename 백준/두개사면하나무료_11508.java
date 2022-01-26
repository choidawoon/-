import java.util.Arrays;
import java.util.Scanner;

public class 두개사면하나무료_11508 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	
		int N = sc.nextInt();
		int arr[] = new int[N];
		
		for(int i=0; i<N; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		long sum = 0;
		int idx = 1;
		
		for(int i=N-1; i>=0; i--) {
			if(idx%3!=0)
				sum = sum + arr[i];
			idx++;
		}
		System.out.println(sum);
	}
}
