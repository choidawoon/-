import java.util.ArrayList;
import java.util.Scanner;

public class Áö¿ì°³_21756 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		ArrayList<Integer> arr = new ArrayList<Integer>();
		
		for(int i=1; i<=N; i++)
			arr.add(i);
		
		while(arr.size()>=2) {
			for(int i=0; i<arr.size(); i++)
				arr.remove(i);
		}
		System.out.println(arr.get(0));
	}

}
