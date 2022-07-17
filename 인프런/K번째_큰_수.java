import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

public class K번째_큰_수 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		int arr[] = new int[N];
		for(int i=0; i<N; i++)
			arr[i] = sc.nextInt();
		
		int answer = -1;
		
		TreeSet<Integer> set = new TreeSet<Integer>(Collections.reverseOrder());
		for(int i=0; i<N; i++) {
			for(int j=i+1; j<N; j++) {
				for(int k=j+1; k<N; k++) {
					set.add(arr[i]+arr[j]+arr[k]);
				}
			}
		}
		
		int cnt = 1;
		for(int x : set) {
			if(cnt==M) {
				answer = x;
				break;
			}
			cnt++;
		}
		
		System.out.println(answer);
		
	}
}
