import java.util.Scanner;

public class 중복확인 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int arr[] = new int[10000001];
		boolean check = false;
		for(int i=0; i<N; i++) {
			int tmp = sc.nextInt();
			arr[tmp]++;
			if(arr[tmp]>=2) {
				check = true;
				break;
			}
		}
		
		if(check)
			System.out.println("D");
		else
			System.out.println("U");
		
	}
}
