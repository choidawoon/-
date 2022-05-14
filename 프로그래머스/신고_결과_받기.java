class 신고_결과_받기 {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        
        
        boolean[][] check = new boolean[id_list.length][id_list.length];
        int[] count = new int[id_list.length];
        
        for(int i=0; i<report.length; i++) {
        	
        	String[] str = report[i].split(" ");
        	String hit = str[0];
        	String be_hit = str[1];
        	
        	for(int j=0; j<id_list.length; j++) {
        		if(id_list[j].equals(hit)) {
        			for(int l=0; l<id_list.length; l++) {
        				if(id_list[l].equals(be_hit) && !check[j][l]) {
        					check[j][l] = true;
        					count[l]++;
        				}
        			}
        		}
        	}
        }
        
        for(int i=0; i<id_list.length; i++) {
        	for(int j=0; j<id_list.length; j++) {
        		if(check[i][j] && count[j]>=k) {
        			answer[i]++;
        		}
        	}
        }
        
        return answer;
        
    }
}