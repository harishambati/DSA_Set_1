package LeetCode;

public class _26leetcode {

	public static void main(String[] args) {
		
		int[] nums= {0,0,1,1,1,2,2,3,3,4};
		
		System.out.println(removeDuplicates(nums));
		
	}

	
	
	 public static int removeDuplicates(int[] nums) {
	        int length = 1;
	        int  current_pointer = 1;

	        if(nums.length < 1){
	            return nums.length;
	        }

	        for(int i = 1 ; i < nums.length; i++){
	            for(int j = i ; j < nums.length; j++){
	                if(nums[i - 1] < nums[j])
	                {
	                	 current_pointer = j +1;
	                     int temp = nums[i];
	                     nums[i] = nums[j];
	                     nums[j] = temp; 
	                     length++;
	                     break;
	                }
	            }
	            
	        }
	         return length;

	    }
	
}
