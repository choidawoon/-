import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		Map<String, Integer> map = new TreeMap();
		
		int N = sc.nextInt();
		String[] extension = new String[N];
		for(int i=0; i<N; i++) {
			String str = sc.next();
			String[] tmp = str.split("\\.");
			if(map.containsKey(tmp[1])) {
				map.put(tmp[1], map.get(tmp[1])+1);
			}
			else
				map.put(tmp[1], 1);
		}
		
		for(String key : map.keySet()) {
			System.out.println(key + " " + map.get(key));
		}
	}

}