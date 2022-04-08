import java.util.Scanner;
import java.util.concurrent.SynchronousQueue;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int bulb_cnt = sc.nextInt()+1;
		int[] bulb = new int[bulb_cnt];
		int idx = 0;
		for(int i=1; i<bulb_cnt; i++) {
			bulb[i] = sc.nextInt();
		}
		
		int student_cnt = sc.nextInt();
		
		for(int i=0; i<student_cnt; i++) {
			
			int sex = sc.nextInt();
			int swit = sc.nextInt();
			
			if(sex==1) {
				for(int j=swit; j<bulb_cnt; j+=swit) {
					if(bulb[j]==1)
						bulb[j]=0;
					else
						bulb[j]=1;
				}
			}
			
			else {
					idx = 1;
				while(true) {
					if(swit-idx < 1 || swit+idx >= bulb_cnt) {
						break;
					}
					if(bulb[swit-idx] != bulb[swit+idx]) { 
						break;
					}
					idx++;
				}//while
				idx--;
				
				for(int j=swit-idx; j<=swit+idx; j++) {
					if(bulb[j]==1)
						bulb[j]=0;
					else
						bulb[j]=1;
				}
			}	
		}//for student
		
		for(int i=1; i<bulb_cnt; i++) {
			System.out.print(bulb[i] + " ");
			if(i%20==0)
				System.out.println();
		}
		
	}
}