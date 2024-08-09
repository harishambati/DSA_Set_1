package LeetCode;

	
	
	
	class _33LeetCode33 {
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int[] temp ={4,5,6,7,0,1,2};
				System.out.println(search(temp , 0));
		}
		
	    public static int search(int[] nums, int target) {

	        int i = 0 ;
	        int j = nums.length -1;

	        while(i <= j)
	        {
	            int mid = i + ((j -i)/2);
	            if(nums[mid]==target){
	                return mid;
	            }

	            else if((nums[i] <= nums[mid]) && ((nums[i] <= target) && (nums[mid] >= target) ) ){

	                    
	                            j = mid -1;
	                    
	            }

	            else {
	                
	                            i = mid  + 1;
	                
	            }
	           
	        }

	        return -1;


	    }
	}


