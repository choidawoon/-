import java.util.Arrays;
import java.util.Scanner;

public class 단지번호붙이기_2667 {
	static int N;
	static int[][] map;
	static int danji = 2;
	static int[] cnt;
	static int count;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		map = new int[N][N];
		cnt = new int[N*N];
		
		for(int i=0; i<N; i++) {
			String str = sc.next();
			for(int j=0; j<N; j++) {
				map[i][j] = str.charAt(j) - '0';
			}
		}
		
		int tmp = 0;
		for(int i=0; i<N; i++) {
			for(int j=0; j<N; j++) {
				if(map[i][j]==1) {
					count = 0;
					dfs(i,j);
					danji++;
					cnt[tmp] = count;
					tmp++;
				}
			}
		}
		
		Arrays.sort(cnt);
		System.out.println(tmp);
		for(int i=0; i<tmp; i++) {
			System.out.println(cnt[i]);
		}
		
	}
	static void dfs(int row, int col) {
		map[row][col] = danji;
		count++;
		for(int i=0; i<4; i++) {
			int nr = row + dy[i];
			int nc = col + dx[i];
			
			if(nr<0 || nc<0 || nr>=N || nc>=N)
				continue;
			if(map[nr][nc]==1)
				dfs(nr,nc);
		}
		
	}
	static int[] dy = {-1,1,0,0};
	static int[] dx = {0,0,-1,1};
}
