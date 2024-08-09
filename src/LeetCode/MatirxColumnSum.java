package LeetCode;

public class MatirxColumnSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] a = {{1,2,3,4}, {5,6,7,8}, {9,2,3,4}};
		columnSum(a);

	}

	
	public static void columnSum(int[][] a) {
		
		for(int i  = 0 ; i< a[0].length ; i++) {
			int sum = 0;
			for(int j = 0; j < a.length ; j++) {
				sum = sum + a[j][i];
				
			}
			System.out.print(sum+"\t");
			
		}
		
		
	}
	
}
