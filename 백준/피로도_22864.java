import java.util.Scanner;

public class 피로도_22864 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int M = sc.nextInt();
		
		int time = 0;
		int gauge = 0;
		int work = 0;
		
		while(time!=24) {
			
			if(gauge + A <= M) {
				gauge+=A;
				work += B;
			}
			else {
				gauge-=C;
				if(gauge<0)
					gauge = 0;
			}
			time++;
		}
		
		System.out.println(work);
	}

}
