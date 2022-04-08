import java.util.Scanner;
 
public class Solution {
 
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
 
        int t = sc.nextInt();
 
        for (int tc = 1; tc <= t; tc++) {
            int n = sc.nextInt();
            long benefit = 0;
            int max = 0;
            int[] arr = new int[n];
 
            for (int j = 0; j < n; j++) {
                arr[j] = sc.nextInt();
            }
            for (int j = n - 1; j >= 0; j--) {
                if (arr[j] > max)
                    max = arr[j];
                benefit += max - arr[j];
            }
 
            System.out.println("#" + tc + " " + benefit);
 
        } // tc
    }
}