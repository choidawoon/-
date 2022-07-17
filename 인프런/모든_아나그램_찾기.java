import java.util.HashMap;
import java.util.Scanner;

public class 모든_아나그램_찾기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		String com = sc.next();
		int result  = 0;
		
		HashMap<Character, Integer> am = new HashMap<Character, Integer>();
		HashMap<Character, Integer> bm = new HashMap<Character, Integer>();
		
		for(int i=0; i<com.length(); i++)
			am.put(com.charAt(i), am.getOrDefault(com.charAt(i), 0)+1);
		
		int tmp = com.length()-1;
		for(int i=0; i<tmp; i++) {
			bm.put(str.charAt(i), bm.getOrDefault(str.charAt(i), 0)+1);
		}
		
		int idx = 0;
		for(int i = tmp; i<str.length(); i++) {
			bm.put(str.charAt(i), bm.getOrDefault(str.charAt(i), 0)+1);
			if(am.equals(bm))
				result++;
			bm.put(str.charAt(idx), bm.get(str.charAt(idx))-1);
			if(bm.get(str.charAt(idx))==0)
				bm.remove(str.charAt(idx));
			idx++;
		}
		
		
		System.out.println(result);
		
	}
}
