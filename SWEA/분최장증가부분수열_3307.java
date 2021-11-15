import java.util.Scanner;
 
public class Solution {
 
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
         
        // 2 3 5 4 6 1
        // 1 2 3 3 4 1
        int t = sc.nextInt();
         
        for(int tc=1; tc<=t; tc++) {
             
            int N = sc.nextInt();
            int[] arr = new int[N+1];
            int[] memo = new int[N+1];
             
            for(int i=1; i<=N; i++) {
                arr[i] = sc.nextInt();
            }
             
            for(int i=1; i<=N; i++) {
                for(int j=0; j<i; j++) {
                    if(arr[i]>arr[j] && memo[j]+1 > memo[i]) {
                        memo[i] = memo[j] + 1;
                    }
                }
            }
             
//          for(int i=1; i<=N; i++) {
//              System.out.println(memo[i]);
//          }
             
            int max = 0;
            for(int i=1; i<=N; i++) {
                max = Math.max(max, memo[i]);
            }
             
            System.out.println("#" + tc + " " + max);
             
        }//tc
    }
 
}