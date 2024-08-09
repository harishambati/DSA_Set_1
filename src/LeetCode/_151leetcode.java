package LeetCode;
import java.util.HashMap;

public class _151leetcode {

	public static void main(String[] args) {
		
		int[] nums = {2,2,2,3,1,1,4,1};
		int ans  = maxOperations(nums, 4);
			System.out.println(ans);
	}
	
	
	
	public  static int maxOperations(int[] nums, int k) {

        int maxOps = 0;
        HashMap<Integer, Integer> s = new HashMap<>();

        for(int i = 0; i < nums.length; i++)
        {
            int x = k - nums[i];

            if(s.containsKey(x))
            {
                if(s.get(x) >= 1)
                {
                    s.put(x, s.get(x) - 1);
                    maxOps++;
                }

                else 
            {
                	if(s.containsKey(nums[i]))
                	{
                		s.put(nums[i], s.get(nums[i]) + 1);
                        
                	}
            }
                      
            }

            else
            {
                  s.put(nums[i], 1);
            }

        }

        return maxOps;

       
    }
	
	

}
