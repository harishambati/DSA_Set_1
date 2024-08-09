package LeetCode;
import java.util.ArrayList;
import java.util.List;

public class TrappedWater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> A = new ArrayList<Integer>();
		A.add(0);
		A.add(1);
		A.add(0);
		A.add(2);
		A.add(1);
		A.add(0);
		A.add(1);
		A.add(3);
		A.add(2);
		A.add(1);
		A.add(2);
		A.add(1);
		
		System.out.println(trap(A));
	}
	
	
	
	 public static int trap(final List<Integer> A) {

	        int[] premax = new int[A.size()];
	        int[] suffixmax = new int[A.size()];

	        premax[0] = A.get(0);
	        suffixmax[A.size() -1]  = A.get(A.size() - 1);  

	        for(int i = 1 ; i< A.size(); i++){
	            if(A.get(i) > premax[i -1])
	            {
	                premax[i] = A.get(i);
	            }

	            else{
	                premax[i] = premax[i -1];
	            }
	        }

	        for(int i = A.size() -2 ; i >= 0; i--){
	            if(A.get(i) > suffixmax[i +1]){
	            	suffixmax[i] = A.get(i);
	            }

	            else{
	            	suffixmax[i] = suffixmax[i +1];
	            }
	        }
	        int sum = 0;
	        for(int i = 1 ; i< A.size() - 1; i++){
	                int low = premax[i -1] ;
	                int high = suffixmax[i+1];
	                int l_sum = 0;
	               
	                if(high > low){
	                    l_sum = low - A.get(i);
	                }

	                else{
	                    l_sum = high -A.get(i);
	                }

	                if(l_sum > 0){
	                    sum += l_sum;
	                }
	        }

	        return sum;

	    }
	

}
