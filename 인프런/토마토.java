import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 토마토 {
	static int row;
	static int col;
	static int map[][];
	static boolean visit[][];
	static int cnt = 0;
	static Queue<Point> qu  = new LinkedList<토마토.Point>();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		col = sc.nextInt();
		row = sc.nextInt();
		map = new int[row][col];
		visit = new boolean[row][col];
		
		for(int i=0; i<row; i++) {
			for(int j=0; j<col; j++) {
				map[i][j] = sc.nextInt();
				if(map[i][j]==1)
					qu.add(new Point(j,i));
			}
		}
		
		while(!qu.isEmpty()) {
			Point tmp = qu.poll();
			int r = tmp.y;
			int c = tmp.x;
			visit[r][c] = true;
			
			for(int i=0; i<4; i++) {
				int nx = tmp.x + dx[i];
				int ny = tmp.y + dy[i];
				
				if(nx<0 || ny<0 || nx>=col || ny>=row)
					continue;
				if(!visit[ny][nx] && map[ny][nx]==0) {
					qu.add(new Point(nx, ny));
					map[ny][nx] = map[r][c] + 1;
				}
				
			}
		}//while
		
		boolean check = false;
		int max = 0;
		
		for(int i=0; i<row ;i++) {
			for(int j=0; j<col; j++) {
				if(map[i][j]==0) {
					check = true;
					break;
				}
				max = Math.max(max, map[i][j]);
			}
		}
		
		if(check)
			System.out.println(-1);
		else
			System.out.println(max-1);
		
	}
	static class Point{
		int x,y;
		public Point(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}
	static int dy[] = {-1,1,0,0};
	static int dx[] = {0,0,-1,1};
}
