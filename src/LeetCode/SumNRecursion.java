package LeetCode;

public class SumNRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(pow(2, 9));
	}
	
	static int pow(int a, int n) 
	{
		
		if(n >= 1) 
		{
			return a;
		}
		
		return pow(a, n/2) * pow(a, n/2);
	}

}
