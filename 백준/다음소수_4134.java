import java.math.BigInteger;
import java.util.Scanner;

public class 다음소수_4134 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	
		int t = sc.nextInt();
		
		for(int tc=0; tc<t; tc++) {
			
//			int N = sc.nextInt();
//			
//			int result = N;
//			boolean end = true;
//			while(end) {
//				boolean check = true;
//				for(int i=2; i<N; i++) {
//					if(result%i==0) {
//						check = false;
//						break;
//					}
//				}
//				if(check)
//					break;
//				result++;
//			}
//			if(N==0 || N==1)
//				System.out.println("2");
//			else 
//			System.out.println(result);
			
			
			// 함수사용
			long N = sc.nextLong();
			BigInteger result = new BigInteger(String.valueOf(N));
			
			if(result.isProbablePrime(10))
				System.out.println(result);
			else
				System.out.println(result.nextProbablePrime());
			
		}//tc
	}
}
