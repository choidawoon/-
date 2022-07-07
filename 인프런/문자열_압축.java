import java.util.Scanner;

public class 문자열_압축 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		str = str + " ";
		int cnt = 1;
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<str.length()-1; i++) {
			if(str.charAt(i)==str.charAt(i+1))
				cnt++;
			else {
				sb.append(str.charAt(i));
				if(cnt>1)
					sb.append(cnt);
				cnt = 1;
			}
		}
		
		System.out.println(sb.toString());
		
	}
}
