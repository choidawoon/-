import java.util.Scanner;

public class RGB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[][] map = new int[N][3];
		int min = Integer.MAX_VALUE;
		
		for(int i=0; i<N; i++) {
			map[i][0] = sc.nextInt();
			map[i][1] = sc.nextInt();
			map[i][2] = sc.nextInt();
		}
		
		for(int i=1; i<N; i++) {
			map[i][0] = Math.min(map[i-1][1] + map[i][0], map[i-1][2] + map[i][0]);
			map[i][1] = Math.min(map[i-1][0] + map[i][1], map[i-1][2] + map[i][1]);
			map[i][2] = Math.min(map[i-1][0] + map[i][2], map[i-1][1] + map[i][2]);
		}
		
		min = Math.min(map[N-1][0], map[N-1][1]);
		min = Math.min(min, map[N-1][2]);
		
		System.out.println(min);
	}

}
