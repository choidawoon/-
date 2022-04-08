import java.util.Scanner;

public class 다양성측정_7728 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		for(int tc=1; tc<=t; tc++) {
			
			String str = sc.next();
			char carr[] = str.toCharArray();
			
			int cnt = 0;
			boolean[] check = new boolean[10];
			
			for(int i=0; i<str.length(); i++) {
				if(carr[i]=='0' && !check[0]) {
					cnt++;
					check[0] = true;
				}
				else if(carr[i]=='1' && !check[1]) {
					check[1] = true;
					cnt++;
				}else if(carr[i]=='2' && !check[2]) {
					check[2] = true;
					cnt++;
				}else if(carr[i]=='3' && !check[3]) {
					check[3] = true;
					cnt++;
				}else if(carr[i]=='4' && !check[4]) {
					check[4] = true;
					cnt++;
				}else if(carr[i]=='5' && !check[5]) {
					check[5] = true;
					cnt++;
				}else if(carr[i]=='6' && !check[6]) {
					check[6] = true;
					cnt++;
				}else if(carr[i]=='7' && !check[7]) {
					check[7] = true;
					cnt++;
				}else if(carr[i]=='8' && !check[8]) {
					check[8] = true;
					cnt++;
				}else if(carr[i]=='9' && !check[9]) {
					check[9] = true;
					cnt++;
					}
				}
			
				System.out.println("#" + tc + " " + cnt);
			}
		}
	}

