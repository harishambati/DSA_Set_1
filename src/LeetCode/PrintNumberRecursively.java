package LeetCode;

public class PrintNumberRecursively 

{


	public static void main(String[] args) {
		// TODO Auto-generated method stub
			print(10);
	}

	
	public static void print(int n) 
	{
		System.out.print(n+" ");
			if(n >1 ) 
			{
			print(n-1);
				
			}
		
		
	}
		
}




