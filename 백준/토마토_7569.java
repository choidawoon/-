import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 토마토_7569 {
	static int row;
	static int col;
	static int height;
	static int[][][] map;
	static int max;
	
	static class Node{
		
		int h;
		int r;
		int c;
		
		public Node(int h, int r, int c) {
			super();
			this.h = h;
			this.r = r;
			this.c = c;
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		col = sc.nextInt();
		row = sc.nextInt();
		height = sc.nextInt();
		
		map = new int[height][row][col];
		
		
		Queue<Node> qu = new LinkedList<>();
		
		for(int i=0; i<height; i++) {
			for(int j=0; j<row; j++) {
				for(int k=0; k<col; k++) {
					map[i][j][k] = sc.nextInt();
					if(map[i][j][k]==1) {
						qu.add(new Node(i,j,k));
					}
				}
			}
		}
		
		while(!qu.isEmpty()) {
			Node now = qu.poll();
			int now_h = now.h;
			int now_r = now.r;
			int now_c = now.c;
			
			for(int i=0; i<6; i++) {
				
				int nh = now_h + dh[i];
				int nr = now_r + dy[i];
				int nc = now_c + dx[i];
				
				if(nh<0 || nr<0 || nc<0 || nh>=height || nr>=row || nc>=col)
					continue;
				
				if(map[nh][nr][nc]==0) {
					map[nh][nr][nc] =  map[now_h][now_r][now_c] + 1;
					qu.add(new Node(nh,nr,nc));
				}
				
			}
		}//while
		
		boolean check = false;
		
		for(int i=0; i<height; i++) {
			for(int j=0; j<row; j++) {
				for(int k=0; k<col; k++) {
					if(map[i][j][k]==0)
						check = true;
					max = Math.max(max, map[i][j][k]);
				}
			}
		}
		
		if(check)
			System.out.println(-1);
		else
			System.out.println(max-1);
		
	}
	static int[] dh = {-1,1,0,0,0,0};
	static int[] dy = {0,0,-1,1,0,0};
	static int[] dx = {0,0,0,0,-1,1};
}
