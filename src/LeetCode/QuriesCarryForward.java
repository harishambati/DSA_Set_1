package LeetCode;

public class QuriesCarryForward {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] B = {{3,6,1},{2,7,3},{5,8,-4},{1,9,2}};
		int[] A = {0,0,0,0,0,0,0,0,0,0};
		int[] C = queries(A, B);
		for(int i = 0; i < C.length; i++ ) 
		{
			System.out.print(C[i] + ", ");
		}
		

	}
	
	
	public static int[] queries(int[] A, int[][] B) 
	{
		for(int i = 0 ; i < B.length ; i++) 
		{
			int s = B[i][0];
			int e = B[i][1];
			int v = B[i][2];
			
			A[s] = A[s] + v;
			if( e  <= (A.length -2)) 
			{
				A[e +1] = A[e+1] + v * -1;
			}
		}
		
		for(int i = 1 ; i < A.length ; i++) 
		{
			A[i] = A[i] + A[i - 1];
		}
		
		
		return A;
	}

}
