import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 미로의_최단경로_통로 {
	static int[][] map, cnt;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		map = new int[7][7];
		cnt = new int[7][7];
		
		for(int i=0; i<7; i++)
			for(int j=0; j<7; j++)
				map[i][j] = sc.nextInt();
		
		BFS(0,0);
		
		if(cnt[6][6]==0)
			System.out.println(-1);
		else
			System.out.println(cnt[6][6]);
		
	}
	static void BFS(int row, int col) {
		
		Queue<Point> qu = new LinkedList<>();
		qu.offer(new Point(row, col));
		map[row][col] = 1;
		while(!qu.isEmpty()) {
			Point tmp = qu.poll();
			
			for(int i=0; i<4; i++) {
				int nx = tmp.x + dx[i];
				int ny = tmp.y + dy[i];
				
				if(nx<0 || ny<0 || nx>=7 || ny>=7)
					continue;
				
				if(map[ny][nx]==0) {
					map[ny][nx] = 1;
					cnt[ny][nx] = cnt[tmp.y][tmp.x] + 1;
					qu.add(new Point(nx, ny));
				}
		
			}
			
		}//while
		
	}
	
	static class Point{
		int x,y;
		Point(int x, int y){
			this.x=x;
			this.y=y;
		}
	}
	
	static int dy[] = {-1,1,0,0};
	static int dx[] = {0,0,-1,1};
	
}
