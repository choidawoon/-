import java.util.Scanner;

public class °ø¾à¼ö_5618 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int arr[] = new int[N];
		int max = 0;
		
		for(int i=0; i<N; i++) {
			arr[i] = sc.nextInt();
			max = Math.max(max, arr[i]);
		}
		
		int idx = 1;
		while(idx<=max) {
			boolean check = true;
			for(int i=0; i<N; i++) {
				if(arr[i]%idx!=0) {
					check = false;
				}
			}
			
			if(check)
				System.out.println(idx);
			
			idx++;
		}
		
	}

}
