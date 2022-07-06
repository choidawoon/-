import java.util.Scanner;

public class 문장속단어 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		
		String starr[] = str.split(" ");
		
		String result ="";
		
		for(int i=0; i<starr.length; i++) {
			if(result.length()<starr[i].length())
				result= starr[i];
		}
		
		System.out.println(result);
		
	}
}
