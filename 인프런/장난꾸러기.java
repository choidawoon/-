import java.util.Arrays;
import java.util.Scanner;

public class 장난꾸러기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int arr[] = new int[N];
		int stanard[] = new int[N];
	
		for(int i=0; i<N; i++) {
			arr[i] = sc.nextInt();
			stanard[i] = arr[i];
		}
		
		Arrays.sort(stanard);
		
		int a = 0;
		int b = 0;
		
		boolean check= false;
		
		for(int i=0; i<N; i++) {
			if(!check && arr[i]!=stanard[i]) {
				a = i+1;
				check = true;
			}
			if(check && arr[i]!=stanard[i])
				b = i+1;
		}
		
		System.out.println(a + " " + b);
		
	}
}
