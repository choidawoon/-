import java.util.Scanner;

public class bingo {
	static int map[][];
	static int cnt;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		map = new int[5][5];

		cnt = 0;

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				map[i][j] = sc.nextInt();
			}
		}

		int num[] = new int[25];
		for (int i = 0; i < 25; i++) {
			num[i] = sc.nextInt();
		}

		for (int i = 0; i < 25; i++) {
			for (int j = 0; j < 5; j++) {
				for (int k = 0; k < 5; k++) {
					if (map[j][k] == num[i]) {
						map[j][k] = 0;
					}
				}
			}

			rowcheck();
			colcheck();
			rightcross();
			leftcross();

			if (cnt >= 3) {
				System.out.println(i + 1);
				break;
			}
			cnt = 0;
		}

	}// main

	static void rowcheck() {
		for (int i = 0; i < 5; i++) {
			int zcnt = 0;
			for (int j = 0; j < 5; j++) {
				if (map[j][i] == 0) {
					zcnt++;
				}
			}
			if (zcnt == 5) {
				cnt++;
			}
		}
	}

	static void colcheck() {
		for (int i = 0; i < 5; i++) {
			int zcnt = 0;
			for (int j = 0; j < 5; j++) {
				if (map[i][j] == 0)
					zcnt++;
			}
			if (zcnt == 5) {
				cnt++;
			}
		}
	}

	static void rightcross() {
		int zcnt = 0;
		for (int i = 0; i < 5; i++) {
			if (map[i][i] == 0)
				zcnt++;
		}
		if(zcnt == 5) {
			cnt++;
		}
	}

	static void leftcross() {
		int zcnt = 0;
		for (int i = 0; i < 5; i++) {
			if (map[i][4 - i] == 0)
				zcnt++;
		}
		if (zcnt == 5)
			cnt++;
	}

}
