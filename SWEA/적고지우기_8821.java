import java.util.Scanner;

public class 적고지우기_8821 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		for(int tc=1; tc<=t; tc++) {
			
			String str = sc.next();
			char[] carr = str.toCharArray();
			int[] arr = new int[carr.length];
			boolean[] check = new boolean[10];
			
			for(int i=0; i<carr.length; i++) {
				arr[i] = carr[i] - '0';
			}
			
			for(int i=0; i<carr.length; i++) {
				int tmp = arr[i];
				if(check[tmp]) {
					check[tmp] = false;
				}else
				check[tmp] = true;
			}
			
			int cnt = 0;
			
			for(int i=0; i<10; i++) {
				if(check[i])
					cnt++;
			}
			
			System.out.println("#" + tc + " " + cnt);
			
		}//tc
		
	}

}
