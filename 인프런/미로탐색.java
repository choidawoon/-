import java.util.Scanner;

public class 미로탐색 {
	static int[][] map;
	static int cnt = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		map = new int[7][7];
		
		for(int i=0; i<7; i++)
			for(int j=0; j<7; j++)
				map[i][j] = sc.nextInt();
		
		dfs(0,0);
		
		System.out.println(cnt);
		
	}
	static void dfs(int row, int col) {
		
		if(row==6 && col==6) {
			cnt++;
			return;
		}
		
		for(int i=0; i<4; i++) {
			
			int nx = col + dx[i];
			int ny = row + dy[i];
			
			if(nx<0 || ny<0 || nx>=7 || ny>=7) 
				continue;
			
			if(map[ny][nx]==0) {
				map[row][col] = 1;
				dfs(ny, nx);
				map[row][col] = 0;
			}
			
		}
		
	}
	static int dy[] = {-1,1,0,0};
	static int dx[] = {0,0,-1,1};
}
