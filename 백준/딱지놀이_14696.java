import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		for(int tc=0; tc<t; tc++) {
			
			int a_n = sc.nextInt();
			int[] arr = new int[a_n];
			int a_star_cnt = 0;
			int a_cir_cnt = 0;
			int a_squ_cnt = 0;
			int a_tri_cnt = 0;
			
			for(int i=0; i<a_n; i++) {
				arr[i] = sc.nextInt();
				if(arr[i]==4)
					a_star_cnt++;
				if(arr[i]==3)
					a_cir_cnt++;
				if(arr[i]==2)
					a_squ_cnt++;
				if(arr[i]==1)
					a_tri_cnt++;
			}
			
			int b_n = sc.nextInt();
			int[] brr = new int[b_n];
			int b_star_cnt = 0;
			int b_cir_cnt = 0;
			int b_squ_cnt = 0;
			int b_tri_cnt = 0;
			
			for(int i=0; i<b_n; i++) {
				brr[i] = sc.nextInt();
				if(brr[i]==4)
					b_star_cnt++;
				if(brr[i]==3)
					b_cir_cnt++;
				if(brr[i]==2)
					b_squ_cnt++;
				if(brr[i]==1)
					b_tri_cnt++;
			}
			
			if(a_star_cnt>b_star_cnt) 
				System.out.println("A");
			
			else if(b_star_cnt>a_star_cnt)
				System.out.println("B");
			
			//if(a_star_cnt == b_star_cnt) 
			else{
				if(a_cir_cnt>b_cir_cnt) 
					System.out.println("A");
				
				else if(b_cir_cnt>a_cir_cnt)
					System.out.println("B");
				
				//if(a_cir_cnt == b_cir_cnt) 
				else{
					if(a_squ_cnt>b_squ_cnt) 
						System.out.println("A");
					
					else if(b_squ_cnt>a_squ_cnt)
						System.out.println("B");
					
					//if(a_squ_cnt == b_squ_cnt)
					else{
						if(a_tri_cnt>b_tri_cnt) 
							System.out.println("A");
						
						else if(b_tri_cnt>a_tri_cnt)
							System.out.println("B");
						
						else
							System.out.println("D");
					}
				}
			}
		
		}//tc
		
	}

}