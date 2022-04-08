import java.util.Scanner;

public class two_dots_2 {
	static int row;
	static int col;
	static char[][] map;
	static boolean[][] visit;
	static int first_row;
	static int first_col;
	static boolean check;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		row = sc.nextInt(); // 열
		col = sc.nextInt(); // 행
		map = new char[row][col];
		visit = new boolean[row][col];

		for (int i = 0; i < row; i++) {
			String str = sc.next();
			for (int j = 0; j < col; j++) {
				map[i][j] = str.charAt(j);
			}
		}

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				visit = new boolean[row][col];
				first_row = i;
				first_col = j;
				if (dfs(i, j, 1)) {
					System.out.println("Yes");
					return;
				}
			}
		}
		System.out.println("No");
	}

	static boolean dfs(int r, int c, int cnt) {
		visit[r][c] = true;

		for (int i = 0; i < 4; i++) {
			int nr = r + dy[i];
			int nc = c + dx[i];

			if (nr < 0 || nc < 0 || nr >= row || nc >= col) // 범위 벗어나면 아웃
				continue;

			if (map[r][c] == map[nr][nc]) {// 문자가 같을때
				if (!visit[nr][nc]) {// 미방문일경우
					visit[nr][nc] = true;
					if (dfs(nr, nc, cnt + 1))
						return true;
				}

				else { // 방문을 했을경우
					if (cnt >= 4 && first_row == nr && first_col == nc)
						return true;
				}

			}
		}
		return false;
	}

	static int[] dy = { -1, 1, 0, 0 };
	static int[] dx = { 0, 0, -1, 1 };
}
