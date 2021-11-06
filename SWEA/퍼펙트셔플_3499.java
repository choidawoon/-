import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.concurrent.SynchronousQueue;
 
public class Solution {
 
    public static void main(String[] args) {
        // TODO Auto-generated method stub
 
        Scanner sc = new Scanner(System.in);
 
        int t = sc.nextInt();
 
        for (int tc = 0; tc < t; tc++) {
 
            int n = sc.nextInt();
 
            Queue<String> q1 = new LinkedList<>();
            Queue<String> q2 = new LinkedList<>();
            String[] arr = new String[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.next();
            } // n
 
            if (n % 2 == 1) {
                String first[] = new String[n / 2 + 1];
                String second[] = new String[n / 2];
                for (int i = 0; i <= n / 2; i++) {
                    first[i] = arr[i];
                    q1.add(first[i]);
                }
                for (int j = 0; j < n / 2; j++) {
                    second[j] = arr[j + n / 2 + 1];
                    q2.add(second[j]);
//                  System.out.println("나 q1" + q1);
//                  System.out.println("나 q2" + q2);
                }
            } else {
                String first[] = new String[n / 2];
                String second[] = new String[n / 2];
                for (int i = 0; i < n / 2; i++) {
                    first[i] = arr[i];
                    q1.add(first[i]);
                }
                for (int j = 0; j < n / 2; j++) {
                    second[j] = arr[j + n / 2];
                    q2.add(second[j]);
                }
//              System.out.println("나 q3" + q1);
//              System.out.println("나 q4" + q2);
            } // else
            System.out.print("#" + (tc + 1) + " ");
            for (int k = 1; k <= n; k++) {
                if (k % 2 == 1) {
                    System.out.print(q1.poll() + " ");
                } else
                    System.out.print(q2.poll() + " ");
            }
            System.out.println();
 
        } // tc
 
    }
 
}