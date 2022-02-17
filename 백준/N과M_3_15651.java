import java.util.Scanner;

public class N°úM_3_15651 {

	static int N;
	static int M;
	static int[] arr;
	static int[] TF;
	static boolean[] barr;
	static int cnt;
	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();
		arr = new int[N];
		barr = new boolean[N];
		TF = new int[N];
		
		for (int i = 0; i < N; i++) {
			arr[i] = i + 1;
		}

		perm(0, 0);
		System.out.print(sb);
	}
	static void perm(int idx, int cnt) {
		if (cnt == M) {
			for (int i = 0; i < M; i++) {
				sb.append(TF[i] + " ");
			}
			sb.append("\n");
			return;
		}
		for (int i = 0; i < N; i++) {
			if (barr[i])
				continue;
			TF[idx] = arr[i];
			cnt++;
			perm(idx + 1, cnt);
			cnt--;
		}
	}
}
