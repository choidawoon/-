import java.util.Scanner;

public class 합이_같은_부분집합 {
	static int N;
	static int[] arr;
	static boolean[] barr;
	static boolean check;
	static String str = "NO";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		arr = new int[N];
		barr = new boolean[N];
		for(int i=0; i<N; i++)
			arr[i] = sc.nextInt();
		
		powerset(0);
		System.out.println(str);
		
	}
	static void powerset(int idx) {
		if(idx==N) {
			int sum_A = 0;
			int sum_B = 0;
			for(int i=0; i<N; i++) {
				if(barr[i]) {					
					sum_A+=arr[i];
				}
				else {
					sum_B+=arr[i];
				}
			}
			if(sum_A==sum_B)
				str = "YES";
			return;
		}
		barr[idx] = true;
		powerset(idx+1);
		barr[idx] = false;
		powerset(idx+1);
	}
}
