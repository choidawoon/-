import java.util.Scanner;

public class 최대공약수와최소공배수_2609 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		int x = 1;
		int y = 1;
		
		for(int i=1; i<=Math.max(N, M); i++	) {
			if(N%i==0 && M%i==0)
				x = i;
		}
		
		int a = N/x;
		int b = M/x;
		y = a*b*x;
		
		System.out.println(x);
		System.out.println(y);
	}

}
