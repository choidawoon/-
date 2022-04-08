import java.awt.Point;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
 
public class Solution {
    static List<Point> visit = new ArrayList<>();
    static Point house;
    static Point comp;
    static int[] TF;
    static Point[] arr;
    static boolean[] barr;
    static int N;
    static int dist;
    static int min_1;
     
    public static void main(String[] args) {
        // TODO Auto-generated method stub
         
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
         
        for(int tc=1; tc<=t; tc++) {
            min_1 = Integer.MAX_VALUE;
            N = sc.nextInt();
            TF = new int[N];
            barr = new boolean[N];
            comp = new Point(sc.nextInt(), sc.nextInt());
            house = new Point(sc.nextInt(), sc.nextInt());
            arr = new Point[N];
             
            for(int i=0; i<N; i++) {
                arr[i] = new Point(sc.nextInt(), sc.nextInt());
            }
             
            perm(0);
            System.out.println("#" + tc + " " + min_1);
        }//tc
         
    }
     
    static void perm(int idx) {
        if(idx==N) {
                dist = 0;
                Point cur = comp;
            for(int i=0; i<N; i++) {
                Point p = arr[TF[i]];
                    dist += Math.abs(cur.x - p.x) + Math.abs(cur.y - p.y);
                    cur = p;
            }
            dist += Math.abs(cur.x - house.x) + Math.abs(cur.y - house.y);
            min_1 = Math.min(min_1, dist);
            return;
        }
        for(int i=0; i<N; i++) {
            if(barr[i])
                continue;
            TF[idx] = i;
            barr[i] = true;
            perm(idx+1);
            barr[i] = false;
        }   
    }
}