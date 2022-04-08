import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;
 
public class Solution {
 
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
 
        int t = sc.nextInt();
        for (int tc = 1; tc <= t; tc++) {
 
            int n = sc.nextInt();
            int m = sc.nextInt();
 
            int arr[] = new int[n + m + 1];
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= m; j++) {
                    arr[i + j]++;
                }
            }
 
            int max = 0;
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= m; j++) {
                    max = Math.max(arr[i + j], max);
                }
            }
            System.out.print("#" + tc + " ");
            for (int i = 1; i <= n + m; i++) {
                if (arr[i] == max) {
                    System.out.print(i + " ");
                }
            }
            System.out.println();
 
        }
 
    }
 
}