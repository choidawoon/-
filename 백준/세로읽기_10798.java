import java.util.Scanner;

public class 세로읽기_10798 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String str1 = sc.next();
		String str2 = sc.next();
		String str3 = sc.next();
		String str4 = sc.next();
		String str5 = sc.next();
		
		char carr1[] = str1.toCharArray();
		char carr2[] = str2.toCharArray();
		char carr3[] = str3.toCharArray();
		char carr4[] = str4.toCharArray();
		char carr5[] = str5.toCharArray();
		
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<15; i++) {
			if(carr1.length>i)
				sb.append(carr1[i]);
			if(carr2.length>i)
				sb.append(carr2[i]);
			if(carr3.length>i)
				sb.append(carr3[i]);
			if(carr4.length>i)
				sb.append(carr4[i]);
			if(carr5.length>i)
				sb.append(carr5[i]);
		}
		
		System.out.println(sb);
		
	}

}
