import java.util.Scanner;

public class 소인수분해_11653 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		boolean check = true;
		if(N>=2) {
			while(check) {
				
				for(int i=2; i<=10000000; i++) {
					if(N<i) {
						break;
					}
					else if(N%i==0) {
						N = N/i;
						System.out.println(i);
						break;
					}
				}
				if(N<2) {
					check = false;
				}
			}
		}
	}

}
