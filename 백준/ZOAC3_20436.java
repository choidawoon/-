import java.util.Scanner;

public class ZOAC3_20436 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		char map[][] = {{'q','w','e','r','t','y','u','i','o','p'}
						,{'a','s','d','f','g','h','j','k','l','X'}
						,{'z','x','c','v','b','n','m','X','X','X'}};
		
		char left = sc.next().charAt(0);
		char right = sc.next().charAt(0);
		String str = sc.next();
		int time = 0;
		
		char carr[] = str.toCharArray();
		
		for(int i=0; i<str.length(); i++){
			if(carr[i]=='y'||carr[i]=='u'||carr[i]=='i'||carr[i]=='o'||carr[i]=='p'
					||carr[i]=='h'||carr[i]=='j'||carr[i]=='k'||carr[i]=='l'
					||carr[i]=='b'||carr[i]=='n'||carr[i]=='m') {
				int x1 = 0;
				int x2 = 0;
				int y1 = 0;
				int y2 = 0;
				for(int a=0; a<3; a++) {
					for(int b=0; b<10; b++) {
						if(map[a][b]==right) {
							y1 = a;
							x1 = b;
						}
						if(map[a][b]==carr[i]) {
							y2 = a;
							x2 = b;
						}
					}
				}
				int distance = Math.abs(y2-y1) + Math.abs(x2-x1);
				right = carr[i];
//				System.out.println("오른쪽 거리 : "+distance);
				time += distance;
			}
			else {
				int x1 = 0;
				int x2 = 0;
				int y1 = 0;
				int y2 = 0;
				for(int a=0; a<3; a++) {
					for(int b=0; b<10; b++) {
						if(map[a][b]==left) {
							y1 = a;
							x1 = b;
						}
						if(map[a][b]==carr[i]) {
							y2 = a;
							x2 = b;
						}
					}
				}
				int distance = Math.abs(y2-y1) + Math.abs(x2-x1);
				left = carr[i];
//				System.out.println("왼쪽 거리 : "+distance);
				time += distance;
			}
		}	
		System.out.println(time+str.length());
	}
}
