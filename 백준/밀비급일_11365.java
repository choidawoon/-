import java.util.Scanner;

public class �к����_11365 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			String str = sc.nextLine();
			if(str.equals("END")) {
				break;
			}
			else {
				char[] carr = str.toCharArray();
				for(int i=str.length()-1; i>=0; i--) {
					System.out.print(carr[i]);
				}
			}
			System.out.println();
		}
	}

}
