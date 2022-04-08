import java.util.Scanner;

public class Main {
	static int N;
	static int V;
	static int map[][];
	static boolean[] visit;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		V = sc.nextInt();
		map = new int[N+1][N+1];
		visit  = new boolean[N+1];
		
		for(int i=0; i<V; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			map[a][b] = 1;
			map[b][a] = 1;
		}
		
//			1	2	3	4	5	6
//		1	0	1	0	0	1	0
//		2	1	0	0	0	1	0	
//		3	0	0	0	1	0	0
//		4	0	0	1	0	0	1
//		5	1	1	0	0	0	0
//		6	0	0	0	1	0	0
		
		
		int cnt = 0;
		for(int i=1; i<=N; i++) {
				if(!visit[i]) {
					dfs(i);
					cnt++;
				}
		}
		
		System.out.println(cnt);
		
	}
	static void dfs(int start) {
		visit[start] = true;
		
		for(int i=1; i<=N; i++) {
			if(map[start][i]==1 && !visit[i]) {
				dfs(i);
			}
		}
	}
}