import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class 카드놓기_5568 {
	static int N;
	static int M;
	static String arr[];
	static String result[];
	static boolean barr[];
	static Set<String> set;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		M = sc.nextInt();
		
		arr = new String[N];
		result = new String[N];
		barr = new boolean[N];
		set = new HashSet<>();
		
		for(int i=0; i<N; i++) {
			arr[i] = sc.next();
		}
		
		perm(0);
		System.out.println(set.size());
		
	}
	static void perm(int idx) {
		if(idx==M) {
			String str ="";
			for(int i=0; i<M; i++) {
				str = str+result[i];
			}
			set.add(str);
			return;
		}
		for (int i = 0; i < N; i++) {
			if (barr[i])
				continue;
			result[idx] = arr[i];
			barr[i] = true;
			perm(idx + 1);
			barr[i] = false;
		}
	}
}
