import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 상근이의여행_9372 {
	static int country;
	static int flight;
	static boolean[][] go;
	static int cnt;
	static boolean[] visit;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		for(int tc=1; tc<=t; tc++) {
			
			country = sc.nextInt();
			flight = sc.nextInt();
			go = new boolean[country+1][country+1];
			visit = new boolean[country+1];
			cnt = 0;
			
			for(int i=0; i<flight; i++) {
				int a = sc.nextInt();
				int b = sc.nextInt();
				go[a][b] = true;
				go[b][a] = true;
			}
			search();
			System.out.println(cnt-1);
		}
	}
	static void search() {
		Queue<Integer> qu = new LinkedList<Integer>();
		qu.offer(1);
		while(!qu.isEmpty()) {
			int front = qu.poll();
			for(int i=1; i<=country; i++) {
				if(go[front][i] && !visit[i]) {
					visit[i] = true;
					cnt++;
					qu.offer(i);
				}
			}
		}
	}
}
