import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class tomato {
	static int row;
	static int col;
	static int[][] map;
	static boolean[][] visit;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		col = sc.nextInt();
		row = sc.nextInt();

		map = new int[row][col];
		visit = new boolean[row][col];

		Queue<int[]> qu = new LinkedList<>();

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				map[i][j] = sc.nextInt();
				if (map[i][j] == 1)
					qu.add(new int[] { i, j });
			}
		}

		while (!qu.isEmpty()) {
			int[] now = qu.poll();
			int r = now[0];
			int c = now[1];
			visit[r][c] = true;

			for (int i = 0; i < 4; i++) {
				int nr = r + dy[i];
				int nc = c + dx[i];

				if (nr < 0 || nc < 0 || nr >= row || nc >= col)
					continue;
				if (visit[nr][nc])
					continue;
				if (map[nr][nc] == 0) {
					qu.add(new int[] { nr, nc });
					map[nr][nc] = map[r][c] + 1;
				}
			}
		}

		boolean check = false;
		int max = 0;

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				if (map[i][j] == 0)
					check = true;
				max = Math.max(max, map[i][j]);
			}
		}

		if (check)
			System.out.println(-1);
		else
			System.out.println(max - 1);

	}
	static int[] dy = { -1, 1, 0, 0 };
	static int[] dx = { 0, 0, -1, 1 };
}
