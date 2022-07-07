import java.util.Scanner;

public class 가장_짧은_문자거리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		char c = sc.next().charAt(0);
		
		char carr[] = str.toCharArray();
		int arr[] = new int[str.length()];
		
		for(int i=0; i<str.length(); i++) {
			int min = Integer.MAX_VALUE;
			for(int j=0; j<str.length(); j++) {
				if(carr[j]==c) {
					if(i<=j)
						min = Math.min(min, j-i);
					else
						min = Math.min(min, i-j);
				}
			}
			arr[i] = min;
		}
		
		for(int i=0; i<str.length(); i++) {
			System.out.print(arr[i] + " ");
		}
		
	}
}
