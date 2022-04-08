import java.util.Scanner;

public class 부분수열의합_1182 {
	static int[] arr;
	static int[] result;
	static int N;
	static int M;
	static int cnt;
	static int want;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		want = sc.nextInt();
		arr = new int[N];
		for(int i=0; i<N; i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int i=1; i<=N; i++) {
			result = new int[i];
			M = i;
			comb(0,0);
		}
		System.out.println(cnt);
	}
	static void comb(int idx, int start) {
		if(idx==M) {
			int sum = 0;
			for(int i=0; i<M; i++) {
				sum += result[i];
			}
			if(sum==want)
				cnt++;
			return;
		}
		for (int i = start; i < N; i++) {
			result[idx] = arr[i];
			comb(idx + 1, i+1);
		}
	}

}
