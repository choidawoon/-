import java.util.Scanner;

public class 유효한_팰린드롬 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		str = str.toLowerCase().replaceAll("[^a-z]", "");
		
		StringBuilder sb = new StringBuilder();
		String str2 = sb.append(str).reverse().toString();
		
		if(str.equals(str2))
			System.out.println("YES");
		else
			System.out.println("NO");
		

		
	}
}
