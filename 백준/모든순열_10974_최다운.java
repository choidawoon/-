import java.util.Scanner;

public class 모든순열_10974_최다운 {
	static int N;
	static int[] arr;
	static boolean[] barr;
	static int[] result;
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		arr = new int[N];
		barr = new boolean[N];
		result = new int[N];
		
		for(int i=0; i<N; i++) {
			arr[i] = i+1;
		}
		
		perm(0);
		System.out.println(sb);
		
	}
	static void perm(int idx) {
		if(idx == N) {
			for(int i=0; i<N; i++) {
				sb.append(result[i] + " ");
			}
			sb.append("\n");
			return;
		}
		for(int i=0; i<N; i++) {
			if(barr[i])
				continue;
			result[idx] = arr[i];
			barr[i] = true;
			perm(idx+1);
			barr[i] = false;
		}
	}
}
