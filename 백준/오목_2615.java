import java.util.Scanner;

public class 오목_2615 {
	static int map[][] = new int[19][19];
	static boolean visit[][][] = new boolean[19][19][4];
	static int cnt;
	static boolean omok = false;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<19; i++) {
			for(int j=0; j<19; j++) {
				map[i][j] = sc.nextInt();
			}
		}
		
		for(int i=0; i<19; i++) {
			for(int j=0; j<19; j++) {
				if(map[i][j]!=0 && !omok) {
					
					cnt = 1;
					right(i,j,0);
					if(cnt==5) {
						System.out.println(map[i][j]);
						System.out.print(i+1);
						System.out.print(" ");
						System.out.print(j+1);
						omok = true;
					}
					
					cnt = 1;
					down(i,j,1);
					if(cnt==5) {
						System.out.println(map[i][j]);
						System.out.print(i+1);
						System.out.print(" ");
						System.out.print(j+1);
						omok = true;
					}
					
					cnt = 1;
					cross_down_right(i,j,2);
					if(cnt==5) {
						System.out.println(map[i][j]);
						System.out.print(i+1);
						System.out.print(" ");
						System.out.print(j+1);
						omok = true;
					}
					
					cnt = 1;
					cross_down_left(i,j,3);
					if(cnt==5) {
						System.out.println(map[i][j]);
						System.out.print(i+5);
						System.out.print(" ");
						System.out.print(j-3);
						omok = true;
					}
					
				}
			}
		}
		if(!omok)
			System.out.println("0");
		
		
	}
	static void right(int row, int col, int dir) {
		visit[row][col][dir] = true;
		if(col+1>=19)
			return;
		if(!visit[row][col+1][dir] && map[row][col]==map[row][col+1]) {
			col++;
			cnt++;
			right(row,col,dir);		
		}
	}
	
	static void down(int row, int col, int dir) {
		visit[row][col][dir] = true;
		if(row+1>=19)
			return;
		if(!visit[row+1][col][dir] && map[row][col]==map[row+1][col]) {
			row++;
			cnt++;
			down(row,col,dir);
		}
	}
	
	static void cross_down_right(int row, int col, int dir) {
		visit[row][col][dir] = true;
		if(row+1>=19 || col+1>=19)
			return;
		if(!visit[row+1][col+1][dir] && map[row][col]==map[row+1][col+1]) {
			row++;
			col++;
			cnt++;
			cross_down_right(row, col, dir);
		}
	}
	
	static void cross_down_left(int row, int col, int dir) {
		visit[row][col][dir] = true;
		if(row+1>=19 || col-1<0)
			return;
		if(!visit[row+1][col-1][dir] && map[row][col]==map[row+1][col-1]) {
			row++;
			col--;
			cnt++;
			cross_down_left(row, col, dir);
		}
	}

}
