import java.util.Scanner;

public class 이차원배열의합_2167 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		int[][] map = new int[N+1][M+1];
		
		for(int i=1; i<=N; i++) {
			for(int j=1; j<=M; j++) {
				map[i][j] = sc.nextInt();
			}
		}
		
		int cnt = sc.nextInt();
		for(int i=0; i<cnt; i++) {
			int row1 = sc.nextInt();
			int col1 = sc.nextInt();
			int row2 = sc.nextInt();
			int col2 = sc.nextInt();
			
			int sum = 0;
			for(int j=row1; j<=row2; j++) {
				for(int k=col1; k<=col2; k++) {
					sum += map[j][k];
				}
			}
			System.out.println(sum);
		}
		
		
	}
}
