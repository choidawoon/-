import java.util.Scanner;

public class 비밀번호발음하기_4659 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		boolean check = true;
		while(check) {
			String str = sc.nextLine();
			if(str.equals("end")) {
				check = false;
			}
			else {
				char carr[] = str.toCharArray();
				boolean check1 = true;
				boolean check2 = true;
				boolean check3 = true;
				for(int i=0; i<str.length(); i++) {
					if(carr[i]=='a' || carr[i]=='e' || carr[i]=='i' || carr[i]=='o' || carr[i]=='u') {
						check1 = false;
					}
					
				}
			}
		}
		
	}
}
