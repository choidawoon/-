import java.util.LinkedList;
import java.util.Scanner;
import java.util.concurrent.SynchronousQueue;
 
public class Solution {
 
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
        // System.out.println("암호문길이 입력");
 
        for (int testcase = 1; testcase <= 10; testcase++) {
 
            LinkedList<Integer> list = new LinkedList<Integer>();
            int n = sc.nextInt();// 암호문길이
 
            for (int i = 0; i < n; i++) {
                // System.out.println("암호문안에 들어갈 숫자 입력");
                int x = sc.nextInt();// 길이안에 들어갈 숫자들
                list.add(x);
            }
            // System.out.println("테스트케이스 입력");
 
            int t = sc.nextInt();
 
            for (int tc = 1; tc <= t; tc++) {
                String s = sc.next();// 쓸모없는 문자 받기용
                // System.out.println("몇번째에 넣을거임?");
                int insert = sc.nextInt();// 몇번째
                // System.out.println("몇개 넣을거야?");
                int insertcount = sc.nextInt();// 몇개
 
                for (int i = 0; i < insertcount; i++) {
                    // System.out.println("넣을 숫자입력");
                    int insertnumber = sc.nextInt();// 넣을숫자 입력
                    list.add((insert + i), insertnumber);
                }
 
            }
            System.out.print("#" + testcase + " ");
            for (int k = 0; k < 10; k++) {
                System.out.print(list.get(k) + " ");
            }
            System.out.println();
 
        }
 
    }
 
}