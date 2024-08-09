package LeetCode;

public class Kadanes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
		
		System.out.println(maxSubArray(nums));
		
	}

	
	
	 public static int maxSubArray(int[] nums) {
	        
	        int ans = nums[0];
	        int max = nums[0];

	        for(int i = 1; i < nums.length; i++){
	            if(max > 0)
	            {
	                max = max + nums[i];
	            }

	            else
	            {
	                max = nums[i];
	            }

	            if(max > ans){
	                ans = max;
	            }

	        }

	            return ans;
	    }
}
