import java.util.Scanner;

public class 암호 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		String str = sc.next();

		int idx = 7;
		StringBuilder result = new StringBuilder();
		
//		for(int i=0; i<N; i++) {
//			
//			String tmp = str.substring(i*7,idx);
//			StringBuilder sb = new StringBuilder();
//			
//			for(int j=0; j<7; j++) {
//				if(tmp.charAt(j)=='#')
//					sb.append("1");
//				else
//					sb.append("0");
//			}
//			
//			int askii = Integer.parseInt(sb.toString(), 2);
//			char ch = (char)askii;
//			result.append(ch);
//			idx =  idx + 7;
//			
//		}
		
		for(int i=0; i<N; i++) {
			String tmp = str.substring(0,7).replace('#', '1').replace('*', '0');
			int askii = Integer.parseInt(tmp,2);
			
			char ch = (char)askii;
			result.append(ch);
			str = str.substring(7);
		}
		
		System.out.println(result.toString());
		
	}
}
