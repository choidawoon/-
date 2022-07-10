import java.util.Scanner;

public class 점수계산 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int arr[] = new int[N];
		int score = 0;
		
		for(int i=0; i<N; i++)
			arr[i] = sc.nextInt();
		
		int idx = 1;
		for(int i=0; i<N; i++) {
			if(arr[i]==1) {
				score+=idx;
				idx++;
			}
			else
				idx = 1;
		}
		
		System.out.println(score);
	
	}
}
