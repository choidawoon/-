import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ť_10845 {

   public static void main(String[] args) {
      // TODO Auto-generated method stub
	   int b=0;
    Queue<Integer> que = new LinkedList<>();
    
    Scanner sc = new Scanner(System.in);
    int cnt = sc.nextInt();
    StringBuilder sb = new StringBuilder();
    for(int i=0; i<cnt; i++) {
    	
    	String a = sc.next();
    	if(a.equals("push")) {
    		b = sc.nextInt();
    		que.add(b);
    	}else if(a.equals("front")){
    		sb.append(que.isEmpty()?-1:que.peek() + "\n");
    	}else if(a.equals("back")) {
    		sb.append(que.isEmpty()?-1:b + "\n");
    	}else if(a.equals("size")) {
    		sb.append(que.size() + "\n");
    	}else if(a.equals("pop")) {
    		sb.append(que.isEmpty()?-1:que.poll() + "\n");
    	}else if(a.equals("empty")) {
    		sb.append(que.isEmpty()?1:0 + "\n");
    	}
    }
    System.out.println(sb);
    
   }
}