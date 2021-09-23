import java.util.Scanner;

public class normal_backpack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int W = sc.nextInt();
		
		int[] weights = new int[N+1];
		int[] profits = new int[N+1];
		
		for(int i=1; i<=N; i++) {
			weights[i] = sc.nextInt();
			profits[i] = sc.nextInt();
		}
		
		int[][] map = new int[N+1][W+1];
		
//		map
//			W	0	1	2	3	4	5	6	7
//		N
//		0		0	0	0	0	0	0	0	0
//		1		0	0	0	0	0	0	13	13
//		2		0	0	0	0	8	8	13	13
//		3		0	0	0	6	8	8	13	14
//		4		0	0	0	6	8	12	13	14
		
		for(int i=1; i<=N; i++) {
			for(int w=1; w<=W; w++) {
				if(weights[i]<=w) {
					map[i][w] = Math.max(map[i-1][w], profits[i] + map[i-1][w-weights[i]]);
				}
				else {
					map[i][w] = map[i-1][w];
				}
			}
		}
		
		System.out.println(map[N][W]);
		
	}
}
