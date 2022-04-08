import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class 듣보잡_1764_list {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		Set<String> no_see = new HashSet<>();
//		ArrayList<String> no_see = new ArrayList<>();
		ArrayList<String> no_see_hear = new ArrayList<>();
		
		for(int i=0; i<N; i++) {
			String s = sc.next();
			no_see.add(s);
		}
		
		for(int i=0; i<M; i++) {
			String str = sc.next();
			if(no_see.contains(str)) {
				no_see_hear.add(str);
			}
				
		}
		
		Collections.sort(no_see_hear);
		
		System.out.println(no_see_hear.size());
		for(int i=0; i<no_see_hear.size(); i++) {
			System.out.println(no_see_hear.get(i));
		}
		
	}

}
