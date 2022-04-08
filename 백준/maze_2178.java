import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class maze {
	
	static int[][] map;
	static boolean[][] check;
	static int row;
	static int col;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		row = sc.nextInt();
		col = sc.nextInt();
		
		check = new boolean[row][col];
		map = new int[row][col];
		String str;
		for(int i=0; i<row; i++) {
			str = sc.next();
			for(int j=0; j<col; j++) {
				map[i][j] = str.charAt(j) -'0';
			}
		}
	
		bfs(0,0);
		
		System.out.println(map[row-1][col-1]);
	}
	
	static void bfs(int r, int c) {
		Queue<int[]> qu = new LinkedList<>();
		qu.offer(new int[] {r,c});
		check[r][c] = true;
		
		while(!qu.isEmpty()) {
			int loc[] = qu.poll();
			int cur_r = loc[0];
			int cur_c = loc[1];
			for(int i=0; i<4; i++) {
				int nr = cur_r + dy[i];
				int nc = cur_c + dx[i];
				
				if(nr<0 || nc<0 || nr>=row || nc>=col)
					continue;
				if(check[nr][nc] || map[nr][nc]==0)
					continue;
				
				map[nr][nc] = map[cur_r][cur_c] +1;
				check[nr][nc] = true;
				qu.add(new int[] {nr,nc});
			}
		}
	}
	static int[] dy = {-1,1,0,0};
	static int[] dx = {0,0,-1,1};
}
