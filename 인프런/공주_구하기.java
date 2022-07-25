import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 공주_구하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		Queue<Integer> qu = new LinkedList<Integer>();
		for(int i=1; i<=N; i++) {
			qu.add(i);
		}
		
		while(true) {
			
			for(int i=1; i<M; i++) {
				qu.add(qu.poll());
			}
			
			qu.poll();
			
			if(qu.size()==1)
				break;
			
		}
		 
		System.out.println(qu.poll());
		
	}
}
