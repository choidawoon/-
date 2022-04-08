import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
 
class Solution {
 
    public static void main(String args[]) {
 
         
        Scanner sc = new Scanner(System.in);
        Queue<Integer> queue;
        //int T = sc.nextInt();
         
        for(int tc=0; tc<10; tc++) {
            queue = new LinkedList<>();
            int useless = sc.nextInt();
             
             
            for(int i=0; i<8; i++) {
                int a = sc.nextInt();
                queue.add(a);
            }
             
            int cnt = 1;
            while(true) {
                 
                if(cnt==6) {
                    cnt=1;
                }
                 
                int x= queue.poll() - cnt;
                 
                if(x<=0) {
                    queue.add(0);
                    break;
                }
                else {
                queue.add(x);
                cnt++;
                }
                 
            }//while
             
            System.out.print("#" + (tc+1) + " ");
            for(int j=0; j<8; j++) {
                System.out.print(queue.poll() + " ");
            }
            System.out.println();
             
        }//tc
         
    }
}