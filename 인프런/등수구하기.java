import java.util.Scanner;

public class 등수구하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int arr[] = new int[N];
		
		for(int i=0; i<N; i++)
			arr[i] = sc.nextInt();
		
		for(int i=0; i<N; i++) {
			int tmp = 1;
			for(int j=0; j<N; j++) {
				if(arr[i]<arr[j])
					tmp++;
			}
			System.out.print(tmp + " ");
		}
		
	}
}
