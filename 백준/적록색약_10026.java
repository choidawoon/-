import java.util.Scanner;

public class Main {
	static int N;
	static char[][] map_1;
	static char[][] map_2;
	static int result_1 = 0;
	static int result_2 = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		map_1 = new char[N][N];
		map_2 = new char[N][N];
		
		for (int i = 0; i < N; i++) {
			String str = sc.next();
			for (int j = 0; j < N; j++) {
				map_1[i][j] = str.charAt(j);
				map_2[i][j] = map_1[i][j];
				if (map_2[i][j] == 'R')
					map_2[i][j] = 'G';
			}
		}

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (map_1[i][j] == 'R' || map_1[i][j] == 'G' || map_1[i][j] == 'B') {
					dfs_1(i, j);
					result_1++;
				}
			}
		}

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (map_2[i][j] == 'G' || map_2[i][j] == 'B') {
					dfs_2(i, j);
					result_2++;
				}
			}
		}

		System.out.println(result_1 + " " + result_2);

	}

	static void dfs_1(int r, int c) {

		char a = map_1[r][c];
		map_1[r][c] = 'A';

		for (int i = 0; i < 4; i++) {

			int nr = r + dy[i];
			int nc = c + dx[i];

			if (nr < 0 || nc < 0 || nr >= N || nc >= N)
				continue;

			if (map_1[nr][nc] == a) {
				dfs_1(nr, nc);
			}

		}

	}

	static void dfs_2(int r, int c) {

		char a = map_2[r][c];
		map_2[r][c] = 'A';

		for (int i = 0; i < 4; i++) {

			int nr = r + dy[i];
			int nc = c + dx[i];

			if (nr < 0 || nc < 0 || nr >= N || nc >= N)
				continue;

			if (map_2[nr][nc] == a) {
				dfs_2(nr, nc);
			}

		}
		
	}

	static int[] dy = { -1, 1, 0, 0 };
	static int[] dx = { 0, 0, -1, 1 };
}