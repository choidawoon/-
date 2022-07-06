import java.util.Scanner;

public class 단어뒤집기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		for(int i=0; i<N; i++) {
			String str = sc.next();
			char carr[] = str.toCharArray();
			
			for(int j=str.length()-1; j>=0; j--) {
				System.out.print(carr[j]);
			}
			
			System.out.println();
			
		}
		
	}
}
