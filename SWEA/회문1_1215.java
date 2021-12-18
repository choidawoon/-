import java.util.Scanner;

public class 회문1_1215 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		for(int tc=1; tc<=10; tc++) {
			
			int N = sc.nextInt();
			int cnt = 0;
			char[][] arr = new char[8][8];
			for(int i=0; i<8; i++) {
				String str = sc.next();
				for(int j=0; j<8; j++) {
					arr[i][j] = str.charAt(j);
				}
			}
			
			for(int i=0; i<8; i++) {
				for(int j=0; j<8; j++) {
					boolean check = false;
					for(int k=0; k<N/2; k++) {
						if(j-k+N-1>=8 || (j+k)>=8) {
							check = true;
							break;
						}
						if(arr[i][j+k] != arr[i][j-k+N-1]) {
							check = true;
						}
					}
					if(!check) {
						cnt++;
					}
				}
			}
			
			for(int i=0; i<8; i++) {
				for(int j=0; j<8; j++) {
					boolean check = false;
					for(int k=0; k<N/2; k++) {
						if(j-k+N-1>=8 || (j+k)>=8) {
							check = true;
							break;
						}
						if(arr[j+k][i] != arr[j-k+N-1][i]) {
							check = true;
						}
					}
					if(!check) {
						cnt++;
					}
				}
			}
			System.out.println("#" + tc + " " + cnt);
		}//tc
	}

}
