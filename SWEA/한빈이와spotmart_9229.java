import java.util.Scanner;
 
public class Solution {
 
    static int result[];
    static int arr[];
    static int weight;
    static int n;
    static int sum;
    static int max=0;
     
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
         
        int t = sc.nextInt();
        for(int tc=1; tc<=t; tc++) {
            n = sc.nextInt();
            arr = new int[n];
            result = new int[n];
            weight = sc.nextInt();
            for(int i=0; i<n; i++) {
                arr[i] = sc.nextInt();
            }
            max = 0;
            comb(0,0);
            System.out.print("#" + tc + " ");
            if(max==0) {
                System.out.println("-1");
            }
            else {
                System.out.println(max);
            }
        }//tc
    }//main
 
    static void comb(int idx, int start) {
        if(idx==2) {
            sum = 0;
            for(int i=0; i<2; i++) {
                sum += result[i];
            }
            if(sum<=weight) {
                max = Math.max(sum, max);
            }
            return;
        }
        for(int i=start; i<n; i++) {
            result[idx] = arr[i];
            comb(idx+1, i+1);
        }
    }
}