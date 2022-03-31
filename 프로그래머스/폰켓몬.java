import java.util.ArrayList;
import java.util.Arrays;

class ÆùÄÏ¸ó {
    public int solution(int[] nums) {
        int answer = 0;
        
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i=0; i<nums.length; i++) {
        	if(!list.contains(nums[i]))
        		list.add(nums[i]);
        }
        
        answer = list.size();
        
        if(answer>=nums.length/2)
        	answer = nums.length/2;
        
        return answer;
    }
}