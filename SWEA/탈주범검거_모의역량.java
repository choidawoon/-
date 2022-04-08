import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
 
class Pos{
    int y,x,type;
 
    public Pos(int y, int x,int type) {
        super();
        this.y = y;
        this.x = x;
        this.type=type;
    }
     
}
 
public class Solution {
    static int t,m,n,l;
    static int[][] map;
    static int[][] pipe={{},{0,1,2,3},{0,1},{2,3},{0,3},{1,3},{1,2},{0,2}};//상하좌우
    static int[] xpos= {0,0,-1,1};//상하좌우
    static int[] ypos= {-1,1,0,0};
    static Queue<Pos> q;
    public static void main(String[] args) {
         
        Scanner sc=new Scanner(System.in);
 
        t=sc.nextInt();
        for (int tc = 1; tc <=t; tc++) {
            q=new LinkedList<Pos>();
            n=sc.nextInt();
            m=sc.nextInt();
            map=new int[n][m];
            int r=sc.nextInt();
            int c=sc.nextInt();
            l=sc.nextInt();
            for (int i = 0; i < n; i++) {
                for (int j = 0; j <m; j++) {
                    map[i][j]=sc.nextInt(); 
                }
            }
         
            q.add(new Pos(r,c,map[r][c]));
            map[r][c]=-1;//방문 표시
            int answer=1;
            int time=1;
            while(q.size()!=0) {
                int len=q.size();
                if(time==l)break;// 도둑이 소요한 시간
                for (int i = 0; i < len;i++) {
                    Pos cur=q.poll();
                    int y=cur.y;
                    int x=cur.x;
                    int type=cur.type;//현재 위치에 존재하는 파이프 종류
//                  System.out.println("type"+type);
                    for (int d = 0; d < pipe[type].length; d++) {
                        //갈 수 있는 방향 
                        int dir=pipe[type][d];//상하좌우를 나타냄
//                      System.out.println("dir"+dir);
                        int yy=y+ypos[dir];
                        int xx=x+xpos[dir];
                        if(xx<0 || yy<0 || xx>=m || yy>=n)continue;
                        if(map[yy][xx]==0)continue;//파이프 없어서 못감
                        if(map[yy][xx]==-1)continue;//방문 된 곳이면 못간다
                        //이제 다음 칸의 파이프 방향이 맞으면 갈 수 있음 
                        int type2=map[yy][xx];
                        //상이면 다음칸 방향은 하가 있어야된다.
                        if(dir==0 && Arrays.binarySearch(pipe[type2],1)<0) {
                            continue;
                        }
                        if(dir==1 && Arrays.binarySearch(pipe[type2],0)<0) {
                            continue;
                        }
                        if(dir==2 && Arrays.binarySearch(pipe[type2],3)<0) {
                            continue;
                        }
                        if(dir==3 && Arrays.binarySearch(pipe[type2],2)<0) {
                            continue;
                        }
                         
                        // 다음칸과 방향이 매치되면 이동 가능
                        q.add(new Pos(yy,xx,map[yy][xx]));
                        answer+=1;
                        map[yy][xx]=-1;
                    }
                     
                }
                time++;
                 
            }
             
            System.out.printf("#%d %d\n",tc,answer);
        }
         
         
    }
}