import java.util.Scanner;

public class 보이는_학생 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int result = 0;
		
		int max = 0;
		
		for(int i=0; i<N; i++) {
			int tmp = sc.nextInt();
			if(tmp>max)
				result++;
			max = Math.max(max, tmp);
		}
		
		System.out.println(result);
		
	}
}
