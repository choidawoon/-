import java.util.Scanner;
 
public class Solution {
 
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
         
        int t = sc.nextInt();
        for(int tc=1; tc<=t; tc++) {
             
            int[] s_arr = new int[14];
            int[] d_arr = new int[14];
            int[] h_arr = new int[14];
            int[] c_arr = new int[14];
            int s_cnt = 0;
            int d_cnt = 0;
            int h_cnt = 0;
            int c_cnt = 0;
            boolean check = false;
             
            char[] arr = sc.next().toCharArray();
            for(int i=0; i<arr.length; i+=3) {
                if(arr[i]=='S') {
                    int a = (arr[i+1] -'0') * 10;
                    int b = arr[i+2] - '0';
                    s_arr[a+b]++;
                }
                 
                else if(arr[i]=='D') {
                    int a = (arr[i+1] -'0') * 10;
                    int b = arr[i+2] - '0';
                    d_arr[a+b]++;
                }
                 
                else if(arr[i]=='H') {
                    int a = (arr[i+1] -'0') * 10;
                    int b = arr[i+2] - '0';
                    h_arr[a+b]++;
                }
                 
                else {
                    int a = (arr[i+1] -'0') * 10;
                    int b = arr[i+2] - '0';
                    c_arr[a+b]++;
                }
            }
             
            for(int i=1; i<=13; i++) {
                if(s_arr[i]>1 || d_arr[i]>1 || h_arr[i]>1 || c_arr[i]>1)
                    check = true;
            }
             
            if(check)
                System.out.println("#" + tc + " ERROR");
            else {
                for(int i=1; i<=13; i++) {
                    if(s_arr[i]==0)
                        s_cnt++;
                    if(d_arr[i]==0)
                        d_cnt++;
                    if(h_arr[i]==0)
                        h_cnt++;
                    if(c_arr[i]==0)
                        c_cnt++;
                }
                System.out.println("#" + tc + " " + s_cnt + " " + d_cnt + " " + h_cnt + " " + c_cnt);
            }
 
        }//tc
    }
}