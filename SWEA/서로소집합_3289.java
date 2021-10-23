import java.util.Scanner;
 
public class Solution {
 
        static int[] parent;
        static int[] rank;
        static int n;
        static int m;
     
     
    public static void main(String[] args) {
        // TODO Auto-generated method stub
         
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
         
        for(int tc=1; tc<=t; tc++) {
             
            n = sc.nextInt();
            m = sc.nextInt(); // 연산 몇개인지
            parent = new int[n+1];
            rank = new int[n+1];
             
            make();
             
            System.out.print("#" +  tc + " ");
             
            for(int i=0; i<m; i++) {
                int what = sc.nextInt();
                int a = sc.nextInt();
                int b = sc.nextInt();
                 
                if(what == 0) {
                    union(a, b);
                }
                if(what == 1) {
                    int check_a = find(a);
                    int check_b = find(b);
                    if(check_a==check_b)
                        System.out.print("1");
                    else
                        System.out.print("0");
                }
            }
             
            System.out.println();
             
        }//tc
         
         
    }//main
     
    static void make() {
        for(int i=1; i<=n; i++) {
            parent[i] = i;
        }
    }
     
    static int find(int num) {
        if(num==parent[num])
            return num;
        else
            return parent[num] = find(parent[num]);
    }
     
    static void union(int a, int b) {
        int pa = find(a);
        int pb = find(b);
        if(pa!=pb) {
            if(rank[pa]>rank[pb])
                parent[pb] = pa;
            else {
                parent[pa] = pb;
                if(rank[pa]==rank[pb])
                    rank[pb]++;
            }
        }
    }
}