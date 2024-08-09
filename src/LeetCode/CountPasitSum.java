package LeetCode;
import java.util.HashMap;

public class CountPasitSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]A  = {10, 12, 10, 15, -1, 7, 6, 5, 4, 2, 1, 1, 1};
		System.out.println(countPairSum(A, 11));
	}
	
	
	
	public static int countPairSum(int[] A, int B) 
	{
		
		int count = 0;
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for(int i = 0; i < A.length ; i++) 
		{
			if(map.containsKey(B - A[i])) 
			{
			
				count  = count + map.get(B - A[i]);
				
			}
			
			if(map.containsKey(A[i])) 
			{
				map.put(A[i], map.get(A[i]) + 1);
			}
			
			else {
				map.put(A[i], 1);
			}
		}
		
		return count;
	}
	

}
