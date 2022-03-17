import java.util.Scanner;

public class ÇÇÄ«Ãò_14405 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		
		char carr[] = str.toCharArray();
		
		boolean check = false;
		
		for(int i=0; i<str.length(); i++) {
			if(carr[i]=='p') {
				if(i+1<str.length() && carr[i+1]=='i') {
					i = i+1;
				}
				else {
					check = true;
					break;
				}
			}
			else if(carr[i]=='k') {
				if(i+1<str.length() && carr[i+1]=='a') {
					i = i+1;
				}
				else {
					check = true;
					break;
				}
			}
			else if(carr[i]=='c') {
				if(i+2<str.length() && carr[i+1]=='h' && carr[i+2]=='u') {
					i = i+2;
				}
				else {
					check = true;
					break;
				}
			}
			else {
				check = true;
				break;
			}
		}
		
		if(check)
			System.out.println("NO");
		else
			System.out.println("YES");
		
	}

}
