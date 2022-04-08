import java.util.Scanner;

public class 직사각형길이찾기_3456 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		for(int tc=1; tc<=t; tc++) {
			
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			int d = 0;
			
			if(a==b) {
				d = c;
			}
			else if(a==c) {
				d = b;
			}
			else if(b==c) {
				d = a;
			}
			
			System.out.println("#" + tc + " " + d);
			
		}//tc
	}

}
