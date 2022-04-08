import java.util.Scanner;

public class 나는친구가적다Small_16171 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.next().replaceAll("[0-9]", "");
		String str2 = sc.next();

		
		char[] carr = str.toCharArray();
		char[] carr2 = str2.toCharArray();
		
		boolean check = true;
	
		for(int i=0; i<carr.length; i++) {
			if(carr[i]==carr2[0] && i+carr2.length<=carr.length) {
				int cnt = 0;
				for(int j=i; j<i+carr2.length; j++) {
					if(carr[i+cnt]==carr2[cnt]) {
						cnt++;
					}
				}
				if(cnt==str2.length())
					check = false;
			}
		}
		
		if(!check)
			System.out.println("1");
		else
			System.out.println("0");
		
	}
}
