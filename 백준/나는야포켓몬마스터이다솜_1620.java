import java.util.HashMap;
import java.util.Scanner;

public class 나는야포켓몬마스터이다솜_1620 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
//		int N = sc.nextInt();
//		int M = sc.nextInt();
//		StringBuilder sb = new StringBuilder();
//		
//		String pokemon[] = new String[N];
//		for(int i=0; i<N; i++) {
//			pokemon[i] = sc.next();
//		}
//		
//		for(int i=0; i<M; i++) {
//			String str = sc.next();
//			boolean check = false;
//			for(int j=0; j<N; j++) {
//				if(str.equals(pokemon[j])) {
//					sb.append(j+1 + "\n");
//					check = true;
//					break;
//				}
//			}
//			if(!check) {
//				int a = Integer.parseInt(str);
//				sb.append(pokemon[a-1] + "\n");
//			}
//		}
//		System.out.println(sb);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		HashMap<String, String> map = new HashMap<String, String>();
		String pokemon[] = new String[N];
		
		for(int i=0; i<N; i++) {
			pokemon[i] = sc.next();
			String num = Integer.toString(i+1);
			map.put(pokemon[i], num);
			map.put(num, pokemon[i]);
		}
		
		for(int i=0; i<M; i++) {
			String str = sc.next();
			System.out.println(map.get(str));
		}
		
	}
}


