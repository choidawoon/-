import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 요세푸스_11866 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		Queue<Integer> qu = new LinkedList<Integer>();
		
		for(int i=0; i<N; i++) {
			qu.add(i+1);
		}
		
		System.out.print("<");
		
		while(!qu.isEmpty()) {
			
			for(int i=0; i<M-1; i++) {
				qu.add(qu.poll());
			}
			System.out.print(qu.poll());
			
			if(!qu.isEmpty()) {
				System.out.print(", ");
			}
		}
		
		System.out.print(">");
	
	}
}
