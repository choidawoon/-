import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.concurrent.PriorityBlockingQueue;

public class Algo1_광주_4반_최다운 {
	
	static class su implements Comparable<su>{
		//abcdefghijklmnopqrstuvwxyz
		// one two three four five six seven eight nine ten	zero
		//	5	10	9		3	2	7	6		1	4	8	11
		// eight	five	four	nine	one	seven	six	ten	three	two	zero
		String english;
		int n;
	
		public su(String english, int n) {
			super();
			this.english = english;
			this.n = n;
		}

		@Override	//출력은 숫자만 하면 되기에 n만 출력
		public String toString() {
			return n + " ";
		}
		
		@Override	// 문자열을 비교해서 정렬해준다
		public int compareTo(su o) {
			if(!this.english.equals(o.english)) {
				return this.english.compareTo(o.english);
			}
			return 0;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		String[] str = new String[M-N+1];
		int[] arr = new int[M-N+1];
		PriorityQueue<su> pq = new PriorityQueue<>();
		int j = 0;
		
		// N부터 M까지 입력받은것을 우선 두자리인지 한자리인지 파악하고 그 수에 맞게 영어로 바꿔서 스트링배열과  숫자자체를 넣는 배열에 넣는다.
		for(int i=N; i<=M; i++) {
			if(i/10>=1) {
				String t;
				String o;
				int a = i/10;
				int b = i%10;
				
				if(a==1) t = "one";
				else if(a==2) t = "two";
				else if(a==3) t = "three";
				else if(a==4) t = "four";
				else if(a==5) t = "five";
				else if(a==6) t = "six";
				else if(a==7) t = "seven";
				else if(a==8) t = "eight";
				else t = "nine";
				
				if(b==0) o = "zero";
				else if(b==1) o = "one";
				else if(b==2) o = "two";
				else if(b==3) o = "three";
				else if(b==4) o = "four";
				else if(b==5) o = "five";
				else if(b==6) o = "six";
				else if(b==7) o = "seven";
				else if(b==8) o = "eight";
				else o = "nine";
				String st = t + " " + o;
				str[j] = st;
			}
			else {
				int c = i;
				String s;
				if(c==0) s = "zero";
				else if(c==1) s = "one";
				else if(c==2) s = "two";
				else if(c==3) s = "three";
				else if(c==4) s = "four";
				else if(c==5) s = "five";
				else if(c==6) s = "six";
				else if(c==7) s = "seven";
				else if(c==8) s = "eight";
				else s = "nine";
				str[j] = s;
			}
			
			arr[j] = i;
			j++;
			
		}//nm
		
		//아까 배열에 넣어놓은것을 priortyqueue를 사용해서 넣어준다
		//priortyqueue는 위에 compare해놓은 부분에서 정렬을 해서 알아서 넣어주기에
		for(int i=0; i<M-N+1; i++) {
			pq.add(new su(str[i],arr[i]));
		}
		
		
		int count = 0;
		while(!pq.isEmpty()) {
			if(count%10==0 && count!=0) {	// 10개 단위로 줄바꿈을 위해
				System.out.println();
			}
			System.out.print(pq.poll());
			count++;
		}
		
	}
}


