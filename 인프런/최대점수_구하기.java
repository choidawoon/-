import java.util.Scanner;

public class 최대점수_구하기 {
	static int N;
	static int time;
	static int arr[][];
	static boolean barr[];
	static int result = 0;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		time = sc.nextInt();
		arr = new int[N][2];
		barr = new boolean[N];
		
		for(int i=0; i<N; i++) {
			arr[i][0] = sc.nextInt();
			arr[i][1] = sc.nextInt();
		}
		
		powerset(0);
		
		System.out.println(result);
		
	}
	static void powerset(int idx) {
		if(idx==N) {
			int score_sum = 0;
			int time_sum = 0;
			for(int i=0; i<N; i++) {
				if(barr[i]) {
					score_sum += arr[i][0];
					time_sum += arr[i][1];
				}
			}//for
			if(time_sum<=time)
				result = Math.max(result, score_sum);
			return;
		}//if
		
		barr[idx] = true;
		powerset(idx+1);
		barr[idx] = false;
		powerset(idx+1);
		
	}
}
