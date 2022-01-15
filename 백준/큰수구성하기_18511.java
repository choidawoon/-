import java.util.Arrays;
import java.util.Scanner;

public class 큰수구성하기_18511 {
	static int N;
	static int M;
	static int arr[];
	static int result = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		M = sc.nextInt();
		arr = new int[M];
		
		for(int i=0; i<M; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		sol(0);
		System.out.println(result);
		
	}
	static void sol(int idx) {
		if(idx>N)
			return;
		if(idx>result)
			result = idx;
		for(int i=M-1; i>=0; i--)
			sol(idx*10+arr[i]);
	}
}
