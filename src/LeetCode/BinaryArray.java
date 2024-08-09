package LeetCode;

public class BinaryArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = {1,1,1,0,1,1,0,1,1,1,1,0,0,1,1,0,1};
		
		System.out.println(maxOneCount(A));
	}

	
	static int maxOneCount(int[] A) 
	{
		
		int max = 0;
		for(int i = 0; i < A.length; i++) {
			int j = i;
			int l_max = 0;
			int temp = 0;
			
			while(temp <=1 && j < A.length) 
			{
				if(A[j] == 0) {
					temp++;
					
				}
				l_max++;
				j++;
				
			}
			
			if(temp ==2) {
				l_max = l_max -1;
			}
			
			if(l_max> max) 
			{
				max = l_max;
			}
		}
		
		return max;
		
	}
	
	
}
