import java.util.Scanner;

public class 평균_1546 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		double real[] = new double[N];
		double fake[] = new double[N];
		double max = 0;
		double sum = 0;
		double avg = 0;
		
		for(int i=0; i<N; i++) {
			real[i] = sc.nextInt();
			max = Math.max(real[i], max);
		}

		for(int i=0; i<N; i++) {
			fake[i] = real[i]/max*100;
			sum += fake[i];
		}
		
		avg = sum/N;
		
		System.out.println(avg);
	}

}
