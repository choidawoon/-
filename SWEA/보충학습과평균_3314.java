import java.util.Scanner;

public class 보충학습과평균_3314 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		for(int tc=1; tc<=t; tc++) {
			
			int arr[] = new int[5];
			int sum = 0;
			for(int i=0; i<5; i++) {
				arr[i] = sc.nextInt();
				if(arr[i]<40) {
					arr[i] = 40;
				}
				sum += arr[i];
			}
			
			System.out.println("#" + tc + " " + sum/5);
			
		}//tc
	}
}
