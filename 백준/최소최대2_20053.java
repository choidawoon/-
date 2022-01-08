import java.util.Scanner;

public class 최소최대2_20053 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		for(int tc=1;tc<=t; tc++) {
			
			int N = sc.nextInt();
			int max = -1000000;
			int min = 1000000;
			int arr[] = new int[N];
			
			for(int i=0; i<N; i++) {
				arr[i] = sc.nextInt();
				max = Math.max(max, arr[i]);
				min = Math.min(min, arr[i]);
			}
			
			System.out.println(min + " " + max);
		
		}//tc
	}
}
