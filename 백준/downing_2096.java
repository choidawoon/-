import java.util.Scanner;

public class downing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[][] map = new int[N][3];
		int[][] map2 = new int[N][3];
		int max = 0;
		int min = Integer.MAX_VALUE;
		
		for(int i=0; i<N; i++) {
			map[i][0] = sc.nextInt();
			map2[i][0] = map[i][0];
			
			map[i][1] = sc.nextInt();
			map2[i][1] = map[i][1];
			
			map[i][2] = sc.nextInt();
			map2[i][2] = map[i][2];
		}
		
		for(int i=1; i<N; i++) {
			map[i][0] = Math.max(map[i-1][0] + map[i][0], map[i-1][1] + map[i][0]);
			int temp = Math.max(map[i-1][0] + map[i][1], map[i-1][1] + map[i][1]);
			map[i][1] = Math.max(temp, map[i-1][2] + map[i][1]);
			map[i][2] = Math.max(map[i-1][1] + map[i][2], map[i-1][2] + map[i][2]);
		}
		
		max = Math.max(map[N-1][0], map[N-1][1]);
		max = Math.max(max, map[N-1][2]);
		
		for(int i=1; i<N; i++) {
			map2[i][0] = Math.min(map2[i-1][0] + map2[i][0], map2[i-1][1] + map2[i][0]);
			int temp2 = Math.min(map2[i-1][0] + map2[i][1], map2[i-1][1] + map2[i][1]);
			map2[i][1] = Math.min(temp2, map2[i-1][2] + map2[i][1]);
			map2[i][2] = Math.min(map2[i-1][1] + map2[i][2], map2[i-1][2] + map2[i][2]);
		}
		
		min = Math.min(map2[N-1][0], map2[N-1][1]);
		min = Math.min(min, map2[N-1][2]);
		
		System.out.println(max + " " + min);
	}

}
