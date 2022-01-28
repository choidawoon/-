import java.util.Scanner;

public class 숫자의합_11720 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	
		int N = sc.nextInt();
		String str = sc.next();	
		char carr[] = str.toCharArray();
		
		int sum = 0;
		for(int i=0; i<str.length(); i++){
			int a = carr[i] - '0';
			sum+=a;
		}
		System.out.println(sum);
	}
}
