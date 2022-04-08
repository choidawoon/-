import java.util.Scanner;

public class 치킨치킨치킨_16439 {
	static int N;
	static int M;
	static int[][] arr;
	static boolean[] check;
	static int max;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		M = sc.nextInt();
		
		arr = new int[N][M];
		check = new boolean[M];
		
		for(int i=0; i<N; i++) {
			for(int j=0; j<M; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		max = 0;
		comb(0,0);
		System.out.println(max);
		
	}
	static void comb(int start, int idx) {
		if(idx == 3) {
			int sum = 0;
			for(int i=0; i<N; i++) {
				int tmp = 0;
				for(int j=0; j<M; j++) {
					if(check[j]) {
						tmp = Math.max(tmp, arr[i][j]);
					}
				}
				sum += tmp;
			}
			max = Math.max(max, sum);
			return;
		}
		for(int i=start; i<M; i++) {
			if(check[i])
				continue;
			check[i] = true;
			comb(i, idx+1);
			check[i] = false;
		}
	}

}