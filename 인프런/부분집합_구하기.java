import java.util.Scanner;

public class 부분집합_구하기 {
	static int N;
	static int arr[];
	static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		arr = new int[N+1];
		
		dfs(1);
		
		System.out.println(sb);
	}
	static void dfs(int L) {
		if(L==N+1) {
			for(int i=1; i<=N; i++) {
				if(arr[i]==1)
					sb.append(i);
					sb.append(" ");
			}
			sb.append("\n");
		}
		
		else {
			arr[L] = 1;
			dfs(L+1);
			arr[L] = 0;
			dfs(L+1);
		}
		
	}
}
