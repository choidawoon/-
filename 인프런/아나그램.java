import java.util.HashMap;
import java.util.Scanner;

public class 아나그램 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		String str_1 = sc.next();
		String str_2 = sc.next();
		
		HashMap<Character, Integer> map_1 = new HashMap<Character, Integer>();
		HashMap<Character, Integer> map_2 = new HashMap<Character, Integer>();
		
		for(char x : str_1.toCharArray()) {
			map_1.put(x, map_1.getOrDefault(x, 0)+1);
		}
		
		for(char x : str_2.toCharArray()) {
			map_2.put(x, map_2.getOrDefault(x, 0)+1);
		}
		
		boolean check = true;
		
		if(map_1.size()>=map_2.size()) {
			for(char key : map_1.keySet()) {
				if(map_1.get(key)!=map_2.get(key)) {
					check = false;
					break;
				}
			}
		}
		
		else {
			for(char key : map_2.keySet()) {
				if(map_1.get(key)!=map_2.get(key)) {
					check = false;
					break;
				}
			}
		}
		
		if(check)
			System.out.println("YES");
		else
			System.out.println("NO");
		
	}
}
