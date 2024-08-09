package LeetCode;



class _42LeetCode {
	
public static void main(String[] args) {
		
		int[] nums = {4,2,0,3,2,5};
		int ans  = trap(nums);
			System.out.println(ans);
	}
	
	
	
	
    public  static int trap(int[] height) {

        int[] premax = new int[height.length];
        int[] postmax = new int[height.length];

        premax[0] = height[0];

        for (int i = 1; i < height.length; i++) {
            if (height[i] > premax[i - 1]) {
                premax[i] = height[i];
            }

            else {
                premax[i] = premax[i - 1];
            }
        }

        postmax[height.length - 1] = height[height.length - 1];

        for (int i = height.length - 2; i >= 0; i--) {
            if (height[i] > postmax[i + 1]) {
                postmax[i] = height[i];
            }

            else {
                postmax[i] = postmax[i + 1];
            }
        }

        int ans = 0;
        for (int i = 1; i <= height.length - 2; i++) {
            int local = 0;
            if (premax[i - 1] >= postmax[i + 1]) {
                local =  postmax[i + 1];
            }

            else {
                local =  premax[i - 1];
            }

            
            
         
            	local = local - height[i];
            		
            	if(local > 0) {
            		ans = ans + local;
            	}
            
            
            
        }

        return ans;
    }
}