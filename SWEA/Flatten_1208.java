import java.util.Arrays;
import java.util.Scanner;
 
class Solution {
 
    public static void main(String args[]) {
 
        Scanner sc = new Scanner(System.in);
        for(int tc=0; tc<10; tc++) {
            int result = 0;
             
            int dump = sc.nextInt();
            int arr[]  = new int[100];
             
            for(int i=0; i<100; i++) {
                arr[i] =  sc.nextInt();
            }
             
             
            for(int i=0; i<dump; i++) {
                Arrays.sort(arr);
                arr[0] ++;
                arr[99] --;
            }
            Arrays.sort(arr);
            result = arr[99] - arr[0];
             
            System.out.println("#" + (tc+1) + " " + (arr[99]-arr[0]));
             
        }
         
         
    }
}