import java.util.Scanner;

public class 원점으로_집합_8458 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		for(int tc=1; tc<=t; tc++) {
			
			int N = sc.nextInt();
			int[] row = new int[N];
			int[] col = new int[N];
			int[] sum = new int[N];
			int odd = 0;
			int even = 0;
			int max = 0;
			
			for(int i=0; i<N; i++) {
				row[i] = sc.nextInt();
				col[i] = sc.nextInt();
				sum[i] = Math.abs(row[i]) + Math.abs(col[i]);
				max = Math.max(max, sum[i]);
				if(sum[i]%2!=0)
					odd++;
				else if(sum[i]%2==0)
					even++;
			}
			
			if(odd>=1 && even>=1)
				System.out.println("#" +  tc + " -1");
			else {
				int tmp = 0;	// 1+2+....을 해줄 임시 저장값 - > 움직일 수 있는 칸
				int result = 0;	// 횟수 -> 우리가 원하는 답
				while(true) {
//								1. 움직일수 있는 칸의 개수가 총 움직여야할 칸의 개수보다 크고
//								2. 움직일수 있는 칸의 개수에서 움직여야할 칸의 개수를 뺀값을 짝수로 나누어 떨어지면 원점으로 도착가능
					if(max<=tmp && (tmp-max)%2==0)
						break;
					
					result++;
					tmp += result;
				}
				System.out.println("#" + tc + " " + result);
			}
			
		}//tc
	}

}
