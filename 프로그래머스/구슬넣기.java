import java.util.Scanner;

public class 한국네트웍스_구슬 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int answer  = 0;
		
		String[] drum = {"######", ">#*###", "####*#", "#<#>>#", ">#*#*<", "######"};
		
		char map[][] = new char[drum.length][drum.length];
		for(int i=0; i<drum.length; i++) {
			char tmp[] = drum[i].toCharArray();
			for(int j=0; j<drum.length; j++) {
				map[i][j] = tmp[j];
			}
		}
		
		for(int x=0; x<drum.length; x++) {
			int idx = 0;
			int col = x;
			int double_chk = 0;
			
			while(true) {
				
				if(idx>=drum.length) {
					answer++;
					break;
				}
				
				if(map[idx][col]=='*') {
					double_chk++;
					if(double_chk==2)
						break;
					else
						idx++;
				}
				else if(map[idx][col]=='#') {
					idx++;
				}
				else if(map[idx][col]=='>') {
					col++;
				}
				else if(map[idx][col]=='<') {
					col--;
				}				
				
			}//while
			
		}
		
		System.out.println(answer);
		
	}

}
