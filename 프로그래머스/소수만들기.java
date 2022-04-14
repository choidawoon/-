import java.util.Arrays;

class 소수만들기 {
	static int result[];
	static int arr[];
	static int N;
	static int answer;
    public int solution(int[] nums) {
        answer = 0;

        N = nums.length;
        arr = new int[N];
        result = new int[N];
        for(int i=0; i<nums.length; i++) {
        	arr[i] = nums[i];
        }
        
        Arrays.sort(arr);
        comb(0,0);
        

        return answer;
    }
    static void comb(int idx, int start) {
		if(idx == 3) {
			int sum = 0;
			for(int i=0; i<3; i++) {
				sum += result[i];
			}
			boolean check = true;
			for(int i=2; i<sum; i++) {
				if(sum%i==0) {
					check = false;
				}
			}
			if(check)
				answer++;
			return;
		}
		
		for(int i=start; i<N; i++) {
			result[idx] = arr[i];
			comb(idx+1, i+1);
		}
		
	}
}