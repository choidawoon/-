import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class 두_배열_합치기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Integer> list = new ArrayList<Integer>();
	
		int N = sc.nextInt();
		int arr[] = new int[N];
		for(int i=0; i<N; i++) {
			arr[i] = sc.nextInt();
			list.add(arr[i]);
		}
		
		int M = sc.nextInt();
		int arr2[] = new int[M];
		for(int i=0; i<M; i++) {
			arr2[i] = sc.nextInt();
			list.add(arr2[i]);
		}
		
		list.sort(null);
		for(int i=0; i<list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
		
	}
}
