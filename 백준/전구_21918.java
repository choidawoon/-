import java.util.Scanner;

public class 전구_21918 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		int arr[] = new int[N];
		
		for(int i=0; i<N; i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int i=0; i<M; i++) {
			int swit = sc.nextInt();
			
			switch(swit) {
			case 1:{
				int number = sc.nextInt()-1;
				int state = sc.nextInt();
				arr[number] = state;
				break;
			}
			case 2:{
				int start = sc.nextInt()-1;
				int end = sc.nextInt()-1;
				for(int j=start; j<=end; j++) {
					if(arr[j]==1)
						arr[j] = 0;
					else
						arr[j] = 1;
				}
				break;
			}
			case 3:{
				int start = sc.nextInt()-1;
				int end = sc.nextInt()-1;
				for(int j=start; j<=end; j++)
					arr[j] = 0;
				break;
			}
			case 4:{
				int start = sc.nextInt()-1;
				int end = sc.nextInt()-1;
				for(int j=start; j<=end; j++)
					arr[j] = 1;
				break;
			}
			
			}//swit
		}//M
		
		for(int i=0; i<N; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
