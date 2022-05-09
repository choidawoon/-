import java.util.Arrays;

class 문자열_내림차순으로_배치하기 {
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