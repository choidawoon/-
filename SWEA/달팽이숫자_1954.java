import java.util.Scanner;
 
public class Solution {
 
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        StringBuilder sb = new StringBuilder();
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
 
        for (int tc = 0; tc < t; tc++) {
 
            int n = sc.nextInt();
            int arr[][] = new int[n][n];
 
            int row = 0;
            int col = -1;
            int h = n;
            int cnt = 1;
 
            while (cnt <= (n * n)) {
 
                // 오른쪽으로 가
                for (int i = 0; i < h; i++) {
                    arr[row][++col] = cnt;
                    cnt++;
                }
                h--;
                // row=0 col=2 h=2;
 
                // 밑으로 가
                for (int i = 0; i < h; i++) {
                    arr[++row][col] = cnt;
                    cnt++;
                } // row=2 col=2 h=2;
 
                // 왼쪽으로 가
                for (int i = 0; i < h; i++) {
                    arr[row][--col] = cnt;
                    cnt++;
                }
                h--;
                // row=2 col=0 h=1
 
                // 올라가
                for (int i = 0; i < h; i++) {
                    arr[--row][col] = cnt;
                    cnt++;
                }
 
            }//while
            System.out.println("#" + (tc+1));
            for(int i=0; i<n; i++) {
                for(int j=0; j<n; j++) {
                    System.out.print(arr[i][j] + " ");
                }
            System.out.println();
            }
             
         
             
             
        }//tc
 
    }
 
}