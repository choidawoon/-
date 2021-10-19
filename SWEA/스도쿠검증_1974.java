import java.util.Scanner;
 
import javax.swing.plaf.synth.SynthSeparatorUI;
 
public class Solution {
 
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
         
        int t =sc.nextInt();
         
        for(int tc=1; tc<=t; tc++) {
             
            int[][] map = new int[9][9];
            boolean check = false;
             
            for(int i=0; i<9; i++) {
                for(int j=0; j<9; j++) {
                    map[i][j] = sc.nextInt();
                }
            }
             
            for(int i=0; i<9; i++) {
                int arr[] = new int[9];
                for(int j=0; j<9; j++) {
                    arr[map[i][j]-1]++;
                }
                 
                for(int j=0; j<9; j++) {
                    if(arr[j]==0) {
                        check = true;
                    }
                }
            }
             
            for(int i=0; i<9; i++) {
                int arr[] = new int[9];
                for(int j=0; j<9; j++) {
                    arr[map[j][i]-1]++;
                }
                 
                for(int j=0; j<9; j++) {
                    if(arr[j]==0) {
                        check=true;
                    break;
                    }
                }
            }
             
            for(int i=0; i<3; i++) {
                for(int j=0; j<3; j++) {
                    int[] arr = new int[9];
                    for(int k=0; k<3; k++) {
                        for(int a=0; a<3; a++) {
                            arr[map[i*3+k][j*3+a]-1]++;
                        }
                    }
                    for(int l=0; l<9; l++) {
                        if(arr[l]==0)
                            check= true;
                        break;
                    }
                }
            }
             
            System.out.print("#" + tc + " ");
             
            if(check)
                System.out.println("0");
            else
                System.out.println("1");
             
             
        }//tc
    }
 
}