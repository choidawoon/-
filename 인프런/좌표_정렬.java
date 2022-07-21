import java.util.ArrayList;
import java.util.Collections;
import java.util.Queue;
import java.util.Scanner;

public class 좌표_정렬 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		ArrayList<func> list = new ArrayList<func>();
		
		for(int i=0; i<N; i++) {
			int tmp_x = sc.nextInt();
			int tmp_y = sc.nextInt();
			
			list.add(new func(tmp_x, tmp_y));
		}
		
		Collections.sort(list);
		
		for(func x : list) {
			System.out.println(x.x + " " + x.y);
		}
	}
}

class func implements Comparable<func>{
	int x;
	int y;
	func(int x, int y){
		this.x = x;
		this.y = y;	
	}
	@Override
	public int compareTo(func o) {
		if(this.x==o.x)
			return this.y - o.y;
		else
			return this.x - o.x;
	}
}
