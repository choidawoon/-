import java.util.*;

public class �ڸ���_���ϱ� {
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