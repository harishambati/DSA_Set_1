package LeetCode;
import java.util.PriorityQueue;
import java.util.Stack;

class _735Asteroid {
	
	
	public static void main(String[] args) {
			
		int[] tmep = {3,2,1,5,6,4};
		
		System.out.println(findKthLargest(tmep, 2));
	}
	
	
    public static int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> queue=new PriorityQueue<>();  
     
       for(int i: nums){
           queue.add(i);
       }

       for(int i = 0; i < k-1; i++){
           queue.remove();
       }

       return queue.peek();
     
     }
}
