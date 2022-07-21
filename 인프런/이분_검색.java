import java.util.Arrays;
import java.util.Scanner;

public class 이분_검색 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		int arr[] = new int[N];
		
		for(int i=0; i<N; i++)
			arr[i] = sc.nextInt();
		
		Arrays.sort(arr);
		
		int lt = 0;
		int rt = N-1;
		int result = 0;
		
		while(lt<=rt) {
			int mid = (lt+rt)/2;
			
			if(arr[mid]==M) {
				result = mid+1;
				break;
			}
			
			if(arr[mid]>M)
				rt = mid-1;
			else
				lt = mid+1;
			
		}
		
		System.out.println(result);
		
	}
}
