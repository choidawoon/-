import java.util.Scanner;
 
public class Solution {
 
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
 
        for (int tc = 1; tc <= 10; tc++) {
 
            int[][] map = new int[100][100];
 
            int n = sc.nextInt();
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    map[i][j] = sc.nextInt();
                }
            }
 
            // N극
            // 1는 밑으로 ->엔
            // 2는 위로 올라감 ->에스
            // S극
            // 맵에서 1을 찾았을때 그 x좌표에서 밑에 2가 있으면 교착상태 카운트 증가
            // 2를 찾았을때 그 y좌표보다 위에 있는 1은 다 0으로 바꿔버림.
            int cnt = 0;
 
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (map[i][j] == 1) {
                        int k = i + 1;
                        if (k < 100) {
                            while (true) {
                                if (k >= 100)
                                    break;
 
                                if (map[k][j] == 2) {
                                    cnt++;
                                    for (int l = i + 1; l < k; l++) {
                                        if (map[l][j] == 1)
                                            map[l][j] = 0;
                                    }
                                    break;
                                }
                                k++;
                            } // while
                        }
                    }
                }
            }
 
            System.out.println("#" + tc + " " + cnt);
 
        } // tc
    }
}