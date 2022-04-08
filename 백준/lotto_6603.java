import java.util.Arrays;
import java.util.Scanner;

public class lotto_6603 {

	static int[] arr;
	static int[] result;
	static int n;
	static boolean check;
	static StringBuilder sb;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			n = sc.nextInt();
			if(n==0)
				check=true;
			
			if(check)
				break;
			
			arr = new int[n];
			result = new int[n];
			
			for(int i=0; i<n; i++) {
				arr[i] = sc.nextInt();
			}
			
			Arrays.sort(arr);
			sb = new StringBuilder();
			
			comb(0,0);
			System.out.println(sb);
			
		}//while
		
	}
	
	static void comb(int idx, int start) {
		if(idx==6) {
			for(int i=0; i<6; i++) {
				sb.append(result[i] + " ");
			}
			sb.append("\n");
			return;
		}
		for(int i=start; i<n; i++) {
			result[idx]	= arr[i];
			comb(idx+1, i+1);
		}
	}

}
