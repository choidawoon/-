import java.util.Arrays;
import java.util.Scanner;

public class ATM_11399 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int arr[] = new int[N];
		int sum = 0;
		
		for(int i=0; i<N; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		
		for(int i=0; i<N; i++) {
			sum += arr[i]*(N-i);
		}
		System.out.println(sum);
	}
}
