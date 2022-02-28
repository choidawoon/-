import java.util.Scanner;

public class N°úM_4_15652 {

	static int result[];
	static int N;
	static int M;
	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();
		result = new int[N];

		comb(0, 0);
		System.out.println(sb);
	}

	static void comb(int idx, int start) {
		if (idx == M) {
			for (int i = 0; i < M; i++) {
				sb.append(result[i] + " ");
			}
			sb.append("\n");
			return;
		}
		for (int i = start; i < N; i++) {
			result[idx] = i + 1;
			comb(idx + 1, i);
		}
	}

}
