package LeetCode;

public class Print1ToARecursive {

	public static void main(String[] args) {
		
		printI(1,5);
	}
	
	
	public static void printI(int i, int a) 
	{
		
		if(i == a) 
		{
			System.out.println(i + " ");
			return;
		}
		
		System.out.print(i + " ");
		printI(++i, a);
	}
	

}
