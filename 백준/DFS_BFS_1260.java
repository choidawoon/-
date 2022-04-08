import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class DFS_BFS_1260 {
	static int N;
	static int M;
	static int start;
	static int[][] V;
	static boolean[] visit;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		M = sc.nextInt();
		start = sc.nextInt();
		
		V = new int[N+1][N+1];
		visit = new boolean[N+1];
		for(int i=0; i<M; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			V[a][b] = 1;
			V[b][a] = 1;
		}
		
		dfs(start);
		System.out.println();
		bfs(start);
	}
	static void dfs(int start) {
		System.out.print(start + " ");
		visit[start] = true;
		for(int i=1; i<=N; i++) {
			if(!visit[i] && V[start][i]==1) {
				dfs(i);
			}
		}
		
	}
	
	static void bfs(int start) {
		Queue<Integer> qu = new LinkedList<>();
		visit = new boolean[N+1];
		visit[start] = true;
		qu.add(start);
		
		while(!qu.isEmpty()) {
			int a = qu.poll();
			System.out.print(a + " ");
			for(int i=1; i<=N; i++) {
				if(!visit[i] && V[a][i]==1) {
					qu.add(i);
					visit[i] = true;
				}
			}
		}
	}
}
