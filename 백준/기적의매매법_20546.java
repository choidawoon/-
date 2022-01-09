import java.util.Scanner;

public class 기적의매매법_20546 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int bnp_cash = sc.nextInt();
		int timing_cash = bnp_cash;

		int bnp = 0;
		int timing = 0;

		int up_cnt = 0;
		int down_cnt = 0;

		int arr[] = new int[14];
		for (int i = 0; i < 14; i++) {
			boolean buy = false;
			arr[i] = sc.nextInt();
			if (bnp_cash >= arr[i]) {
				bnp = bnp + bnp_cash / arr[i];
				buy = true;
			}
			if (buy) {
				bnp_cash = bnp_cash - (arr[i] * bnp);
			}
		}

		for (int i = 1; i < 14; i++) {
//			System.out.println(timing_cash);
			boolean buy = false;
			if (arr[i] > arr[i - 1]) {
				up_cnt++;
				down_cnt = 0;
			} else if (arr[i] < arr[i - 1]) {
				down_cnt++;
				up_cnt = 0;
			} else {
				up_cnt = 0;
				down_cnt = 0;
			}

			if (down_cnt >= 3 && timing_cash >= arr[i]) {
				timing = timing + timing_cash / arr[i];
				buy = true;
			}
			if (buy) {
				timing_cash = timing_cash - (arr[i] * timing);
			}
			if (up_cnt == 3 && timing > 0) {
				timing_cash = timing * arr[i];
				timing = 0;
			}
//			System.out.println("up_cnt: " + up_cnt + "\t down_cnt: " + down_cnt);
		}
		int bnp_result = (bnp * arr[13]) + bnp_cash;
		int timing_result = (timing * arr[13]) + timing_cash;

		if (bnp_result > timing_result)
			System.out.println("BNP");
		else if (timing_result > bnp_result)
			System.out.println("TIMING");
		else
			System.out.println("SAMESAME");

	}

}
