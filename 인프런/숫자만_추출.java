import java.util.Scanner;

public class 숫자만_추출 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		str = str.replaceAll("[^0-9]", "");
		
		int result = Integer.parseInt(str);
		
		System.out.println(result);
		
	}
}
