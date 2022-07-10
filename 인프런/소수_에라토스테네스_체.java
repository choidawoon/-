import java.util.Scanner;

public class 소수_에라토스테네스_체 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int arr[] = new int[N+1];
		int cnt = 0;
		
		for(int i=2; i<=N; i++) {
			if(arr[i]==0)
				cnt++;
			for(int j=i; j<=N; j=j+i)
				arr[j]=1;
		}
		
		System.out.println(cnt);
		
	}
}
