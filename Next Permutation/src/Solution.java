
public class Solution {
	public static void nextPermutation(int[] nums) {
        int len = nums.length;
        int i = 0,ti = 0;
        int j = 0,tj = 0;
        int mark = 0;
        int temp = 0;
        int cnt = 0;
        for(i = len - 1; i >= 0; i--) {
        	for(j = len - 1; j > i; j--) {
        		if(nums[j] > nums[i]) {
        			temp = nums[j];
        			nums[j] = nums[i];
        			nums[i] = temp;
        			mark = 1;
        			break;
        		}
        	}
        	if(mark == 1)
    			break;
        }
        if(mark == 1) {
        	for(ti = i + 1; ti < len; ti++,cnt++) {
    			for(tj = i + 1; tj < len - cnt - 1; tj++) {
    				if(nums[tj] > nums[tj+1]) {
            			temp = nums[tj];
            			nums[tj] = nums[tj+1];
            			nums[tj+1] = temp;
            		}
    			}
    		}
        }
        else if(mark == 0) {
    		for(i = 0; i < len; i++) {
    			for(j = 0; j < len - i - 1; j++) {
    				if(nums[j] > nums[j+1]) {
            			temp = nums[j];
            			nums[j] = nums[j+1];
            			nums[j+1] = temp;
            		}
    			}
    		}
    	}
    }
	public static void main(String[] args) {
		int[] nums = {2,3,1};
		nextPermutation(nums);
		for(int i : nums)
			System.out.print(i);
	}

}
