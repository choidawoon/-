import java.util.Scanner;

public class 가위_바위_보 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int A[] = new int[N];
		int B[] = new int[N];
		
		for(int i=0; i<N; i++) {
			A[i] = sc.nextInt();			
		}
		for(int i=0; i<N; i++) {
			B[i] = sc.nextInt();
		}
		
		
		for(int i=0; i<N; i++) {
			
		if(A[i]==B[i])
			System.out.println("D");
		else if(A[i]==1 && B[i]==3)
			System.out.println("A");
		else if(B[i]==1 && A[i]==3)
			System.out.println("B");
		else if(A[i]>B[i])
			System.out.println("A");
		else if(B[i]>A[i])
			System.out.println("B");
		}
		
	}
}
