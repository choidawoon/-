class ���_����_�������� {
    public String solution(String s) {
        String answer = "";
        
        // Ȧ���϶� 2/n + 1
        // ¦���϶� 2/n, 2/n + 1
        
        StringBuilder sb = new StringBuilder();
        int n = s.length();
        if(s.length()%2==0) {
        	sb.append(s.charAt(n/2-1));
        	sb.append(s.charAt(n/2));
        }
        else {
        	sb.append(s.charAt(n/2));
        }
        
        answer = sb.toString();
        return answer;
    }
}