import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


public class 보급로_1249 {
	static int N;
	static int[][] map;
	static int[][] result;
	
	static class Node{
		int row;
		int col;
		int min;
		
		public Node(int row, int col, int min) {
			super();
			this.row = row;
			this.col = col;
			this.min = min;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		for(int tc=1; tc<=t; tc++) {
			N = sc.nextInt();
			map = new int[N][N];
			result = new int[N][N];
			
			for(int i=0; i<N; i++) {
				String str = sc.next();
				for(int j=0; j<N; j++) {
					map[i][j] = str.charAt(j) - '0';
					result[i][j] = Integer.MAX_VALUE;
				}
			}
			
			result[0][0] = map[0][0];
			
			Queue<Node> qu = new LinkedList<>();
			qu.add(new Node(0,0,result[0][0]));
			
			while(!qu.isEmpty()) {
				Node node = qu.poll();
				int now_r = node.row;
				int now_c = node.col;
				
				for(int i=0; i<4; i++) {
					
					int nr = now_r + dy[i];
					int nc = now_c + dx[i];
					
					if(nr<0 || nc<0 || nr>=N || nc>=N)
						continue;
					
					if(result[nr][nc] > result[now_r][now_c] + map[nr][nc]) {
						result[nr][nc] = result[now_r][now_c] + map[nr][nc];
						qu.add(new Node(nr, nc, result[nr][nc]));
					}
				}
			}//while
			System.out.println("#" + tc + " " + result[N-1][N-1]);
		}//tc
	}
	static int[] dy = {-1,1,0,0};
	static int[] dx = {0,0,-1,1};
}
