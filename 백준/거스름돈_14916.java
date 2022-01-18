import java.util.Scanner;

public class 거스름돈_14916 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int rest = 0;
		
		boolean check = true;
		while(check) {
			if(N==1) {
				rest = -1;
				break;
			}
			if(N==0)
				break;
			if(N%5==0) {
				N = N -5;
				rest++;
			}
			else {
				N = N -2;
				rest++;
			}
		}
		
		System.out.println(rest);
			
	}
}
