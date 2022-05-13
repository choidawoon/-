class 서울에서_김서방_찾기 {
    public String solution(String[] seoul) {
        String answer = "";
        
        int x = 0;
        int idx = 0;
        while(true) {
        	if(seoul[idx].equals("Kim")) {
        		x = idx;
        		break;
        	}
        	idx++;
        }
        
        answer = "김서방은 " + Integer.toString(x) + "에 있다";
        return answer;
    }
}