import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;
 
 
public class Solution {
 
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
         
        for(int tc =1; tc<=10; tc++) {
            int n = sc.nextInt();
            int start = sc.nextInt();
            int result = 0;
            List<Integer>[] list = new LinkedList[101];
            for(int i=0; i<101; i++) {
                list[i] = new LinkedList<>();
            }
            for(int i=0; i<n/2; i++) {
                int from = sc.nextInt();
                int to = sc.nextInt();
                list[from].add(to);
            }
             
            Queue<Integer> qu = new LinkedList<>();
            boolean[] visit = new boolean[101];
            qu.add(start);
            visit[start] = true;
             
            while(!qu.isEmpty()) {
                int size = qu.size();
                result = 0;
                 
                for(int i=0; i<size; i++) {
                    int num = qu.poll();
                    result = Math.max(num, result);
                     
                    for(int j : list[num]) {
                        if(visit[j])
                            continue;
                        visit[j] = true;
                        qu.offer(j);
                    }   
                }
            }
             
            System.out.println("#" + tc + " " + result);
             
        }//tc
         
         
    }//main
 
    static class Node {
        int cnt;
        int num;
         
        Node(int num, int cnt){
            this.num = num;
            this.cnt = cnt;
        }
    }
     
}