import java.util.Scanner;

public class Main {
	static int row;
	static int col;
	static int[][] map;
	static int cnt;
	static int N;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		for(int tc=1; tc<=t; tc++) {
			
			col = sc.nextInt();
			row = sc.nextInt();
			N = sc.nextInt();
			map = new int[row][col];
			cnt = 0;
			
			for(int i=0; i<N; i++) {
				int a = sc.nextInt();
				int b = sc.nextInt();
				map[b][a] = 1;
			}
			
			for(int i=0; i<row; i++) {
				for(int j=0; j<col; j++) {
					if(map[i][j]==1) {
						dfs(i,j);
						cnt++;
					}
				}
			}
			
			System.out.println(cnt);
			
		}//tc
	}
	static void dfs(int r, int c) {
		
		for(int i=0; i<4; i++) {
			int nr = r + dy[i];
			int nc = c + dx[i];
			if(nr<0 || nc<0 || nr>=row || nc>=col)
				continue;
			if(map[nr][nc]==1) {
				map[nr][nc] = 0;
				dfs(nr,nc);
			}
		}
		
	}
	static int[] dy = {-1,1,0,0};
	static int[] dx = {0,0,-1,1};
}
