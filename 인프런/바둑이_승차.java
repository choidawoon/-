import java.util.Scanner;

public class 바둑이_승차 {
	static int limit;
	static int N;
	static int arr[];
	static boolean barr[];
	static int result = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		limit = sc.nextInt();
		N = sc.nextInt();
		arr = new int[N];
		barr = new boolean[N];
		for(int i=0; i<N; i++)
			arr[i] = sc.nextInt();
		
		powerset(0);
		
		System.out.println(result);
	}
	static void powerset(int idx) {
		if(idx==N) {
			
			int tmp = 0;
			
			for(int i=0; i<N; i++) {
				if(barr[i])
					tmp+=arr[i];
			}
			
			if(tmp<=limit)
				result = Math.max(result, tmp);
			
			return;
		}
		
		barr[idx] = true;
		powerset(idx+1);
		barr[idx] = false;
		powerset(idx+1);
		
	}
}
