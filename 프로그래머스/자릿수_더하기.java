import java.util.*;

public class 자릿수_더하기 {
    public int solution(int n) {
        int answer = 0;

        while(n>10) {
        	int rest = n%10;
        	answer += rest;
        	n /= 10;
        }

        return answer;
    }
}