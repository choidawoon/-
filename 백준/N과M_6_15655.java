import java.util.Arrays;
import java.util.Scanner;

public class N°úM_6_15655 {
	
	static int N;
	static int M;
	static int result[];
	static StringBuilder sb = new StringBuilder();
	static int arr[];
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();
		result = new int[N];
		arr = new int[N];
		
		for(int i=0; i<N; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);

		comb(0,0);
		System.out.println(sb);
	}
	
	static void comb(int idx, int start) {
		if(idx == M) {
			for(int i=0; i<M; i++) {
				sb.append(result[i] + " ");
			}
			sb.append("\n");
			return;
		}
		
		for(int i=start; i<N; i++) {
			result[idx] = arr[i];
			comb(idx+1, i+1);
		}
		
	}
}