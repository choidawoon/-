import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Least_Recently_Used {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int size = sc.nextInt();
		int N = sc.nextInt();
		int lru[] = new int[size];
		
		boolean full = false;
		for(int i=0; i<N; i++) {
			int hit = sc.nextInt();
			
			int here = 0;
			boolean ishere = false;
			for(int x=0; x<size; x++) {
				if(lru[x]==hit) {
					ishere = true;
					here = x;
					break;
				}
			}
			
			if(!ishere) {
				for(int j=size-1; j>=1; j--) {
					lru[j] = lru[j-1];
				}
				lru[0] = hit;
			}
			
			else {
				for(int j=here; j>=1; j--) {
					lru[j] = lru[j-1];
				}
				lru[0] = hit;
			}
				
		}//for
		
		for(int i=0; i<size; i++)
			System.out.print(lru[i] + " ");
		
	}
}
