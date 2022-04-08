import java.util.Scanner;

public class 평균은넘겠지_4344 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		for(int tc=1; tc<=t; tc++) {
			
			int N = sc.nextInt();
			int arr[] = new int[N];
			double sum = 0;
			double avg = 0;
			
			for(int i=0; i<N; i++) {
				arr[i] = sc.nextInt();
				sum += arr[i];
			}
			
			avg = sum/N;
			
			double cnt = 0 ;
			for(int i=0; i<N; i++) {
				if(arr[i] > avg)
					cnt++;
			}
			
			System.out.printf("%.3f%%\n",(cnt/N)*100);
		}
	}

}
