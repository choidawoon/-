import java.util.Scanner;

public class 임시반장 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	
		int N = sc.nextInt();
		int map[][] = new int[N+1][6];
		
		for(int i=1; i<=N; i++) {
			for(int j=1; j<=5; j++) {
				map[i][j] = sc.nextInt();
			}
		}
		
		int max = 0;
		int result = 0;
		for(int i=1; i<=N; i++) {
			int cnt = 0;
			for(int j=1; j<=N; j++) {
				for(int k=1; k<=5; k++) {
					if(map[i][k]==map[j][k]) {						
						cnt++;
						break;
					}
				}
			}
			if(max<cnt) {
				max = cnt;
				result = i;
			}
		}
		
		System.out.println(result);
		
	}
}
