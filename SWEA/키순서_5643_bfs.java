import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 키순서_5643_bfs {
	static int N;
	static int M;
	static int[][] map;
	static int result;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		for(int tc=1; tc<=t; tc++) {
			
			N = sc.nextInt();
			M = sc.nextInt();
			map = new int[N+1][N+1];
			
			for(int i=0; i<M; i++) {
				int a = sc.nextInt();
				int b = sc.nextInt();
				
				map[a][b] = 1;
			}
			
			result = 0;
			for(int i=1; i<=N; i++) {
				if(bfs_1(i) + bfs_2(i)==N-1)
					result++;
			}
			
			System.out.println("#" + tc + " " + result);
			
		}//tc
	}
	
	static int bfs_1(int start) {
		Queue<Integer> qu = new LinkedList<>();
		boolean[] visit = new boolean[N+1];
		
		qu.add(start);
		visit[start] = true;
		
		int cnt = 0;
		while(!qu.isEmpty()) {
			int now = qu.poll();
			
			for(int i=1; i<=N; i++) {
				if(!visit[i] && map[now][i] == 1) {
					qu.add(i);
					visit[i] = true;
					cnt++;
				}
			}
		}
		return cnt;
	}
	
	static int bfs_2(int start) {
		Queue<Integer> qu = new LinkedList<>();
		boolean[] visit = new boolean[N+1];
		
		qu.add(start);
		visit[start] = true;
		
		int cnt = 0;
		while(!qu.isEmpty()) {
			int now = qu.poll();
			
			for(int i=1; i<=N; i++) {
				if(!visit[i] && map[i][now] == 1) {
					qu.add(i);
					visit[i] = true;
					cnt++;
				}
			}
		}
		return cnt;
	}

}
