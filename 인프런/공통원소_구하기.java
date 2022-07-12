import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class 공통원소_구하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Integer> list = new ArrayList<Integer>();
	
		int N = sc.nextInt();
		int A[] = new int[N];
		for(int i=0; i<N; i++)
			A[i] = sc.nextInt();
		
		int M = sc.nextInt();
		int B[] = new int[M];
		for(int i=0; i<M; i++) {
			B[i] = sc.nextInt();
		}

		Arrays.sort(A);
		Arrays.sort(B);
		
		int a = 0;
		int b = 0;
		
		while(a<N && b<M) {
			if(A[a]==B[b]) {
				list.add(A[a++]);
				b++;
			}
			else if(A[a]<B[b])
				a++;
			else
				b++;
		}
		
		for(int i=0; i<list.size(); i++)
			System.out.print(list.get(i) + " ");
		
	}
}
