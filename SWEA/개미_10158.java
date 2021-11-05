import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int w = sc.nextInt();
		int h = sc.nextInt();
		
		int col = sc.nextInt();
		int row = sc.nextInt();
		int N = sc.nextInt();
		
		row = h - Math.abs(h-(row+N)%(2*h));
		col = w - Math.abs(w-(col+N)%(2*w));
		
		System.out.println(col + " " + row);
	}

}