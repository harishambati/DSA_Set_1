package LeetCode;

public class BInaryArrayReplaceOneZero {
	
	
	public static void main(String[] args) 
	{
		int[]  a = {1,1,1,0,1,1,0,1,1,1,1,0,0,1,1,0,1};
		
		System.out.println(BinaryArrayReplaceOneZero(a));
		
		
	}
	
	
	public static int BinaryArrayReplaceOneZero(int[] a) 
	{
		int l = 0;
		int r = 0;
		int long_length = 0 ;
		
		for(int i = 0 ; i < a.length; i++)
		{
			if(a[i] == 0) 
			{
				l = right(i, a);
				r = left(i, a);
				
				if(long_length < l + r +1 ) 
				{
					long_length = l+ r +1;
				}
			}
			
			
			
		}
	
			return long_length;
	}
	
	
	public static int left(int i, int a[]) 
	{
		int count = 0;
		for(int j = i -1 ; j >=0 ; j--) 
		{
			if(a[j] == 0) 
			{
				break;
			}
			count++;
		}
	
		return count;
	}
	
	public static int right(int i, int a[]) {
		
		int count = 0;
		for(int j = i + 1; j <a.length ; j++) 
		{
			if(a[j] == 0) {
				break;
			}
			count++;
		}
		
		return count;
		
		
	}
	
	
}
