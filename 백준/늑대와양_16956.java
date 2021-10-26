import java.util.Scanner;

public class Main {
	static int row;
	static int col;
	static char[][]	map;
	static boolean[][] visit;
	static boolean check;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		row = sc.nextInt();
		col = sc.nextInt();
		map = new char[row][col];
		visit = new boolean[row][col];
		check = false;
		
		for(int i=0; i<row; i++) {
			String s = sc.next();
			for(int j=0; j<col; j++) {
				map[i][j] = s.charAt(j);
			}
		}
		for(int i=0; i<row; i++) {
			for(int j=0; j<col; j++){
				if(map[i][j]=='W')
					dfs(i,j);
			}
		}
		
		if(check)
			System.out.println(0);
		else {
			System.out.println(1);
			for(int i=0; i<row; i++) {
				for(int j=0; j<col; j++) {
					System.out.print(map[i][j]);
				}System.out.println();
			}
		}
	
	}
	static void dfs(int r, int c) {
		
		for(int i=0; i<4; i++) {
			int nr = r + dy[i];
			int nc = c + dx[i];
			
			if(nr<0 || nc<0 || nr>=row || nc>=col)
				continue;
			if(map[nr][nc]=='S')
				check = true;
			if(map[nr][nc]=='.') {
				map[nr][nc] =  'D';
			}
		}
		
	}
	static int[] dy = {-1, 1, 0, 0};
	static int[] dx = {0, 0, -1, 1};
}