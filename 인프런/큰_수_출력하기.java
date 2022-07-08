import java.util.ArrayList;
import java.util.Scanner;

public class 큰_수_출력하기 {
 public static void main(String[] args) {
	 
	 Scanner sc = new Scanner(System.in);
	 
	 int N = sc.nextInt();
	 
	 ArrayList<Integer> list = new ArrayList<Integer>();
	 
	 int pre = 0;
	 
	 for(int i=0; i<N; i++) {
		 int tmp = sc.nextInt();
		 if(tmp>pre)
			 list.add(tmp);
		 pre = tmp;;
	 }
	 
	 for(int i=0; i<list.size(); i++) {
		 System.out.print(list.get(i) + " ");
	 }
	 
 }
}
