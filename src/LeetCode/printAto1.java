package LeetCode;

public class printAto1 {

	public static void main(String[] args)
	{
		printAto1(10);

	}

	static void printAto1(int A)
	{
		
		
		if(A == 1) 
		{
			System.out.println(A);
			return;
		}
		
		System.out.print(A + " ");
		printAto1(--A);
		
		
		
	}
	
}
