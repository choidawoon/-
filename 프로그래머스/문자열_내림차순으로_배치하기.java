import java.util.Arrays;

class ���ڿ�_������������_��ġ�ϱ� {
    public String solution(String s) {
        String answer = "";
        
        char[] carr = s.toCharArray();
        Arrays.sort(carr);
        
        StringBuilder sb = new StringBuilder();
        for(int i=s.length(); i>0; i--) {
        	sb.append(carr[i-1]);
        }
        
        answer = sb.toString();
        return answer;
    }
}