package LeetCode;

class _1493LeetCode {
	

	public static void main(String[] args) {
		
			int[] nums = {0,0,0};
			System.out.println(longestSubarray(nums));
	}
	
	
	
    public  static int longestSubarray(int[] nums) {
       
        int max = 0;
        int left = 0;
        int right = 0;

        for(int i  = 0; i< nums.length; i++){
            if(nums[i] == 0){
                left = calculateLeft(i, nums);
                right = calculateRight(i, nums);

                  if(max < (left + right )){
                max = left + right ;
              }
            }

       
        }

            return max;

    }


    public static int  calculateLeft(int i, int[] nums){
        int left = 0;
        for(int j  = i - 1 ; j >= 0; j--){
            if(nums[j] == 0){
                break;
            }
            left++;
        }
        return left;
    }

     public static int  calculateRight(int i, int[] nums){
        int right = 0;
        for(int j  = i + 1; j < nums.length; j++){
            if(nums[j] == 0){
                break;
            }
            right++;
        }

        return right;
    }
}
