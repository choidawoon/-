import java.util.HashMap;
import java.util.Scanner;

public class 학급회장 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		String str = sc.next();
		
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		
		for(int i=0; i<str.length(); i++) {
			map.put(str.charAt(i), map.getOrDefault(str.charAt(i), 0)+1);
		}
		
		int max = 0;
		char result = ' ';
		for(char x : map.keySet()) {
			if(max<map.get(x)) {
				result = x;
				max = map.get(x);
			}
		}
		
		System.out.println(result);
		
	}
}
