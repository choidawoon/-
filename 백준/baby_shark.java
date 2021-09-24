import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class baby_shark {
	static int row;
	static int col;
	static int[][] map;
	static int[][] dis;
	static boolean[][] check;
	static int max;
	static int cnt;
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		row = sc.nextInt();
		col = sc.nextInt();
		map = new int[row][col];
		dis = new int[row][col];
		
		for(int i=0; i<row; i++) {
			for(int j=0; j<col; j++) {
				map[i][j] = sc.nextInt();
			}
		}
		int temp = 0;
		for(int i=0; i<row; i++) {
			for(int j=0; j<col; j++) {
				if(map[i][j]==1) 
					continue;
				temp = bfs(i,j);
				max = Math.max(max, temp);
			}
		}
		System.out.println(max);
		// 상어위치 저장받고 map
	}
	static int bfs(int r, int c) {
		Queue<int[]> qu = new LinkedList<>();
		qu.add(new int[] {r,c,0});
		check[r][c] = true;
		cnt = 0;
		while(!qu.isEmpty()) {
			int now[] = qu.poll();
			int now_r = now[0];
			int now_c = now[1];
			int now_cnt = now[2];
			
			for(int i=0; i<8; i++) {
				int nr = now_r + dy[i];
				int nc = now_c + dx[i];
				if(nr<0 || nc<0 || nr>=row || nc>=col)
					continue;
				if(check[nr][nc])
					continue;
				if(map[nr][nc]==1) 
					return now_cnt+1;
				
				check[nr][nc] = true;
				qu.add(new int[] {nr,nc, now_cnt+1});
			}
		}
		return 0;
	}
	static int[] dy = {-1, -1, 0, 1, 1, 1, 0, -1};
	static int[] dx = {0, 1, 1, 1, 0, -1, -1, -1};
}
