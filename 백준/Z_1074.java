import java.util.Scanner;

public class Z {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();	// 맵생성할 크기 입력받음
		int R = sc.nextInt();	// 세로 위치 입력받음
		int C = sc.nextInt();	// 가로 위치 입력받음
		
		int cur_r = 0;
		int cur_c = 0;
		int cnt=0;
		
		while(N>0){
			int half = (int) Math.pow(2, N-1);	//	입력된 지도크기의 길이의 반
			int quadrant = half * half;	//	1사분면일때
			
			if(R < cur_r + half && C >= cur_c + half) {	//2사분면
				cnt += quadrant;	
				cur_c += half;
			}
			else if(R >= cur_r + half && C < cur_c + half) {
				cnt += 2*quadrant;	// 3사분면
				cur_r += half;
			}
			else if (R >= cur_r + half && C >= cur_c + half) {
				cnt += 3*quadrant;	// 4분면
				cur_r += half;
				cur_c += half;
			}
			N--;	// 2의 제곱근인 N을 줄여서 1/2의 역할을 함.
		}
		System.out.println(cnt);
	}

}
