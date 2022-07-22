import java.util.Arrays;
import java.util.Scanner;

public class 뮤직비디오_결정알고리즘 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		int arr[] = new int[N];
		
		for(int i=0; i<N; i++)
			arr[i] = sc.nextInt();
		
		int result = 0;
		int lt = Arrays.stream(arr).max().getAsInt();
		int rt = Arrays.stream(arr).sum();
		
		while(lt<=rt) {
			int mid = (lt+rt)/2;
			
			if(count(arr, mid)<=M) {
				result = mid;
				rt = mid - 1;
			}
			
			else
				lt = mid + 1;
			
		}
		
		System.out.println(result);
		
	}
	
	static int count(int[] ar, int capacity) {
		int cnt = 1;
		int sum = 0;
		
		for(int x : ar) {
			
			if(sum+x > capacity) {
				cnt++;
				sum = x;
			}
			
			else {
				sum += x;
			}
			
		}
		
		return cnt;
		
	}
	
}
