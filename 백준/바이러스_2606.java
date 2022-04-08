import java.util.Scanner;

public class 바이러스_2606 {
	static int N;
	static int M;
	static int[][] rel;
	static int cnt = 0;
	static int max = 0;
	static boolean[] visit;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		M = sc.nextInt();
		rel = new int[N+1][N+1];
		visit = new boolean[N+1];
		
		for(int i=0; i<M; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			rel[a][b] = 1;
			rel[b][a] = 1;
		}
		
		for(int i=1; i<=N; i++) {
			cnt = 0;
			dfs(i);
			max = Math.max(cnt, max);
		}
		
		System.out.println(max);
		
	}
	static void dfs(int start) {
		visit[start] = true;
		for(int i=1; i<=N; i++) {
			if(!visit[i] && rel[start][i]==1) {
				dfs(i);
				cnt++;
			}
		}
	}

}
