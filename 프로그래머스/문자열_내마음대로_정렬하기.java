import java.util.Arrays;

class 문자열_내마음대로_정렬하기 {
    public String[] solution(String[] strings, int n) {
        
        Arrays.sort(strings);
        
        char carr[] = new char[strings.length];
        
        for(int i=0; i<strings.length; i++) {
        	carr[i] = strings[i].charAt(n);
        }
        
        for(int i=0; i<strings.length-1; i++) {
        	for(int j=0; j<strings.length-1; j++) {
        		if(carr[j]>carr[j+1]) {
        			char tmp = carr[j];
        			carr[j] = carr[j+1];
        			carr[j+1] = tmp;
        			
        			String str = strings[j];
        			strings[j] = strings[j+1];
        			strings[j+1] = str;
        		}
        	}
        }
        
        return strings;
        
    }
}