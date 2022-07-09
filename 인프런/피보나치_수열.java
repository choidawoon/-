import java.util.Scanner;

public class 피보나치_수열 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int arr[] = new int[N+1];
		
		arr[0] = 0;
		arr[1] = 1;
		
		for(int i=2; i<=N; i++) {
			arr[i] = arr[i-2] + arr[i-1];
		}
		
		for(int i=1; i<=N; i++) {
			System.out.print(arr[i] + " ");
		}
		
	}
}
