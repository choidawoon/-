import java.util.Scanner;

public class 과제안내신분_5597 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[30];
		for(int i=0; i<30; i++) {
			arr[i] = 1;
		}
		
		for(int i=0; i<28; i++) {
			int a = sc.nextInt();
			for(int j=0; j<30; j++) {
				if(j==a-1) {
					arr[j] = 0;
				}
			}
		}
		
		for(int i=0; i<30; i++) {
			if(arr[i]!=0) {
				System.out.println(i+1);
				arr[i] = 0;
			}
		}
		
	}
}
