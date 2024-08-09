package LeetCode;

public class MaxNonNegativeArray {

	public static void main(String[] args) {
		int[]  A = {10, -1, 2, 3, -4, 100};
		maxSubArray(A);
	}
	
	
	public static int[] maxSubArray(int[] A) 
	{
		int l_right = 0;
		int l_left = 0;
		int l_sum = 0;
		int ans = 0;
		int g_right = 0;
		int g_left = 0;
		
		for(int i =0; i <A.length ; i++) 
		{
		
			if(A[i] > 0)
			{
				l_sum += A[i];
				
				if(i == A.length -1) {
					l_right = i;
				}
			}
			
			else
			{
				
				
				
				if(i == (A.length -1)) {
					l_right = i;
				}
				
				else {
					l_right = i -1;
				}
				
				if(l_sum > ans) 
				{
					ans = l_sum;
					g_right = l_right;
					g_left = l_left;
				}
				
				else if(l_sum == ans) 
				{
					
					if((g_right - g_left + 1) < (l_right - l_left + 1)) 
					{
						g_right = l_right;
						g_left = l_left;
					}
					
					else if((g_right - g_left + 1) == (l_right - l_left + 1) && g_left > l_left) 
					{
						g_right = l_right;
						g_left = l_left;
					
					}
					
				}
				l_sum = 0;
				l_left = i +1;
				
			}
		
		}
				
		return null;
	}

}
