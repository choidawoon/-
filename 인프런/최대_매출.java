import java.util.Scanner;

public class 최대_매출 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		int arr[] = new int[N];
		
		for(int i=0; i<N; i++)
			arr[i] = sc.nextInt();
		
		int max = 0;
		int sum = 0;
		for(int i=0; i<M; i++)
			sum += arr[i];
		
		max = Math.max(max, sum);
		
		for(int i=M; i<N; i++) {
			sum = sum - arr[i-M] + arr[i];
			max = Math.max(max, sum);
		}
		
		System.out.println(max);
		
	}
}
