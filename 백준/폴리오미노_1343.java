import java.util.Scanner;

public class 폴리오미노_1343 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		char carr[] = str.toCharArray();
		
		for(int i=0; i<str.length(); i++) {
			if(carr[i]=='X' && i+3<str.length()) {
				boolean check = true;
				for(int j=i; j<=i+3; j++) {
					if(carr[j]=='.') {
						check = false;
					}
				}
				if(check) {
					for(int j=i; j<=i+3; j++) {
						carr[j] = 'A';
					}
					i=i+3;
				}
			}
			if(carr[i]=='X' && i+1<str.length()) {
				boolean check = true;
				for(int j=i; j<=i+1; j++) {
					if(carr[j]=='.') {
						check = false;
					}
				}
				if(check) {
					for(int j=i; j<=i+1; j++) {
						carr[j] = 'B';
					}
					i=i+1;
				}
			}
			
		}
		
		boolean ck = true;
		for(int i=0; i<str.length(); i++) {
			if(carr[i]=='X')
				ck = false;
		}
		if(!ck)
			System.out.println("-1");
		else {
			for(int i=0; i<str.length(); i++) {
				System.out.print(carr[i]);
			}
		}
			
	}
}
