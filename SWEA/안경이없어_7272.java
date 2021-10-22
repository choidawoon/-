import java.util.Queue;
import java.util.Scanner;
 
public class Solution {
 
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
 
        int t = sc.nextInt();
        for (int tc = 1; tc <= t; tc++) {
            String a_str = sc.next();
            String b_str = sc.next();
            char[] arr = a_str.toCharArray();
            char[] brr = b_str.toCharArray();
            boolean check = false;
 
            for (int i = 0; i < a_str.length(); i++) {
                if (arr[i] == 'B')
                    arr[i] = 2;
                else if (arr[i] == 'A' || arr[i] == 'D' || arr[i] == 'O' || arr[i] == 'P' || arr[i] == 'Q'
                        || arr[i] == 'R')
                    arr[i] = 1;
                else
                    arr[i] = 3;
            }
 
            for (int i = 0; i < b_str.length(); i++) {
                if (brr[i] == 'B')
                    brr[i] = 2;
                else if (brr[i] == 'A' || brr[i] == 'D' || brr[i] == 'O' || brr[i] == 'P' || brr[i] == 'Q'
                        || brr[i] == 'R')
                    brr[i] = 1;
                else
                    brr[i] = 3;
            }
 
            if (arr.length == brr.length) {
                for (int i = 0; i < arr.length; i++) {
                    if (arr[i] != brr[i]) {
                        check = true;
                    }
                }
                if (!check)
                    System.out.println("#" + tc + " SAME");
                else
                    System.out.println("#" + tc + " DIFF");
            } else
                System.out.println("#" + tc + " DIFF");
        } // tc
 
    }
}