import java.util.Arrays;
import java.util.Scanner;
 
import javax.swing.plaf.synth.SynthSeparatorUI;
 
import java.io.FileInputStream;
 
class Solution {
    public static void main(String args[]) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
         
        for(int a=0; a<T; a++) {
            int N = sc.nextInt();
            int M = sc.nextInt();
            int arr[][] = new int[N][N];
             
         
        for(int i=0; i<N; i++) {
            for(int j=0; j<N; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
         
        int max = 0;
        for(int i=0; i<N-M+1; i++) {
            for(int j=0; j<N-M+1; j++) {
                int sum = 0;
                 
                for(int k=0; k<M; k++) {
                    for(int l=0; l<M; l++) {
                        sum = sum + arr[i+k][j+l];
                    }
                }
                if(sum>max) {
                    max = sum;
                    }
                }
            }
        System.out.println("#" + (a+1) + " " + max);
        }
    }
}
 
//      (i,j) (i,j+1)
//      (i+1,j) (i+1,j+1)
 
 
//      M=1 25개 경우의수
//      M=2 16개 경우의수
//      M=3 9개 경우의수  -> (N-M+1)*(N-M+1)