import java.util.Scanner;

public class 두문자어_8741 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		for(int tc=1; tc<=t; tc++) {
			
			String str[] = new String[3];
			
			for(int i=0; i<3; i++) {
				String tmp = sc.next();
				str[i] = tmp.substring(0, 1).toUpperCase();
			}
			
			System.out.print("#" + tc + " ");
			
			for(int i=0; i<3; i++) {
				System.out.print(str[i]);
			}
			System.out.println();
		}
	}
}
