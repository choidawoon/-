import java.util.Scanner;

public class 뒤집은_소수 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int arr[] = new int[N];
		int max = 0;
		
		for(int i=0; i<N; i++) {
			
			String s = sc.next();
			char carr[] = s.toCharArray();
			StringBuilder sb = new StringBuilder();
			for(int j=s.length()-1; j>=0; j--) {
				sb.append(carr[j]);
			}
			
			arr[i] = Integer.parseInt(sb.toString());
			int cnt = 0;
			for(int j=2; j<=arr[i]; j++) {
				if(arr[i]%j==0)
					cnt++;
				if(cnt>2)
					break;
			}
			if(cnt==1)
				System.out.print(arr[i] + " ");
		}
		
	}
}
