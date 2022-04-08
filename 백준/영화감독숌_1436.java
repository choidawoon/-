import java.util.Scanner;

public class 영화감독숌_1436 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int num = 0;
		
		while(N>0) {
			num++;
			String str = Integer.toString(num);
			
			if(str.contains("666")) {
				N--;
			}
		}
		System.out.println(num);
	}
}
