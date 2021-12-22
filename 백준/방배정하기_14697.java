import java.util.Scanner;

public class 방배정하기_14697 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int N = sc.nextInt();
		
		boolean check = false;
		
		for(int i=0; i<=50; i++) {
			for(int j=0; j<=50; j++) {
				for(int k=0; k<=50; k++) {
					if((a*i) + (b*j) + (c*k) == N) {
						check = true;
					}
				}
			}
		}
		
		if(check)
			System.out.println("1");
		else
			System.out.println("0");
	}

}
