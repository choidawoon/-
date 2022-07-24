import java.util.Arrays;
import java.util.Scanner;

public class 마구간_정하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		int arr[] = new int[N];
		
		for(int i=0; i<N; i++)
			arr[i] = sc.nextInt();
		
		Arrays.sort(arr);
		
		int lt = 1;
		int rt = arr[N-1];
		int result = 0;
		
		while(lt<=rt) {
			int mid = (lt+rt)/2;
			
			if(count(arr, mid)>=M) {
				result = mid;
				lt = mid+1;
			}
			
			else {
				rt = mid-1;
			}
			
		}
		
		System.out.println(result);
		
	}
	
	static int count(int[] arr, int dist) {
		
		int cnt = 1;
		int ep = arr[0];
		
		for(int i=1; i<arr.length; i++) {
			
			if(arr[i]-ep>=dist) {
				cnt++;
				ep = arr[i];
			}
			
		}		
		return cnt;
	}
	
}
