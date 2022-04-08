import java.util.Scanner;

public class 시각_18312 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		int cnt = 0;
		
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<=N; i++) {
			for(int j=0; j<60; j++) {
				for(int k=0; k<60; k++) {
					String str = "";
					if(i<10) {						
						str = str+"0"+i;
					}
					else {
						str = str+i;				
					}
					if(j<10) {						
						str = str+"0"+j;
					}
					else {
						str = str+j;					
					}
					if(k<10) {
						str = str+"0"+k;						
					}
					else {
						str = str+k;						
					}
					if(str.contains(""+M))
						cnt++;
				}
			}
		}
		
		System.out.println(cnt);
		
	}
}
