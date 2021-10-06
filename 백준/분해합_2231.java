import java.util.Scanner;

public class 분해합_2231 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int min = Integer.MAX_VALUE;
		
		for(int i=0; i<N; i++) {
			int number = i;
			int sum = 0;
			
			while(number!=0) {
				sum += number%10;
				number /= 10;
				
			}
			if(sum + i == N) {
				min = i;
				break;
			}
		}	
		System.out.println(min);
	}
}
