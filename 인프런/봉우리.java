import java.util.Scanner;

public class 봉우리 {
	static int N;
	static int map[][];
	static int cnt = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		map = new int[N][N];
		for(int i=0; i<N; i++) {
			for(int j=0; j<N; j++) {
				map[i][j] = sc.nextInt();
			}
		}
		
		for(int i=0; i<N; i++) {
			for(int j=0; j<N; j++) {
				boolean check = true;
				for(int k=0; k<4; k++) {
					int ny = i+dy[k];
					int nx = j+dx[k];
					if(nx>=0 && ny>=0 && nx<N && ny<N && map[i][j]<=map[ny][nx]) {
							check = false;
					}
				}
				if(check)
					cnt++;
			}
		}
		
		System.out.println(cnt);
		
	}
	static int dy[] = {-1,1,0,0};
	static int dx[] = {0,0,-1,1};
}
