import java.util.Scanner;

public class 민석이의과제체크하기_5431 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		for(int tc=1; tc<=t; tc++) {
			
			int N = sc.nextInt();
			int M = sc.nextInt();
			
			int arr[] = new int[N];
			
			for(int i=0; i<N; i++) {
				arr[i] = i+1;
			}
			
			for(int i=0; i<M; i++) {
				int a = sc.nextInt();
				arr[a-1] = 0;
			}
			
			System.out.print("#" + tc + " ");
			for(int i=0; i<N; i++) {
				if(arr[i]!=0) {
					System.out.print(i+1 + " ");
				}
			}
			System.out.println();
		}//tc
	}
}
