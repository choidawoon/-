import java.util.ArrayList;
import java.util.Scanner;

public class 덩치_7568 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[][] person = new int[N][2];
		
		for(int i=0; i<N; i++) {
			person[i][0] = sc.nextInt();
			person[i][1] = sc.nextInt();
		}
		
		int rank = 1;
		
		for(int i=0; i<N; i++) {
			rank = 1;
			for(int j=0; j<N; j++) {
				if(person[i][0] < person[j][0] && person[i][1] < person[j][1]) {
					rank++;
				}
			}
			System.out.print(rank + " ");
		}
		
	}
}
