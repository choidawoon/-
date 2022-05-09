import java.util.Arrays;

class 정수_내림차순으로_배치하기 {
    public long solution(long n) {
        long answer = 0;
        int cnt = 0;
        long tmp = n;
        
        while(tmp>0) {
        	cnt++;
        	tmp = tmp/10;
        }
        
        long[] arr = new long[cnt];
        int idx = cnt;
        
        for(int i=0; i<cnt; i++) {
        	long mul  = 1;
        	for(int j=1; j<idx; j++) {
        		mul *= 10;
        	}
        	idx--;
        	arr[i] = n/mul;
        	n = n-(mul*arr[i]);
        }
        
        Arrays.sort(arr);
        StringBuilder sb = new StringBuilder();
        for(int i=cnt-1; i>-1; i--) {
        	sb.append(arr[i]);
        }
        
        answer = Long.parseLong(sb.toString());
        return answer;
    }
}