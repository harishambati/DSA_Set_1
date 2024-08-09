package LeetCode;

public class KadanesAlgorithm {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int[] a = {3,4,2,-14,16,-20,5};
		System.out.println(kadnes(a));
	}
	
	
	
	public static int kadnes(int[] a) 
	{
		int sum = 0;
		int ans = -1;
		
		for(int i = 0; i < a.length; i++) 
		{
			if(sum < 0) 
			{
				sum = 0;
			}
			
			sum =  sum + a[i];
			
			if(sum > ans) {
				ans = sum;
			}
		}
		
		return ans;
	}
}
