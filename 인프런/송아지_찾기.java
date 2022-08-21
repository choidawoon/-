import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 송아지_찾기 {
	static int now;
	static int destination;
	static boolean visit[];
	static int move[] = {-1,1,5};
	static int result = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		now = sc.nextInt();
		destination = sc.nextInt();
		visit = new boolean[10001];
		int x = BFS(now);
		System.out.println(x);
	}
	static int BFS(int now) {
		int l = 0;
		visit[now] = true;
		Queue<Integer> qu = new LinkedList<Integer>();
		qu.offer(now);
		while(!qu.isEmpty()) {
			int len = qu.size();
			for(int i=0; i<len; i++) {
				int x = qu.poll();
				for(int j=0; j<3; j++) {
					int nx = x + move[j];
					if(nx==destination)
						return result+1;
					if(nx>=1 && nx<=10000 && !visit[nx]) {
						visit[nx] = true;
						qu.offer(nx);
					}
				}
			}
			result++;
		}//while
		return 1;
	}
}
