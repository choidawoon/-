import java.util.Scanner;

public class N°úM_2_15650 {
	static int N;
	static int M;
	static int arr[];
	static int TF[];
	static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		M = sc.nextInt();
		arr = new int[N];
		TF = new int[N];
		
		for(int i=0; i<N; i++) {
			arr[i] = i+1;
		}
		
		comb(0,0);
		System.out.println(sb);
		
	}
	static void comb(int idx, int start) {
		if(idx==M) {
			for(int i=0; i<M; i++) {
				sb.append(TF[i] + " ");
			}
			sb.append("\n");
		}
		for(int i=start; i<N; i++) {
			TF[idx] = arr[i];
			comb(idx+1, i+1);
		}
	}
}
