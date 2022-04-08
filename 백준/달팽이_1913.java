import java.util.Scanner;

public class 달팽이_1913 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int find = sc.nextInt();
		
		int result_r = 0;
		int result_c = 0;
		
		int[][] map = new int[N][N];
		
		StringBuilder sb = new StringBuilder();
		
		int input = N*N;
		int r = -1;
		int c = 0;
		int h = N;
		
		while(input>0) {
			for(int i=0; i<h; i++) {
				map[++r][c] = input;
				input--;
			}
			h--;
			
			for(int i=0; i<h; i++) {
				map[r][++c] = input;
				input--;
			}
			
			for(int i=0; i<h; i++) {
				map[--r][c] = input;
				input--;
			}
			h--;
			
			for(int i=0; i<h; i++) {
				map[r][--c] = input;
				input--;
			}
			
		}
		
		for(int i=0; i<N; i++) {
			for(int j=0; j<N; j++) {
				sb.append(map[i][j]	+ " ");
				if(map[i][j]==find) {
					result_r = i+1;
					result_c = j+1;
				}
			}
			sb.append("\n");
		}
		System.out.print(sb);
		System.out.println(result_r + " " + result_c);
	}

}
