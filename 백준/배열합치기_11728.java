import java.util.Arrays;
import java.util.Scanner;

public class 배열합치기_11728 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		StringBuilder sb = new StringBuilder();
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		int arr1[] = new int[N];
		int arr2[] = new int[M];
		int arr3[] = new int[N+M];
		
		for(int i=0; i<N; i++) {
			arr1[i] = sc.nextInt();
		}
		
		for(int i=0; i<M; i++)
			arr2[i] = sc.nextInt();
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		for(int i=0; i<N; i++) {
			arr3[i] = arr1[i];
		}
		for(int i=N; i<N+M; i++) {
			arr3[i] = arr2[i-N];
		}
		
		Arrays.sort(arr3);
		for(int i=0; i<N+M; i++) {
			sb.append(arr3[i] + " ");
		}
		
		System.out.println(sb);
	
	}
}
