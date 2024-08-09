package LeetCode;
import java.util.HashMap;
import java.util.HashSet;

public class Sum0SubArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = {-1, 2, -1};
		System.out.println(get0SumSubArray(A));
		
	}
	
		
	static int get0SumSubArray(int[] a) 
	{
		
		
		int[] prefix = new int[a.length];
		prefix[0] = a[0];
		
		
		for(int i = 1; i < a.length ; i++) {
			prefix[i] = prefix[i - 1] + a[i];
		}
		
		
		int count = 0;
		
		HashSet<Integer> set = new HashSet<Integer>();
		
		if(a.length < 1) {
			return count;
		}
		
		set.add( a[0]);
		
		if(a[0] == 0) {
			count++;
		}
		
		for(int i = 1; i < a.length ; i++) 
		{
			int sum  = 	prefix[i];
			
			if(sum == 0) 
			{
				count++;
			}
			
			
			if(set.contains(sum)) {
				count++;
			}
			
			else 
			{
				set.add(sum);
			}
		}
		
		
		return count;
		
		
	}
	

}
