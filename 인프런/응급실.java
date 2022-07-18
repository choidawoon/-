import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 응급실 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		Queue<person> qu = new LinkedList<person>();
		int arr[] = new int[N];
		for(int i=0; i<N; i++)
			arr[i] = sc.nextInt();
		
		int result = 1;
		
		for(int i=0; i<N; i++)
			qu.add(new person(i, arr[i]));			
		
		while(!qu.isEmpty()) {
			
			person tmp = qu.poll();
			
			for(person x : qu) {
				if(x.priority>tmp.priority) {
					qu.add(tmp);
					tmp = null;
					break;
				}
			}
			
			if(tmp!=null) {
				if(tmp.id==M)
					break;
				else
					result++;
			}
			
		}//while
		
		System.out.println(result);
		
	}
}

class person{
	int id;
	int priority;
	public person(int id, int priority) {
		this.id = id;
		this.priority = priority;
	}
}
