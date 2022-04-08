import java.awt.Point;
import java.util.ArrayList;
import java.util.Scanner;

public class chicken_delivery {
	static int N;
	static int M;
	static int[][] map;
	static Point[] result;
	static ArrayList<Point> chicken_houses = new ArrayList<>();
	static ArrayList<Point> houses = new ArrayList<>();

	static int min = Integer.MAX_VALUE;
	static int temp;
	static int sum;
	static int dist;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();	
		M = sc.nextInt();

		map = new int[N][N];
		result = new Point[N];

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				map[i][j] = sc.nextInt();
				if (map[i][j] == 1)	// 집일경우에 집 리스트에 넣어준다
					houses.add(new Point(i, j));
				if (map[i][j] == 2)	// 치킨집일 경우에 치킨집 리스트에 넣어준다
					chicken_houses.add(new Point(i, j));
			}
		}

		comb(0, 0);
		System.out.println(min);
	}

	static void comb(int idx, int start) {	// 조합
		if (idx == M) {
			sum = 0;
			for (int i = 0; i < houses.size(); i++) {

				Point house = houses.get(i);
				temp = Integer.MAX_VALUE;

				for (int j = 0; j < M; j++) {	// 치킨집 총 개수중에 M개만 선택했을경우 조합부분
					Point chicken = result[j];
					dist = Math.abs(house.x - chicken.x) + Math.abs(house.y - chicken.y);
					temp = Math.min(temp, dist);
				}

				sum += temp;

			}
			min = Math.min(min, sum);	//거리의 합의 최소값을 계속해서 갱신해줌
			return;
		}
		for (int i = start; i < chicken_houses.size(); i++) {
			result[idx] = chicken_houses.get(i);
			comb(idx + 1, i + 1);
		}
	}

}
