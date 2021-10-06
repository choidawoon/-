import java.util.Scanner;

public class 등산로_1949 {
	static int N;
	static int K;
	static int[][] map;
	static boolean[][] visit;
	static int max_num;
	static int max;
	static int cnt;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		for(int tc=1; tc<=t; tc++) {
			
			N = sc.nextInt();
			K = sc.nextInt();
			
			map = new int[N][N];
			visit = new boolean[N][N];
			max = 0;
			max_num = 0;
			
			for(int i=0; i<N; i++) {
				for(int j=0; j<N; j++) {
					map[i][j] = sc.nextInt();
					max_num = Math.max(max_num, map[i][j]);
				}
			}
			
			for(int i=0; i<N; i++) {
				for(int j=0; j<N; j++) {
					if(map[i][j]==max_num) {
						dfs(i,j,1,false);
					}
				}
			}
			
			System.out.println("#" + tc + " " + max);
			
		}//tc
	}
	static void dfs(int r, int c, int cnt, boolean cut) {
			max = Math.max(max, cnt);
			visit[r][c] = true;
			
			for(int i=0; i<4; i++) {
				int nr = r + dy[i];
				int nc = c + dx[i];
					
				if(nr<0 || nc<0 || nr>=N || nc>=N)
					continue;
				if(visit[nr][nc])
					continue;
				if(map[nr][nc]<map[r][c]) {					
					dfs(nr,nc,cnt+1,cut);
			}
				else {
					if(!cut && map[nr][nc] - K < map[r][c]) {
						int tmp = map[nr][nc];
						map[nr][nc] = map[r][c]-1;
						dfs(nr,nc,cnt+1,true);
						map[nr][nc] = tmp;
					}
				}
		}
			visit[r][c] = false;
	}
	static int[] dy = {-1,1,0,0};
	static int[] dx = {0,0,-1,1};
}
