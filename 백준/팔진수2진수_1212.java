import java.util.Scanner;

public class 팔진수2진수_1212 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		char[] carr = str.toCharArray();
		int[] arr = new int[str.length()];
		
		StringBuilder result = new StringBuilder();
		
		for(int i=0; i<str.length(); i++) {
			arr[i] = carr[i] - '0';
				while(arr[i]>0) {
					StringBuilder sb = new StringBuilder();
					if(arr[i]>=4) {
						arr[i] = arr[i]-4;
						sb.append("1");
					}
					else if(i==0){
					}
					else
						sb.append("0");
					if(arr[i]>=2) {
						arr[i] = arr[i]-2;
						sb.append("1");
					}
					else if(i==0) {
					}
					else
						sb.append("0");
					if(arr[i]>=1) {
						arr[i] = arr[i]-1;
						sb.append("1");
					}
					else
						sb.append("0");
					result.append(sb);
			}
		}
		System.out.println(result);
	}
}
