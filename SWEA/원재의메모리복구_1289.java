import java.util.Scanner;
 
public class Solution {
 
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
 
        int t = sc.nextInt();
 
        for (int tc = 1; tc <= t; tc++) {
 
            String str = sc.next();
            char c = '0';
            int cnt = 0;
 
            for (int i = 0; i < str.length(); i++) {
                if (c != str.charAt(i)) {
                    c = str.charAt(i);
                    cnt++;
                }
            }
            System.out.println("#" + tc + " " + cnt);
        }
    }
}