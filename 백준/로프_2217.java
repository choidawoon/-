import java.util.Arrays;
import java.util.Scanner;

public class ทฮวม_2217 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int arr[] = new int[N];
		for(int i=0; i<N; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		int max = 0;
		int cnt = 1;
		
		for(int i=N-1; i>=0; i--) {
			int sum = arr[i]*cnt;
			System.out.println(sum);
			max = Math.max(max, sum);
			cnt++;
		}
		System.out.println(max);
	}
}
