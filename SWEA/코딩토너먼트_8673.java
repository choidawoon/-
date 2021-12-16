import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 코딩토너먼트_8673 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		for(int tc=1; tc<=T; tc++) {
			int diff = 0;
			
			int N = sc.nextInt();
			int X = (int) Math.pow(2, N);
			
			Queue<Integer> qu = new LinkedList<Integer>();
			for(int i=0; i<X; i++) {
				int a = sc.nextInt();
				qu.add(a);
			}
			while(qu.size()>1) {
				int a = qu.poll();
				int b = qu.poll();
				if(a>=b) {
					qu.add(a);
					diff += a-b;
				}
				else {
					qu.add(b);
					diff += b-a;
				}
			}
			System.out.println("#" + tc + " " + diff);
		}
	}

}
