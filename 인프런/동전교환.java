import java.util.Arrays;
import java.util.Scanner;

public class 동전교환 {
	static int N;
	static int arr[];
	static int destination;
	static int cnt = Integer.MAX_VALUE;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		arr = new int[N];
		for(int i=0; i<N; i++)
			arr[i] = sc.nextInt();
		destination = sc.nextInt();
		
		Arrays.sort(arr);
		
		DFS(0, arr, 0);
		
		System.out.println(cnt);
		
	}
	static void DFS(int idx, int arr[], int sum) {
		if(sum>destination)
			return;
		if(idx>cnt)
			return;
		if(sum==destination) {
			cnt = Math.min(idx, cnt);
		}
		for(int i=N-1; i>=0; i--) {
			DFS(idx+1, arr, sum+arr[i]);
		}
	}
}
