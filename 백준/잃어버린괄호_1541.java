import java.util.Scanner;

public class 잃어버린괄호_1541 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		
		boolean check = false;
		char carr[] = str.toCharArray();
		for(int i=0; i<str.length(); i++) {
			if(carr[i]=='-')
				check = true;
		}
		
		if(check) {
			
		String st_minus[] = str.split("-");
		
		boolean first = false;
		int result = 0;
		for(int i=0; i<st_minus.length; i++) {
			
			String st_plus[] = st_minus[i].split("\\+");
			int tmp = 0;
			
			for(int j=0; j<st_plus.length; j++) {
				tmp += Integer.parseInt(st_plus[j]);
				}
			
			if(first) {
				result -= tmp;
			}
			else {
				result = result+tmp;
			}
				first = true;
			}// minus
		
			System.out.println(result);
		
		}//check
		
		else {
			String st_plus[] = str.split("\\+");
			int result = 0;
			for(int i=0; i<st_plus.length; i++) {
				result += Integer.parseInt(st_plus[i]);
			}
			System.out.println(result);
		}//else
		
	}
}
