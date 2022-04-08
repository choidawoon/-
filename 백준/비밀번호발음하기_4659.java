import java.util.Scanner;

public class 비밀번호발음하기_4659 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		
		boolean check = true;
		char aeiou[] = {'a','e','i','o','u'};
		while(check) {
			StringBuilder sb = new StringBuilder();
			String str = sc.nextLine();
			if(str.equals("end")) {
				check = false;
			}
			else {
				char carr[] = str.toCharArray();
				boolean check1 = false;
				boolean check2 = true;
				boolean check3 = true;
				int mo = 0;
				int ja = 0;
				char last = '0';
				for(int i=0; i<carr.length; i++) {
					boolean ismo = false;
					for(int j=0; j<aeiou.length; j++) {
						if(carr[i]==aeiou[j]) {
							ismo = true;
							break;
							}
						}
					
					if(ismo) {
						check1 = true;
						mo++;
						ja = 0;
					}
					else {
						ja++;
						mo = 0;
					}
					
					if(last !='e' && last !='o' && last == carr[i]) {
						check2 = false;
						break;
					}
					
					if(ja==3 || mo==3) {
						check3 = false;
						break;
					}
					
					last = carr[i];
				}//for
				
				sb.append("<" + str + "> is ");
				
				if(!check1 || !check2 || !check3) {
					sb.append("not acceptable.");
				}
				else {
					sb.append("acceptable.");
				}
				System.out.println(sb);
			}//else
		}//while
		
	}
}
