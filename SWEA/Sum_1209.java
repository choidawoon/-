import java.util.Scanner;

public class Sum_1209 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		for(int tc=1; tc<=10; tc++) {
			
			int N = sc.nextInt();
			int map[][] = new int[100][100];
			
			for(int i=0; i<100; i++) {
				for(int j=0; j<100; j++) {
					map[i][j] = sc.nextInt();
				}
			}
			
			int max = 0;
			int sum = 0;
			
			for(int i=0; i<100; i++) {
				sum = 0;
				for(int j=0; j<100; j++) {
					sum += map[i][j];
				}
				max = Math.max(max, sum);
			}
			
			for(int i=0; i<100; i++) {
				sum = 0;
				for(int j=0; j<100; j++) {
					sum += map[j][i];
				}
				max = Math.max(sum, max);
			}
			
			sum = 0;
			for(int i=0; i<100; i++) {
				sum += map[i][i];
			}
			max = Math.max(sum, max);
			
			sum = 0;
			for(int i=0; i<100; i++) {
				sum += map[i][99-i];
			}
			max = Math.max(sum, max);
			
			System.out.println("#" + tc + " " + max);
		}//tc
	}
}
