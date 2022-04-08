import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 젤다 {
	
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
//		@Override
//		public int compareTo(Node o) {
//			// TODO Auto-generated method stub
//			return this.min - o.min;
//		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int tc = 1;
		while(true) {
			int N = sc.nextInt();
			
			if(N==0)
				break;
			
			int map[][] = new int[N][N];
			int[][] result = new int[N][N];
			
			for(int i=0; i<N; i++) {
				for(int j=0; j<N; j++) {
					result[i][j] = Integer.MAX_VALUE;
				}
			}
			
			for(int i=0; i<N; i++) {
				for(int j=0; j<N; j++) {
					map[i][j] = sc.nextInt();
				}
			}
			
			result[0][0] = map[0][0];
			
			Queue<Node> pq = new LinkedList<>();
			pq.add(new Node(0,0,result[0][0]));
			
			while(!pq.isEmpty()) {
				Node node = pq.poll();
				
//				if(node.row==N-1 && node.col==N-1) {
//					System.out.println("Problem" + tc + ": " + node.min);
//					tc++;
//					break;
//				}
				int now_r = node.row;
				int now_c = node.col;
				
				for(int i=0; i<4; i++) {
					int nr = now_r + dy[i];
					int nc = now_c + dx[i];
					
					if(nr<0 || nc<0 || nr>=N || nc>=N)
						continue;
					
					if(result[nr][nc] > result[now_r][now_c] + map[nr][nc]) {
						result[nr][nc] = result[now_r][now_c] + map[nr][nc];
						pq.add(new Node(nr, nc, result[nr][nc]));
					}
				}
				
			}//while
			System.out.println("Problem " + tc + ": " + result[N-1][N-1]);
			tc++;

		}//while
	}
	
	static int[] dy = {-1,1,0,0};
	static int[] dx = {0,0,-1,1};

}
