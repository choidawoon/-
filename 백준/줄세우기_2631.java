import java.util.Scanner;

public class 줄세우기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		입력
//		7
//		3, 7, 5, 2, 6, 1, 4
//		
//		Solution
//		최장길이 수열을 구해준후 최장길이 수열에 해당하지 않는 수들만 위치를 바꿔주면 최소횟수로 줄을 세우는게 가능!

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt(); // N 입력 받음
		int[] arr = new int[N];

		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt(); // 초기배열 입력받음
		}

		int[] memo = new int[N];

		int max = 0;
		for (int i = 0; i < N; i++) { // 최장길이 수열 구하기
			memo[i] = 1; // 기본적으로 자기 자신은 1의 값을 갖는다.
			for (int j = 0; j < i; j++) {
				if (arr[j] < arr[i]) { // 현재의 위치 배열에서 전에 있는 요소들중 자신의 값보다 작은 것들중 가장 큰 값을 지닌것에 +1해서 저장해 나간다.
					memo[i] = Math.max(memo[i], memo[j] + 1);
				}
			}
			max = Math.max(max, memo[i]); // 최장길이 수열을 계속 초기화 시켜줌
		}

		System.out.println(N - max); // N개에서 최장길이 수열의 크기만큼은 두고 나머지 요소들만 움직이면 되므로

	}
}
