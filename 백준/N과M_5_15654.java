import java.util.Arrays;
import java.util.Scanner;

public class N°úM_5_15654 {
	static int N;
	static int M;
	static int arr[];
	static int TF[];
	static boolean barr[];
	static StringBuilder sb;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		M = sc.nextInt();
		arr = new int[N];
		TF = new int[N];
		barr = new boolean[N];
		sb = new StringBuilder();
				
		for(int i=0; i<N; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		
		perm(0);
		
		System.out.println(sb);
	}
	static void perm(int idx) {
		if(idx==M) {
			for(int i=0; i<M; i++) {
				sb.append(TF[i] + " ");
			}
			sb.append("\n");
			return;
		}
		for(int i=0; i<N; i++) {
			if(barr[i])
				continue;
			TF[idx] = arr[i];
			barr[i] = true;
			perm(idx+1);
			barr[i] = false;
		}
	}
}
