import java.util.Scanner;

public class 도로와신호등_2980 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int L = sc.nextInt();
		int time = 0;
		int p = 0;

		for (int i = 0; i < N; i++) {
			int d = sc.nextInt();
			int r = sc.nextInt();
			int g = sc.nextInt();

			// t - 위치 d에 있는 신호등까지 걸린 시간
			time += d - p;
			p = d;

			int red = time % (r + g);
			if (red <= r) {
				// 빨간 불이 끝날때까지 대기
				time += r - red;
			}
		}
		System.out.println(time + (L - p));
	}
}
