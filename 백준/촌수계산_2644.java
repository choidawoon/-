mport java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	static int n;
	static int start;
	static int des;
	static int[][] map;
	static int[] check;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		map = new int[n][n];
		check = new int[n];

		start = sc.nextInt() - 1;
		des = sc.nextInt() - 1;

		int rel_cnt = sc.nextInt();
		for (int i = 0; i < rel_cnt; i++) {
			int a = sc.nextInt() - 1;
			int b = sc.nextInt() - 1;
			map[a][b] = 1;
			map[b][a] = 1;
		}

		bfs(start, des);

		if (check[des] == 0)
			System.out.println(-1);
		else
			System.out.println(check[des]);

	}

	static void bfs(int start, int des) {
		Queue<Integer> qu = new LinkedList<Integer>();
		qu.offer(start);

		while (!qu.isEmpty()) {
			int cur = qu.poll();
			if (cur == des)
				break;
			for (int i = 0; i < n; i++) {
				if (map[cur][i] == 1 && check[i] == 0) {
					check[i] = check[cur] + 1;
					qu.offer(i);
				}
			}
		} // while

	}
}