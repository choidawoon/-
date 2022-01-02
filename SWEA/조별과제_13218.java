import java.util.Scanner;

public class 조별과제_13218 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int tc=1; tc<=t; tc++) {
			int N = sc.nextInt();
			System.out.println("#" + tc + " " + N/3);
		}//tc
	}
}
