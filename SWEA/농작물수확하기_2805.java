import java.util.Arrays;
import java.util.Scanner;
 
class Solution {
 
    public static void main(String args[]) {
 
        Scanner sc = new Scanner(System.in);
 
        int T = sc.nextInt();
        for(int tc=0; tc<T; tc++) {
        int n = sc.nextInt();
        int arr[][] = new int[n][n];
        for(int i=0; i<n; i++) {
            String s = sc.next();
            for(int j=0; j<n; j++) {
                arr[i][j] =  s.charAt(j) - '0';
            }
        }
         
        int center = n/2;
        int center_col = n/2;
        int center_row = n/2;
        int sum = 0;
         
            for(int i=0; i<n; i++) {
                for(int j=0; j<n; j++) {
                    if(Math.abs(i-center_row) + Math.abs(j-center_col) <= center) {
                        sum += arr[i][j];
                    }
                }
            }
         
        System.out.println("#" + (tc+1) + " " +sum);
         
        }
    }
 
}