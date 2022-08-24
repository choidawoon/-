import java.util.Scanner;

public class 섬나라_아일랜드 {
	static int N;
	static int map[][];
	static int cnt = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		map = new int[N][N];
		for(int i=0; i<N; i++) {
			for(int j=0; j<N; j++) {
				map[i][j] = sc.nextInt();
			}		
		}
		
		for(int i=0; i<N; i++) {
			for(int j=0; j<N; j++) {
				if(map[i][j]==1) {
					DFS(i,j);
					cnt++;
				}
			}
		}
		
		System.out.println(cnt);
		
	}
	static void DFS(int row, int col) {
		map[row][col] = 0;
		
		for(int i=0; i<8; i++) {
			int nr = row + dy[i];
			int nc = col + dx[i];
			
			if(nr<0 || nc<0 || nr>=N || nc>=N)
				continue;
			if(map[nr][nc]==0)
				continue;
			
				DFS(nr,nc);
		}
		
	}
	static int dy[] = {0,1,1,1,0,-1,-1,-1};
	static int dx[] = {-1,-1,0,1,1,1,0,-1};
}
