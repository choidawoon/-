import java.util.Arrays;
import java.util.Scanner;

public class º≠∞≠±Ÿ¿∞∏«_20300 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		long arr[] = new long[N];
		
		for(int i=0; i<N; i++)
			arr[i] = sc.nextLong();
		
		Arrays.sort(arr);
		
		long max = 0;
		if(N%2==0) {
			for(int i=0; i<N/2; i++)
				max = Math.max(max, arr[i] +  arr[N-1-i]);
		}
		else {
			max = arr[N-1];
			for(int i=0; i<(N-1)/2; i++)
				max = Math.max(max, arr[i] + arr[N-2-i]);
		}
		
		System.out.println(max);
		
	}
}
