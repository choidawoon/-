class 비밀지도 {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        
        char[][] map = new char[n][n];
        
        for(int i=0; i<n; i++) {
        	for(int j=0; j<n; j++) {
        		map[i][j] = ' ';
        	}
        }
        
        for(int i=0; i<n; i++) {
   	
        	for(int j=n-1; j>=0; j--) {
        		int tmp = (int)Math.pow(2, j);
        		   		
        		if(arr1[i]>=tmp) {
        			arr1[i] = arr1[i] - tmp;
        			map[i][n-1-j] = '#';
        		}
        		
        		if(arr2[i]>=tmp) {
        			arr2[i] = arr2[i] - tmp;
        			map[i][n-1-j] = '#';
        		}

        	}
        }
        
        for(int i=0; i<n; i++) {
        	StringBuilder sb = new StringBuilder();
        	for(int j=0; j<n; j++) {
        		sb.append(map[i][j]);
        	}
        	answer[i] = sb.toString();
        }
        
        return answer;
        
    }
}