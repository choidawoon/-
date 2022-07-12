import java.util.Scanner;

public class 격자판_최대합 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int map[][] = new int[N][N];
		
		for(int i=0; i<N; i++) {
			for(int j=0; j<N; j++) {
				map[i][j] = sc.nextInt();
			}
		}
		
		int max = 0;
		int sum = 0;
		
		for(int i=0; i<N; i++) {
			sum = 0;
			for(int j=0; j<N; j++) {
				sum += map[i][j];
			}
			max = Math.max(max, sum);
			
			sum = 0;
			for(int k=0; k<N; k++) {
				sum += map[k][i];
			}
			max = Math.max(max, sum);
			
			sum = 0;
			for(int l=0; l<N; l++) {
				sum += map[l][l];
			}
			max = Math.max(max, sum);
			
			sum = 0;
			for(int m=0; m<N; m++) {
				sum += map[N-m-1][m];
			}
			max = Math.max(max, sum);
		}
		
		System.out.println(max);
	
	}
}
