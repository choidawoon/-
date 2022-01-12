import java.util.Scanner;

public class 수학은비대면강의입니다_19532 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int x1 = sc.nextInt();
		int y1 = sc.nextInt();
		int result1 = sc.nextInt();
		int x2 = sc.nextInt();
		int y2 = sc.nextInt();
		int result2 = sc.nextInt();
		
		for(int i=-999; i<1000; i++) {
			for(int j=-999; j<1000; j++) {
				if(x1*i + y1*j == result1 && x2*i + y2*j == result2) {
					System.out.println(i + " " + j);
					break;
				}
			}
		}
		
	}

}
