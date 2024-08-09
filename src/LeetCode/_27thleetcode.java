package LeetCode;

public class _27thleetcode {

	
public static void main(String[] args) {
		
		int[] nums= {0,1,2,2,3,0,4,2};
		
		System.out.println(removeElement(nums, 2));
		
	}
	
	
	
	
	
	public static int removeElement(int[] nums, int val) {
        int size = 0;
        int front_pointer = 0;
        int back_pointer = nums.length - 1 ;
        while(front_pointer < back_pointer){
            if(nums[front_pointer] == val)
            {
                back_pointer = getBackPointer(back_pointer, val, nums);
                int temp = nums[back_pointer];
                nums[back_pointer] = nums[front_pointer];
                nums[front_pointer] = temp;
                back_pointer--;

            }
            front_pointer++;
            size++;
            
        }

        return nums.length - front_pointer -1;


    }


    static int getBackPointer(int back_pointer, int val , int nums[])
    {
            for(int j = back_pointer ; j > 0 ; j--){
                if(nums[j] != val){
                    return j;
                }
            }

            return back_pointer;
    }
	
}
