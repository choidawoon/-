import java.util.Scanner;

public class DNA_1969 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int len = sc.nextInt();
		
		String arr[] = new String[N];
		for(int i=0; i<N; i++) {
			arr[i] = sc.next();
		}
		
		char[] carr = new char[len];
		for(int i=0; i<len; i++) {
			int a = 0;
			int t = 0;
			int g = 0;
			int c = 0;
			int max = 0;
			for(int j=0; j<N; j++) {
				if(arr[j].charAt(i)=='A')
					a++;
				else if(arr[j].charAt(i)=='T')
					t++;
				else if(arr[j].charAt(i)=='G')
					g++;
				else if(arr[j].charAt(i)=='C')
					c++;
			}
			max = Math.max(max, Math.max(a, Math.max(t, Math.max(g, c))));
			if(max==a)
				carr[i] = 'A';
			else if(max==t)
				carr[i] = 'T';
			else if(max==g)
				carr[i] = 'G';
			else if(max==c)
				carr[i] = 'C';
		}
		
		for(int i=0; i<len; i++) {
			System.out.print(carr[i]);
		}
		
		int cnt = 0;
		
		for(int i=0; i<N; i++) {
			for(int j=0; j<len; j++) {
				if(arr[i].charAt(j)!=carr[j])
					cnt++;
			}
		}
		System.out.println();
		System.out.println(cnt);
	}
}
