import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int cnt = 0;
		for(int i=0; i<N; i++) {
			
			String str = sc.next();
			char[] carr = str.toCharArray();
			char[] com	 = new char[str.length()];
			
			boolean check = false;
			for(int j=0; j<carr.length; j++) {
				com[j] = carr[j];
				
				if(j+1<carr.length) {
					if(carr[j]!=carr[j+1]) {
						for(int k=0; k<j; k++) {
							if(carr[j+1]==com[k])
								check = true;
						}
					}
				}
			}
			if(!check)
				cnt++;
		}//tc
		System.out.println(cnt);
	}

}
