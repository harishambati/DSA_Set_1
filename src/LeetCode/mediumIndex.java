package LeetCode;

public class mediumIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a =  {-7, 1, 5, 2, -4, 3, 0};
		mediumIndex(a);
	}
	
	
	public static void mediumIndex(int[] a) 
	{
		int left_sum = 0;
		int right_sum = 0;
		for(int num: a) 
		{
			right_sum +=num;
		}
		
		for(int i = 0; i<a.length;i++) {
			if(i>0) {
				left_sum = left_sum + a[i-1];
			}
			
			right_sum = right_sum - a[i];
			
			System.out.println(left_sum + "  "+ right_sum );
			if(right_sum == left_sum) {
				System.out.println("Equi : " +i);
			}
		}
		
	}

}
