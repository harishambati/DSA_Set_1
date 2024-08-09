package LeetCode;

public class goodSubArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A[] = {13, 16, 16, 15, 9, 16, 2, 7, 6, 17, 3, 9};
		
		
		System.out.println(returnGoodSubArrats(A, 65));
	}
	
	
	public static int returnGoodSubArrats(int[] A, int B) 
	{
		int good = 0;
		int prefixSum[] = new int[A.length];
		prefixSum[0] = A[0];
		
		
		for(int i = 1; i < A.length; i++) 
		{
			prefixSum[i] = prefixSum[i-1]+A[i];
		}
		
		
		for(int i = 0 ; i< A.length; i++) 
		{
			for(int j = i; j < A.length; j++) 
			{
				int sum = 0;
				boolean even = false;
				if(i==0) 
				{
					sum = prefixSum[j];
				}
				
				else 
				{
					sum = prefixSum[j] - prefixSum[i];
				}
				
				if((j - i +1)%2 == 0) 
				{
					even = true;
				}
				
				if(even) 
				{
					if(sum < B) 
					{
						good++;
					}
				}
				
				else 
				{
					if(sum > B) {
						good++;
					}
				}
			}
			
		}
		return good;
	}
	
	

}
