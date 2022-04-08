import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Queue<Integer> queue	= new LinkedList<>();
		
		
		for(int i=1; i<=n; i++) {
			queue.add(i);
		}
		

		
		while(queue.size()>1) {
			queue.remove();
			queue.offer(queue.poll());
		
		}
		
		System.out.println(queue.poll());
		
	}

}