import java.util.Scanner;
 
public class Solution {
 
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
 
        int t = sc.nextInt();
 
        for (int tc = 1; tc <= t; tc++) {
 
            int n = sc.nextInt();
            int d = sc.nextInt();
            int cnt = 0;
            int distance = 0;
 
            int[] portal = new int[n];
            for (int i = 0; i < n; i++) {
                portal[i] = sc.nextInt();
            }
 
            if (portal[0] == 0) {
                portal[0] = 1;
                cnt++;
            }
            if (portal[n - 1] == 0) {
                portal[n - 1] = 1;
                cnt++;
            }
 
            for (int i = 0; i < n; i++) {
                if (portal[i] == 1) {
                    distance = 0;
                }
                if (distance == d && portal[i] != 1) {
                    portal[i] = 1;
                    cnt++;
                    distance = 0;
                }
                distance++;
            }
            System.out.println("#" + tc + " " + cnt);
        } // tc
 
    }
}