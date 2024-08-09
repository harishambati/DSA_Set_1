package LeetCode;
import java.util.HashMap;

public class LeetCode238 {

public static void main(String[] args) {
		
		int[] nums = {1,2,3,4};
		int[] ans  = productExceptSelf(nums);
			System.out.println(ans);
	}
	
	
	
public static int[] productExceptSelf(int[] nums) {

    int ans[] = new int[nums.length];
    int prefix[] = new int[nums.length];  
    int postfix[] = new int[nums.length];
    int left = 0;
    int right = 0;
    prefix[0] = nums[0];
    postfix[nums.length - 1] = nums[nums.length - 1];
   
    for(int i = 1; i < nums.length; i++ ){
        prefix[i] = nums[i] * prefix[i -1];
    }

    for(int i = nums.length -2 ; i >= 0; i-- ){
        postfix[i] = nums[i] * postfix[i + 1];
    }
   
    for(int i = 0; i < nums.length; i++){
        if(i == 0){
            left = 1;
        }

        else{
            left = prefix[i -1];
        }

        if(i == nums.length - 1){
            right = 1;
        }

        else{
            right = postfix[i+1];
        }

        ans[i] = left * right;
    }

    return ans;
   
}
	
	

}
