import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		int[] arr = new int[str.length()];
		
		for(int i=0; i<str.length(); i++) {
			arr[i] = str.charAt(i) - '0';
		}
		
		Arrays.sort(arr);
		int temp = arr.length;
		
		for(int i=temp-1; i>=0; i--) {
			System.out.print(arr[i]);
		}
	}

}