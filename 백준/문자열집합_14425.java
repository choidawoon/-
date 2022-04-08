import java.util.HashMap;
import java.util.Scanner;

public class 문자열집합_14425 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		HashMap<String, String> map = new HashMap<String, String>();
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		int cnt = 0;
		
		for(int i=0; i<N; i++) {
			String str = sc.next();
			map.put(str, str);
		}
		
		for(int i=0; i<M; i++) {
			String str = sc.next();
			if(map.get(str)!=null)
				cnt++;
		}
		System.out.println(cnt);
	}
}
