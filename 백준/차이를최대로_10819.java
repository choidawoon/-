import java.util.Scanner;

public class 차이를최대로_10819 {
	static int N;
	static int[] arr;
	static boolean[] barr;
	static int[] result;
	static int[] result2;
	static int max;
	static int sum;
	static int diff;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		arr = new int[N];
		barr = new boolean[N];
		result = new int[N];
		
		for(int i=0; i<N; i++) {
			arr[i] = sc.nextInt();
		}
		perm(0);
		System.out.println(max);
	}
	static void perm(int idx) {
		if(idx==N) {
			diff = 0;
			for(int i=0; i<N-1; i++) {
				diff += Math.abs(result[i] - result[i+1]);
			}
			max = Math.max(max, diff);
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
