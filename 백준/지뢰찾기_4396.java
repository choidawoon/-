import java.util.Scanner;

public class 지뢰찾기_4396 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		char[][] map1 = new char[N][N];
		char[][] map2 = new char[N][N];
		int[][] result = new int[N][N];
		boolean[][] check = new boolean[N][N];
		boolean boom = false;
		
		for(int i=0; i<N; i++) {
			String str = sc.next();
			for(int j=0; j<N; j++) {
				map1[i][j] = str.charAt(j);
			}
		}
		
		for(int i=0; i<N; i++) {
			String str = sc.next();
			for(int j=0; j<N; j++) {
				map2[i][j] = str.charAt(j);
				if(map2[i][j]=='x') {
					if(map1[i][j]=='*') {
						boom = true;
					}
					else {
					int cnt = 0;
					check[i][j] = true;
					for(int k=0; k<8; k++) {
						int nr = i + dy[k];
						int nc = j + dx[k];
						if(nr>=0 && nc>=0 && nr<N && nc<N) {
							if(map1[nr][nc]=='*')
								cnt++;
							}
						}
					result[i][j] = cnt;
					}
				}
			}
		}
		
		if(boom) {
			for(int i=0; i<N; i++) {
				for(int j=0; j<N; j++) {
					if(map1[i][j]=='*')
						System.out.print(map1[i][j]);
					else if(check[i][j])
						System.out.print(result[i][j]);
					else
						System.out.print(map2[i][j]);
				}
				System.out.println();
			}
		}
		else {
			for(int i=0; i<N; i++) {
				for(int j=0; j<N; j++) {
					if(check[i][j]) 
						System.out.print(result[i][j]);
					else
						System.out.print(map2[i][j]);
				}
				System.out.println();
			}
		}
	}
	static int dy[] = {-1,-1,0,1,1,1,0,-1};
	static int dx[] = {0,1,1,1,0,-1,-1,-1};
}
